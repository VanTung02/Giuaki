import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VehicleManagement<vehicles> {
    private List<vehicle> vehicles;

    public VehicleManagement() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void showAllVehicles() {
        for (vehicle vehicle : vehicles) {
            vehicle.showInfo();
            System.out.println();
        }
    }

    public void updateVehicle(String id) {
        for (vehicle vehicle : vehicles) {
            if (vehicle.getId().equals(id)) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter new brand: ");
                String brand = scanner.nextLine();
                System.out.print("Enter new publish year: ");
                int publishYear = scanner.nextInt();
                System.out.print("Enter new price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter new color: ");
                String color = scanner.next();

                if (vehicle instanceof car) {
                    System.out.print("Enter new slots: ");
                    int slots = scanner.nextInt();
                    System.out.print("Enter new engine type: ");
                    String engineType = scanner.next();
                    car car = (car) vehicle;
                    car.setBrand(brand);
                    car.setPublishYear(publishYear);
                    car.setPrice(price);
                    car.setColor(color);
                    car.setSlots(slots);
                    car.setEngineType(engineType);
                } else if (vehicle instanceof motorbike) {
                    System.out.print("Enter new capacity: ");
                    int capacity = scanner.nextInt();
                    motorbike motorbike = (motorbike) vehicle;
                    motorbike.setBrand(brand);
                    motorbike.setPublishYear(publishYear);
                    motorbike.setPrice(price);
                    motorbike.setColor(color);
                    motorbike.setCapacity(capacity);
                } else if (vehicle instanceof Truck) {
                    System.out.print("Enter new load weight: ");
                    double loadWeight = scanner.nextDouble();
                    Truck truck = (Truck) vehicle;
                    truck.setBrand(brand);
                    truck.setPublishYear(publishYear);
                    truck.setPrice(price);
                    truck.setColor(color);
                    truck.setLoadWeight(loadWeight);
                }

                System.out.println("Vehicle updated successfully.");
                return;
            }
        }

        System.out.println("Vehicle with ID '" + id + "' not found.");
    }

    public void deleteVehicle(String id) {
        Iterator<vehicle> iterator = vehicles.iterator();
        while (iterator.hasNext()) {
            vehicle vehicle = iterator.next();
            if (vehicle.getId().equals(id)) {
                iterator.remove();
                System.out.println("Vehicle deleted successfully.");
                return;
            }
        }

        System.out.println("Vehicle with ID '" + id + "' not found.");
    }

    public void saveToFile(String filename) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(vehicles);
            System.out.println("Vehicles saved to file successfully.");
        } catch (IOException e) {
            System.out.println("Error while saving vehicles to file: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        try (FileInputStream fileInputStream = new FileInputStream(filename);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            vehicles = (List<vehicle>) objectInputStream.readObject();
            System.out.println("Vehicles loaded from file successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error while loading vehicles from file: " + e.getMessage());
        }
    }
}