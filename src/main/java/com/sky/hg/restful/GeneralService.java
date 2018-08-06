package com.sky.hg.restful;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.junit.Test;

import com.sky.hg.Constants;
import com.sky.hg.PropUtils;
import com.sky.hg.StringUtils;
import com.sky.hg.entity.CebPayCountTotalEntity;

@Path("/general")
public class GeneralService extends QueryTemplate{
	
	@Path("getCount")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public int getCount(@QueryParam("table") String table){
		String sql = "select count(1) from "+PropUtils.tableProp.getProperty(table);
		return this.queryCount(sql);
	}
	
//	@Path("getAll")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<CebPayCountTotalEntity> getAll(){
//		String sql = "select * from ceb_pay_count_total order by actural_paid desc";
//		List list = queryList(sql);
//		return list;
//	}
	
	@Path("getList")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Map getList(@QueryParam("table") String table,
													@QueryParam("pageFlag") int pageFlag,@QueryParam("pageNum") int pageNum,@QueryParam("pageCount") int pageCount,
													@QueryParam("whereFlag") int whereFlag,@QueryParam("payerId") String payerId,@QueryParam("payerIdFlag") int payerIdFlag,
													@QueryParam("ageSeg") String ageSeg,
													@QueryParam("buyerNameSeg") String buyerNameSeg,
													@QueryParam("buyerTelephoneSeg") String buyerTelephoneSeg,
													@QueryParam("consigneeTelephoneSeg") String consigneeTelephoneSeg,
													@QueryParam("consigneeAddressSeg") String consigneeAddressSeg,
													@QueryParam("buyerIdNumberSeg") String buyerIdNumberSeg,
													@QueryParam("ebcKeyword") String ebcKeyword,
													@QueryParam("ebpKeyword") String ebpKeyword
													){
		
		//查询数据列表
		//组织sql	
		String sql = getSql4List(table,pageFlag,pageNum,pageCount,whereFlag,payerId,payerIdFlag,
				ageSeg,buyerNameSeg,buyerTelephoneSeg,consigneeTelephoneSeg,consigneeAddressSeg,buyerIdNumberSeg,ebcKeyword,ebpKeyword);
		List list = queryList(sql,table);
		
		//查询记录数
		
		String countSql = "";
		if(sql.contains("order by")){
			countSql = sql.substring(0, sql.indexOf("order")-1).replace("*", "count(1)");
		}else if(sql.contains("limit")){
			countSql = sql.substring(0, sql.indexOf("limit")-1).replace("*", "count(1)");
		}else{
			countSql = sql.replace("*", "count(1)");
		}
		
		int count = this.queryCount(countSql);
		
		Map rtnMap = new HashMap();
		rtnMap.put("totalCount", count);
		rtnMap.put("list", list);
		
		return rtnMap;
	}
	
	private String getSql4List(String table, int pageFlag, int pageNum, int pageCount, int whereFlag, String payerId,
			int payerIdFlag, String ageSeg, String buyerNameSeg, String buyerTelephoneSeg, String consigneeTelephoneSeg, String consigneeAddressSeg, String buyerIdNumberSeg,String ebcKeyword,String ebpKeyword) {
		
		String tableName = PropUtils.tableProp.getProperty(table);
		String orderStr = PropUtils.tableProp.getProperty(table+".order")==null?"":PropUtils.tableProp.getProperty(table+".order");
		StringBuffer sb = new StringBuffer();
		sb.append("select * from "+tableName+" where 1=1");
		//拼接条件
		if(Constants.WHERE_FLAG_Y == whereFlag){//如果是条件查询
			if(!StringUtils.isEmpty(payerId)){
				if(Constants.LIKE_FLAG_Y == payerIdFlag)//如果是模糊查询
					sb.append(" and payer_id_number like '%"+payerId+"%'");
				else
					sb.append(" and payer_id_number='"+payerId+"'");
			}
			
			if(!StringUtils.isEmpty(ageSeg))
				sb.append(" and age_seg ='"+ageSeg+"'");
			if(!StringUtils.isEmpty(buyerNameSeg))
				sb.append(" and buyer_name_seg ='"+buyerNameSeg+"'");
			if(!StringUtils.isEmpty(buyerTelephoneSeg))
				sb.append(" and buyer_telephone_seg ='"+buyerTelephoneSeg+"'");
			if(!StringUtils.isEmpty(consigneeTelephoneSeg))
				sb.append(" and consignee_telephone_seg ='"+consigneeTelephoneSeg+"'");
			if(!StringUtils.isEmpty(consigneeAddressSeg))
				sb.append(" and consignee_address_seg ='"+consigneeAddressSeg+"'");
			if(!StringUtils.isEmpty(buyerIdNumberSeg))
				sb.append(" and buyer_id_number_seg ='"+buyerIdNumberSeg+"'");
			if(!StringUtils.isEmpty(ebcKeyword)){
				sb.append(" and (ebc_code like '%"+ebcKeyword+"%' or ebc_name like'%"+ebcKeyword+"%')");
			}
			if(!StringUtils.isEmpty(ebpKeyword)){
				sb.append(" and (ebp_code like '%"+ebpKeyword+"%' or ebp_name like'%"+ebpKeyword+"%')");
			}
		}
		
		//拼接排序
		sb.append(" "+orderStr);
		
		//拼接分页
		if(Constants.PAGE_FLAG_Y == pageFlag){
			//计算起始索引
			int start = (pageNum-1)*pageCount;
			sb.append(" limit "+start+","+pageCount);
		}
		
		return sb.toString();
	}

//	@Path("getByIdentity")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<CebPayCountTotalEntity> getByIdentity(@QueryParam("identity") String identity){
//		String sql = "select * from ceb_pay_count_total where payer_id_number like '%"+identity+"%'";
//		List list = queryList(sql);
//		return list;
//	}
	
	
//	@Override
//	public Object getEntity(ResultSet rs) throws SQLException {
//		CebPayCountTotalEntity entity = new CebPayCountTotalEntity();
//		entity.setPayerIdNumber(rs.getString(1));
//		entity.setAreaName(rs.getString(2));
//		entity.setEbcNum(rs.getInt(3));
//		entity.setBuyerIdNumberNum(rs.getInt(4));
//		entity.setOrdNoNum(rs.getInt(5));
//		entity.setPayAmount(rs.getDouble(6));
//		entity.setActuralPaid(rs.getDouble(7));
//		return entity;
//	}
	
}
