public class Car
{
    private String color;
    private String manufacturer;
    private int doors;
    private String horn;

    public Car(String color, String manufacturer, int doors)
    {
        this.color = color;
        this.manufacturer = manufacturer;
        this.doors = doors;
    }

    public String getColor()
    {
        return color;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public int getDoors()
    {
        return doors;
    }

    public String getHorn() {return horn;}
}
