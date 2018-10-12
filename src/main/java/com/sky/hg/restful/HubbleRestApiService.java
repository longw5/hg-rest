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

import com.sky.hg.HubbleConnUtils;
import com.sky.hg.StringUtils;

@Path("/hubble")
public class HubbleRestApiService {

	@GET
	@Path("/restful/query")
	@Produces(MediaType.APPLICATION_JSON)
	public Map query(@QueryParam("type") String type, @QueryParam("key1") String key1,
			@QueryParam("key2") String key2, @QueryParam("key3") String key3) {

		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "";
		Map rtnMap = new HashMap();
		if ("payer".equals(type) && (!"".equals(key1)) && (key1 != null)) {
			sql = "select * from base_node_payer_info where payer_id_number='"+key1+"' limit 1";
			executQuery(sql, rtnMap, type);
		} else if ("buyer".equals(type) && (!"".equals(key1)) && (key1 != null)) {
			sql = "select * from base_node_buyer_info where buyer_id_number='"+key1+"' limit 1";
			executQuery(sql, rtnMap, type);
		} else if ("ebc".equals(type) && (!"".equals(key1)) && (key1 != null)) {
			sql = "select * from base_node_ebc_info where ebc_code='"+key1+"' limit 1";
			executQuery(sql, rtnMap, type);
		} else if ("tele".equals(type) && (!"".equals(key1)) && (key1 != null)) {
			sql = "select * from base_all_data_2 where buyer_telephone='"+key1+"' limit 10000";
			executList(sql, rtnMap, type);
		}
		System.out.println("sql===========>" + sql);
		return rtnMap;
	}
	
	@GET
	@Path("/restful/list")
	@Produces(MediaType.APPLICATION_JSON)
	public Map list(@QueryParam("type") String type, @QueryParam("key1") String key1,
			@QueryParam("key2") String key2, @QueryParam("key3") String key3) {

		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "";
		Map rtnMap = new HashMap();
		if ("payer".equals(type) && (!"".equals(key1)) && (key1 != null)) {
			sql = "select * from base_all_data_2 where payer_id_number='"+key1+"' limit 10000";
			executList(sql, rtnMap, type);
		} else if ("buyer".equals(type) && (!"".equals(key1)) && (key1 != null)) {
			sql = "select * from base_all_data_2 where buyer_id_number='"+key1+"' limit 10000";
			executList(sql, rtnMap, type);
		} else if ("ebc".equals(type) && (!"".equals(key1)) && (key1 != null)) {
			sql = "select * from base_all_data_2 where ebc_code='"+key1+"' limit 10000";
			executList(sql, rtnMap, type);
		}
		System.out.println("sql===========>" + sql);
		return rtnMap;
	}
	
	private void executList(String sql, Map rtnMap, String type) {
		PreparedStatement ps;
		ResultSet rs;
		Connection conn = HubbleConnUtils.getConnection();
		List<Map> list = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				HashMap<Object, Object> map = new HashMap<>();
				map.put("app_time", rs.getString("app_time"));
				map.put("order_no", rs.getString("order_no"));
				map.put("ebp_code", rs.getString("ebp_code"));
				map.put("ebp_name", rs.getString("ebp_name"));
				map.put("ebc_code", rs.getString("ebc_code"));
				map.put("ebc_name", rs.getString("ebc_name"));
				map.put("logistics_no", rs.getString("logistics_no"));
				map.put("logistics_code", rs.getString("logistics_code"));
				map.put("logistics_name", rs.getString("logistics_name"));
				map.put("buyer_id_number", rs.getString("buyer_id_number"));
				map.put("_buyer_id_number", StringUtils.convertIdNumber(rs.getString("buyer_id_number")));
				map.put("buyer_name", rs.getString("buyer_name"));
				map.put("buyer_age", rs.getString("buyer_age"));
				map.put("buyer_telephone", rs.getString("buyer_telephone"));
				map.put("buyer_area_name", rs.getString("buyer_area_name"));
				map.put("consignee", rs.getString("consignee"));
				map.put("consignee_telephone", rs.getString("consignee_telephone"));
				map.put("consignee_address", rs.getString("consignee_address"));
				map.put("payer_id_number", rs.getString("payer_id_number"));
				map.put("_payer_id_number", StringUtils.convertIdNumber(rs.getString("payer_id_number")));
				map.put("payer_name", rs.getString("payer_name"));
				map.put("payer_age", rs.getString("payer_age"));
				map.put("payer_telephone", rs.getString("payer_telephone"));
				map.put("payer_area_name", rs.getString("payer_area_name"));
				map.put("actural_paid", rs.getString("actural_paid"));
				map.put("amount_paid", rs.getString("amount_paid"));
				list.add(map);
			}
			rtnMap.put("success", "true");
			rtnMap.put("list", list);
			HubbleConnUtils.release(conn, ps, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void executQuery(String sql, Map rtnMap, String type) {
		PreparedStatement ps;
		ResultSet rs;
		Connection conn = HubbleConnUtils.getConnection();
		List<Map> list = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			if("payer".equals(type)){
				while (rs.next()) {
					HashMap<Object, Object> map = new HashMap<>();
					map.put("payer_id_number", rs.getString("payer_id_number"));
					map.put("_payer_id_number", StringUtils.convertIdNumber(rs.getString("payer_id_number")));
					map.put("area_name", rs.getString("area_name"));
					map.put("payer_telephone", rs.getString("payer_telephone"));
					map.put("payer_name", rs.getString("payer_name"));
					map.put("buyer_id_number_count", rs.getString("buyer_id_number_count"));
					map.put("buyer_id_number_fx_count", rs.getString("buyer_id_number_fx_count"));
					map.put("order_no_count", rs.getString("order_no_count"));
					map.put("order_no_fx_count", rs.getString("order_no_fx_count"));
					map.put("actural_paid_sum", rs.getString("actural_paid_sum"));
					map.put("actural_paid_fx_sum", rs.getString("actural_paid_fx_sum"));
					map.put("ebc_code_count", rs.getString("ebc_code_count"));
					list.add(map);
				}
			}else if("buyer".equals(type)){
				while (rs.next()) {
					HashMap<Object, Object> map = new HashMap<>();
					map.put("buyer_id_number", rs.getString("buyer_id_number"));
					map.put("_buyer_id_number", StringUtils.convertIdNumber(rs.getString("buyer_id_number")));
					map.put("buyer_telephone", rs.getString("buyer_telephone"));
					map.put("buyer_name", rs.getString("buyer_name"));
					map.put("buyer_age", rs.getString("buyer_age"));
					map.put("buyer_name_num", rs.getString("buyer_name_num"));
					map.put("buyer_telephone_num", rs.getString("buyer_telephone_num"));
					map.put("buyer_id_number_num", rs.getString("buyer_id_number_num"));
					map.put("order_num", rs.getString("order_num"));
					map.put("actural_paid", rs.getString("actural_paid"));
					map.put("consignee_telephone_num", rs.getString("consignee_telephone_num"));
					map.put("consignee_address_num", rs.getString("consignee_address_num"));
					map.put("fx_flag", rs.getString("fx_flag"));
					list.add(map);
				}
			}else if("ebc".equals(type)){
				while (rs.next()) {
					HashMap<Object, Object> map = new HashMap<>();
					map.put("ebc_code", rs.getString("ebc_code"));
					map.put("ebc_name", rs.getString("ebc_name"));
					map.put("buyer_id_number_count", rs.getString("buyer_id_number_count"));
					map.put("buyer_id_number_fx_count", rs.getString("buyer_id_number_fx_count"));
					map.put("order_no_count", rs.getString("order_no_count"));
					map.put("order_no_fx_count", rs.getString("order_no_fx_count"));
					map.put("actural_paid_sum", rs.getString("actural_paid_sum"));
					map.put("actural_paid_fx_sum", rs.getString("actural_paid_fx_sum"));
					list.add(map);
				}
			}
			rtnMap.put("success", "true");
			rtnMap.put("list", list);
			HubbleConnUtils.release(conn, ps, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
