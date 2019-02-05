package com.OOPsConcept2;

public class SSBCBankClass implements USBankInterface, BrazilInterface {
// mutilpe inheritnace by using interface;
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("credit -SSBCBank");
	}

	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("debit -SSBCBank");
	}

	public void transfer() {
		// TODO Auto-generated method stub
		System.out.println("transfer -SSBCBank");
	}

	public void carLoan() {
		System.out.println("Carloan");
	}

	public void mutual() {
		// TODO Auto-generated method stub
		System.out.println("mutual");
	}
}
