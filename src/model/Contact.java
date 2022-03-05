package model;

public class Contact {
	
	private String date;
	private String income;
	private String expenses;
	/**
	 * @param address
	 * @param income 
	 * @param expenses 
	 */
	public Contact( String date, String income, String expenses) {
		this.date = date;
		this.income = income;
		this.expenses = expenses;
	}
	/**
	 * @return the address
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param address the address to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @return the income
	 */
	public String getIncome() {
		return income;
	}
	/**
	 * @param income the income to set
	 */
	public void setIncome(String income) {
		this.income = income;
	}
	/**
	 * @return the expenses
	 */
	public String getExpenses() {
		return expenses;
	}
	/**
	 * @param expenses the expenses to set
	 */
	public void setExpenses(String expenses) {
		this.expenses = expenses;
	}
}