package Entity;

public class Order {
    private int oderId;
    private int customerId;
    private int carId;
    private double amount;
    private double salePrice;
    private String orderDate;
    private String deliveryDate;
    private String deliveryAddress;
    private int status;
    private String note;
	public Order(int oderId, int customerId, int carId, double amount, double salePrice, String orderDate,
			String deliveryDate, String deliveryAddress, int status, String note) {
		super();
		this.oderId = oderId;
		this.customerId = customerId;
		this.carId = carId;
		this.amount = amount;
		this.salePrice = salePrice;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.deliveryAddress = deliveryAddress;
		this.status = status;
		this.note = note;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOderId() {
		return oderId;
	}
	public void setOderId(int oderId) {
		this.oderId = oderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
    
}
