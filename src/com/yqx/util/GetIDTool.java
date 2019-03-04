package com.yqx.util;

import java.util.UUID;

public class GetIDTool {
	
	public static String getUUID() {
		String ids = UUID.randomUUID().toString().replace("-", "");
		return ids;
	}
	
}
