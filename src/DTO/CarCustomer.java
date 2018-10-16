package DTO;

public class CarCustomer {
     private String name;
     private int amount;
	public CarCustomer(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public CarCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
     
}
