package car_Dealership;

public class Delearship {

	public static void main(String[] args) {

		// Customer 1 purchasing AUDI

		Customer customer1 = new Customer();
		customer1.setName("Romit");
		customer1.setAddress("101 Main Street...");
		customer1.setCashOnHand(55100);

		Vehicle vehicle = new Vehicle("Audi", "A5", 45000);

		Employee emp = new Employee();

		customer1.purchaseCar(vehicle, emp, false);
		
		
		

		// Customer 2 purchasing Ranger Rover
		
		Customer customer2 = new Customer();
		customer2.setName("JOHN");
		customer2.setAddress("123 any street");
		customer2.setCashOnHand(100000);

		Vehicle car = new Vehicle("Ranger Rover", "Land", 90000);

		Employee emp2 = new Employee();

		customer2.purchaseCar(car, emp2, false);
		
		
		
	
		// Comparing if it returns true for the same vehicle
		// It should be true because of overriding the equals method in vehicle.
		Vehicle car1 = new Vehicle("Ranger Rover", "Land", 90000);
		Vehicle car2 = new Vehicle("Ranger Rover", "Land", 90000);
		
		boolean value = car1.equals(car2);
		System.out.println(value);
		
	}
}
