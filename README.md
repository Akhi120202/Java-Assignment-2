
## Java-Assignment-2
## Matriculation number: 7213389
## Enviroment: Visual Studio code

## Car Class
The Car class represents individual cars with various attributes such as id, make, model, yearOfManufacture, color, price, and registrationNumber. It also includes getter and setter methods for these attributes.

1, public Car(int id, String make, String model, int yearOfManufacture, String color, double price, String registrationNumber): This is a constructor, initializes a car object with the specified attributes.

2. Getter methods for all attributes allow to retrieve the values of the car's properties.

3. Setter methods for all attributes allow to set the values of the car's properties.

4.  public String toString(): This method provides a textual presentation of a car object.


## CarManagement Class
The CarManagement class serves as the main class for the program. 

1. Creates a list of Car objects with different attributes.

2. Defines a list of brands to search for (brandsToSearch).

3. Calls the saveCarsByBrands method to save cars of specified brands to a file.

4. Calls the saveCarsByModelAndAge method to save cars of a given model that have been in use for more than n years to a file.

5. Calls the saveCarsByYearAndPrice method to save cars of a given year of manufacture with a price higher than the specified one to a file.

6. private static void saveCarsByBrands(List<Car> cars, List<String> brands, String fileName): This method takes a list of cars, a list of brand names, and a filename as input. It saves cars of specified brands to a text file.

7. private static void saveCarsByModelAndAge(List<Car> cars, String model, int years, String fileName): This method takes a list of cars, a car model, a threshold number of years, and a filename as input. It saves cars of the specified model that have been in use for more than the specified number of years to a text file.

8. private static void saveCarsByYearAndPrice(List<Car> cars, int year, double price, String fileName): This method takes a list of cars, a specific manufacturing year, a price threshold, and a filename as input. It saves cars of the given year of manufacture with a price higher than the specified one to a text file.
