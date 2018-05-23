public class Vehicle {
    private int constructionYear;

    private int year;
    private String make;
    private String model;
    private static int nextId = 0;
    private int id;

    public Vehicle() {
        InitializeValues(0, "", "");
    }

    public Vehicle(int newYear, String newMake, String newModel) {
        InitializeValues(newYear, newMake, newModel);
    }

    public Vehicle(String newYear, String newMake, String newModel) {
        InitializeValues(Integer.parseInt(newYear), newMake, newModel);
    }

    private void InitializeValues(int newYear, String newMake, String newModel) {
        setYear(newYear);
        setMake(newMake);
        setModel(newModel);
        id = nextId++;
    }

    public String GetName() {
        return "Vehicle: ID: " + String.valueOf(id) + " " + String.valueOf(getYear()) + " " + getMake() + " " + getModel();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}