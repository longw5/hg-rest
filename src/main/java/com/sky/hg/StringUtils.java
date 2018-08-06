package com.sky.hg;

public class StringUtils {
	
	/**
	 * ÅÐ¶Ï×Ö·û´®ÊÇ·ñÎª¿Õ
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		if(str == null){
			return true;
		}else{
			return str.trim().length() == 0;
		}
	}
	
	public static String convertIdNumber(String idNumber){
		if(!StringUtils.isEmpty(idNumber)){
			if(idNumber.length() == 18)
				return new StringBuilder(idNumber).replace(6, 14, "********").toString();
			else if(idNumber.length() == 15)
				return new StringBuilder(idNumber).replace(6, 12, "******").toString();
		}
		
		return idNumber;
	}
	
	public static void main(String[] args) {
//		String s = "select * from ceb_pay_buyer_info where 1=1 order by actural_paid desc limit 0,10";
//		
//		String s1 = s.substring(0, s.indexOf("limit")-1).replace("*", "count(1)");
//		System.out.println(s1);
		
		String id = "142733198611161810";
		
		String id1 = "142733861116123";
		String id2 = "14273386111";
		
		System.out.println(convertIdNumber(id));
		System.out.println(convertIdNumber(id1));
		System.out.println(convertIdNumber(id2));
		
		
	}
}
