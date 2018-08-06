package com.sky.hg;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropUtils {
	
	public static Properties tableProp = new Properties();
	public static Properties attrColumnProp = new Properties();
	
	static{
		InputStream tableIn = PropUtils.class.getResourceAsStream("/table.properties");
		InputStream acmIn = PropUtils.class.getResourceAsStream("/attr_column_map.properties");
		try {
			tableProp.load(tableIn);
			attrColumnProp.load(acmIn);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
