package DTO;

public class OrderCustomer {
    private String name;
    private int orderId;
    private double amount;
    private String marker;
	public OrderCustomer(String name, int orderId, double amount, String marker) {
		super();
		this.name = name;
		this.orderId = orderId;
		this.amount = amount;
		this.marker = marker;
	}
	
	public OrderCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getMarker() {
		return marker;
	}
	public void setMarker(String marker) {
		this.marker = marker;
	}
    
}
