import java.io.Console;

public class VehicleManager
{
    private static VehicleRepository repo = new VehicleRepository();
    private static Console console = System.console();

    private static String menu = "\n\nPlease select from the following menu:\n" +
            "1) Add a Car\n" +
            "2) Add a Truck\n" +
            "3) List All Vehicles\n" +
            "4) Exit\n";

    public static void main(String[] args)
    {
        System.out.println("Vehicle Manager");

        while(true)
        {
            System.out.println(menu);

            String response = console.readLine("?");

            int responseNum = Integer.parseInt(response);

            switch(responseNum)
            {
                case 1:
                    AddCar();
                    break;
                case 2:
                    break;
                case 3:
                    ListVehicles();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Sorry, that's not an option. Please try again.");
                    break;
            }
        }

    }

    private static void ListVehicles()
    {
        for (Vehicle vehicle : repo.GetVehicles())
        {
            System.out.println(vehicle.GetName());
        }
    }

    private static void AddCar()
    {
        Car newCar = new Car();

        newCar.setYear(Integer.parseInt(console.readLine("Please enter the Model Year\n")));
        newCar.setMake(console.readLine("Please enter the Make\n"));
        newCar.setModel(console.readLine("Please enter the Model\n"));
        newCar.setNumberOfDoors(Integer.parseInt(console.readLine("Please enter the number of doors\n")));
        newCar.setTrunkSize(Float.parseFloat(console.readLine("Please enter the trunk size\n")));

        repo.AddVehicle(newCar);
    }
}