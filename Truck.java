public class Truck extends Vehicle
{
    private String bedStyle;
    private float bedCapacity;

    public Truck(){ super(); }
    public Truck(int newYear, String newMake, String newModel, String newBedStyle, float newBedCapacity)
    {
        super(newYear, newMake, newModel);
        setBedStyle(newBedStyle);
        setBedCapacity(newBedCapacity);
    }
    public Truck(String newYear, String newMake, String newModel, String newBedStyle, float newBedCapacity)
    {
        super(newYear, newMake, newModel);
        setBedStyle(newBedStyle);
        setBedCapacity(newBedCapacity);
    }

    public String getBedStyle() {
        return bedStyle;
    }

    public void setBedStyle(String bedStyle) {
        this.bedStyle = bedStyle;
    }

    public float getBedCapacity() {
        return bedCapacity;
    }

    public void setBedCapacity(float bedCapacity) {
        this.bedCapacity = bedCapacity;
    }
}