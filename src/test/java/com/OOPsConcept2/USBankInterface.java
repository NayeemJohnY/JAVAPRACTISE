package com.OOPsConcept2;

public interface USBankInterface {
	int minBal = 10;

	public void credit();

	public void debit();

	public void transfer();
	//only method declaration no method body
	// vars are default static in nature
	// vars value will not change
	// no static methods
	// no main method in Interface
	// we cannot create the object of Interface-Abstract in nature
}
