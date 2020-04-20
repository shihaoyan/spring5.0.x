package com.shy.test;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 石皓岩
 * @create 2020-03-08 11:18
 * 描述：
 */
public class DateTest {
	@Test
	public void test(){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String format = simpleDateFormat.format(new Date());
		System.out.println(format);
	}
}
