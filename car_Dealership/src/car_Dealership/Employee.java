package car_Dealership;

public class Employee {

	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
		if (finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust, loanAmount);
		} else if (vehicle.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust, vehicle);
		} else {
			System.out.println("You will need more money to purchase vehicle: " + vehicle.getMake());
		}
	}

	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Ran Credit history for customer....");
		System.out.println("Customer has been approved to purchase the vehicle");
	}

	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("Customer purchased the vehicle: " + vehicle + "For the price " + vehicle.getPrice());
		;
	}
}
