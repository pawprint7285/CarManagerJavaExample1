public class Car extends Vehicle {
    private int numberOfDoors;
    private float trunkSize;

    public Car () { super(); }
    public Car (int newYear, String newMake, String newModel, int newNumberOfDoors, float newTrunkSize)
    {
        super(newYear, newMake, newModel);
        setNumberOfDoors(newNumberOfDoors);
        setTrunkSize(newTrunkSize);
    }
    public Car (String newYear, String newMake, String newModel, int newNumberOfDoors, float newTrunkSize)
    {
        super(newYear, newMake, newModel);
        setNumberOfDoors(newNumberOfDoors);
        setTrunkSize(newTrunkSize);
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public float getTrunkSize() {
        return trunkSize;
    }

    public void setTrunkSize(float trunkSize) {
        this.trunkSize = trunkSize;
    }
}