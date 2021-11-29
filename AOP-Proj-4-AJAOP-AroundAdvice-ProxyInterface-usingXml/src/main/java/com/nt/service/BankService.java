package com.nt.service;

public final class BankService implements IBankService  {
	public float simpleIntrest(float amt,float intrest,int month) {
		return (amt*intrest*month)/100;
	}
	
	
	public float compoundIntrest(float amt,float intrest,int month) {
		return (float)(amt*Math.pow(1+intrest/100, month))-amt;
	}
	

}
