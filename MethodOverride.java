package org.college;

public class MethodOverride {

	public static void main(String[] args) 
	{
		AxisBank axis=new AxisBank();
		BankInfo bank=new BankInfo();
		axis.deposit();
		bank.deposit();
		bank.saving();
		bank.fixed();
		

	}

}
