import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarManagement {
    public static void main(String[] args) {
        // Create an array of Car objects
        List<Car> cars = new ArrayList<>();

        cars.add(new Car(4, "Nissan", "Altima", 2015, "Black", 150000.0, "111"));
        cars.add(new Car(5, "BMW", "Series 3", 2020, "White", 200000.0, "555"));
        cars.add(new Car(6, "Tesla", "Model 3", 2021, "Silver", 300000.0, "101010"));
        cars.add(new Car(7, "Honda", "Civic", 2018, "Pink", 200000.0, "1789"));
        cars.add(new Car(1, "Toyota", "Camry", 2019, "Blue", 250000.0, "123"));
        cars.add(new Car(2, "Honda", "Civic", 2017, "Red", 200000.0, "789"));
        cars.add(new Car(3, "Ford", "F-1", 2020, "Silver", 350000.0, "456"));
        
        
        
        // List of brands to search for
        List<String> brandsToSearch = Arrays.asList("Toyota", "Nissan", "Tesla");
        // Save cars of the specified brands to a single file
        saveCarsByBrands(cars, brandsToSearch, "Cars.txt");
            


        // Save a list of cars of a given model that have been in use for more than n years to a file
        int yearsThreshold = 3;
        String modelToSearch = "Civic";
        saveCarsByModelAndAge(cars, modelToSearch, yearsThreshold, "OldCivics.txt");



        // Save a list of cars of a given year of manufacture with a price higher than the specified one to a file
        int yearToSearch = 2020;
        double priceThreshold = 20000.0;
        saveCarsByYearAndPrice(cars, yearToSearch, priceThreshold, "Expensive2020Cars.txt");
    }

    // Function to save cars of given brands to a file
private static void saveCarsByBrands(List<Car> cars, List<String> brands, String fileName) {
    try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
        for (Car car : cars) {
            if (brands.contains(car.getMake())) {
                writer.println(car.toString());
            }
        }
        System.out.println("Cars of brands " + brands + " saved to " + fileName);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

  // Function to save cars of a given model that have been in use for more than n years to a file
  private static void saveCarsByModelAndAge(List<Car> cars, String model, int years, String fileName) {
    try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model) && (2023 - car.getYearOfManufacture()) > years) {
                writer.println(car.toString());
            }
        }
        System.out.println("Cars of model " + model + " with more than " + years + " years saved to " + fileName);
    } catch (IOException e) {
        e.printStackTrace();
    }
}


    // Function to save cars of a given year of manufacture with a price higher than the specified one to a file
    private static void saveCarsByYearAndPrice(List<Car> cars, int year, double price, String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Car car : cars) {
                if (car.getYearOfManufacture() == year && car.getPrice() > price) {
                    writer.println(car.toString());
                }
            }
            System.out.println("Find the Cars' year " + year + " with price higher than " + price + " in the " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

