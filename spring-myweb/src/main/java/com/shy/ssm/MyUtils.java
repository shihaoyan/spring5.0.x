package com.shy.ssm;

import java.util.UUID;

/**
 * @author 石皓岩
 * @create 2020-03-09 21:13
 * 描述：
 */
public class MyUtils {
	public static String getRandomName(String fileName){
		int index=fileName.lastIndexOf(".");
		String houzhui=fileName.substring(index);//获取后缀名
		String uuidFileName= UUID.randomUUID().toString().replace("-","")+houzhui;
		return uuidFileName;
	}
}
