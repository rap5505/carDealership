package car_Dealership;

public class Customer {

	private String name;
	private String address;
	private int cashOnHand;

	// Getters and Setters for customer!

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address = address + "Dealership";
		this.address = address;
	}

	public int getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(int cashOnHand) {
		cashOnHand += 500;
		this.cashOnHand = cashOnHand;
	}

	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		emp.handleCustomer(this, finance, vehicle);
	}

}
