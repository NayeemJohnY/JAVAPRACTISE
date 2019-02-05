package com.OOPsConcept2;

public class TestSSBCBank {
	public static void main(String[] args) {
		 SSBCBankClass sb= new SSBCBankClass();
		 sb.credit();
		 sb.debit();
		 sb.carLoan();
		 sb.transfer();
		 System.out.println(sb.minBal);
		// sb.minBal=45;- final
		 
		 System.out.println("***********");
		 USBankInterface us= new SSBCBankClass();//dynamic polymorphism
		 us.credit();
		 us.debit();
		 us.transfer();
		
		 
	}

}
