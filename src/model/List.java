package model;

import java.util.ArrayList;

public class List {
	
	private ArrayList<Contact> registerBank;

	
	/**
	 * @param registerBank
	 */
	public List() {
		registerBank = new ArrayList<Contact>();
	}
	
	
	public void addMonto(String income, String expenses, String date) {
		
		Contact contact = new Contact(income, expenses, date);
		
		registerBank.add(contact);
	}
	
	/**
	 * @return the registerBank
	 */
	public ArrayList<Contact> getRegisterBank() {
		return registerBank;
	}

	/**
	 * @param registerBank the registerBank to set
	 */
	public void setRegisterBank(ArrayList<Contact> registerBank) {
		this.registerBank = registerBank;
	}


}
