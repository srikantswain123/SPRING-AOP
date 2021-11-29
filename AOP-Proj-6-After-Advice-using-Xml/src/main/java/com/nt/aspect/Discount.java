package com.nt.aspect;

import java.io.FileWriter;

import org.aspectj.lang.JoinPoint;

public class Discount {
	public void cupon(JoinPoint jp,float amount)throws Throwable {
		String msg="";
		if(amount<10000)
			msg="you have 5% discount on next shooping";
		else if(amount<20000)
			msg="you have 10% discount on next shooping";
		else if(amount<30000)
			msg="you have 10% discount on next shooping";
		FileWriter writer=new FileWriter("D:/cupon.txt");
		writer.write(msg);
		writer.flush();
		writer.close();
	}//method

}//class
