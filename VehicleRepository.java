import java.util.ArrayList;
import java.util.List;

public class VehicleRepository
{
    private static List<Vehicle> vehicles = new ArrayList<Vehicle>();

    public void AddVehicle(Vehicle newVehicle)
    {
        vehicles.add(newVehicle);
    }

    public List<Vehicle> GetVehicles()
    {
        return vehicles;
    }

    public static String GetVersion()
    {
        return "1.0.0";
    }
}