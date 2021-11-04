package com.jn.mybatisPlus;

import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
@MapperScan("com.jn.mybatisplus.mapper")
public class MybatisPlusApplication {

	private static String scan(String tip){
		Scanner scan=new Scanner(System.in);//获取键盘输入流
		StringBuilder builder=new StringBuilder();
		builder.append("请输入"+tip+":");
		System.out.println(builder.toString());
		if(scan.hasNext()){
			String str=scan.next();
			if(StringUtils.isNotBlank(str)){
				return str;
			}
		}
		throw new MybatisPlusException("请输入正确的" + tip + "！");
	}

	public static void main(String[] args) {
//		AutoGenerator mpg = new AutoGenerator();
		scan("");

//		SpringApplication.run(MybatisPlusApplication.class, args);
	}

}
