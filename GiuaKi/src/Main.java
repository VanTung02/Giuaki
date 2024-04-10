public class Main {
public static void main(String[] args) {
VehicleManagement vehicleManagement = new VehicleManagement();
	car car3 = new car("c1", "Toyota", 2020, 40000, "Green", 4, "Electric");
    car car1 = new car("C1", "Toyota", 2020, 50000, "Red", 5, "Gas");
    car car2 = new car("C2", "Honda", 2019, 40000, "Blue", 4, "Electric");
    motorbike motorbike2 = new motorbike("M3", "Suzuki", 2019, 60000, "red");
    motorbike motorbike1 = new motorbike("M1", "Yamaha", 2021, 20000, "Black");
    Truck truck1 = new Truck("T1", "Volvo", 2018, 80000,"Yellow");

    vehicleManagement.addVehicle(car3);
    vehicleManagement.addVehicle(car2);
    vehicleManagement.addVehicle(car1);
    vehicleManagement.addVehicle(motorbike1);
    vehicleManagement.addVehicle(motorbike2);
    vehicleManagement.addVehicle(truck1);

    vehicleManagement.showAllVehicles();

    System.out.println("Update vehicle:");
    vehicleManagement.updateVehicle("C1");

    System.out.println("After updating:");
    vehicleManagement.showAllVehicles();

    System.out.println("Delete vehicle:");
    vehicleManagement.deleteVehicle("M2");

    System.out.println("After deleting:");
    vehicleManagement.showAllVehicles();

    vehicleManagement.saveToFile("vehicles.dat");

    VehicleManagement newVehicleManagement = new VehicleManagement();
    newVehicleManagement.loadFromFile("vehicles.dat");

    System.out.println("Loaded vehicles:");
    newVehicleManagement.showAllVehicles();
}}