public class Car
{
    private double fuel;
    private double Mpg;

    public Car(double fuel, double milPerGal)
    {
        this.fuel = fuel;
        this.Mpg = milPerGal;
    }

    public boolean canMakeTrip(double dist)
    {
        if ((fuel * Mpg) >= dist)
        {
            fuel -= dist / Mpg;
            return true;
        }
        else return false;
    }

    public double getMpg() {
        return Mpg;
    }

    public double getCurrentFuel() {
        return fuel;
    }
}
