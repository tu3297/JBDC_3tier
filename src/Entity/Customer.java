package Entity;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerPhone;
    private String customerEmail;
    private String CustomerAddress;
    private String CustomerNote;
	public Customer(int customerId, String customerName, String customerPhone, String customerEmail,
			String customerAddress, String customerNote) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
		this.customerEmail = customerEmail;
		CustomerAddress = customerAddress;
		CustomerNote = customerNote;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerAddress() {
		return CustomerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
	public String getCustomerNote() {
		return CustomerNote;
	}
	public void setCustomerNote(String customerNote) {
		CustomerNote = customerNote;
	}
    
    
}
