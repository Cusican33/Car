public class Main
{
    static void main()
    {
        boolean possible;
        System.out.println("---- Car 1 Tests ----");
        Car carOne = new Car(10.0, 30.0);
        System.out.println(carOne.getCurrentFuel() + "  " + carOne.getMpg());
        possible = carOne.canMakeTrip(120.0);
        System.out.println(possible);
        System.out.println(carOne.getCurrentFuel() + "  " + carOne.getMpg());
        possible = carOne.canMakeTrip(90.0);
        System.out.println(possible);
        System.out.println(carOne.getCurrentFuel() + "  " + carOne.getMpg());
        possible = carOne.canMakeTrip(225.0);
        System.out.println(possible);
        System.out.println(carOne.getCurrentFuel() + "  " + carOne.getMpg());
        System.out.println();


        System.out.println("---- Car 2 Tests ----");
        Car carTwo = new Car(12.0, 15.0);
        System.out.println(carTwo.getCurrentFuel() + "  " + carTwo.getMpg());
        possible = carTwo.canMakeTrip(300.0);
        System.out.println(possible);
        System.out.println(carTwo.getCurrentFuel() + "  " + carTwo.getMpg());
        possible = carTwo.canMakeTrip(180.0);
        System.out.println(possible);
        System.out.println(carTwo.getCurrentFuel() + "  " + carTwo.getMpg());
        possible = carTwo.canMakeTrip(10.0);
        System.out.println(possible);
        System.out.println(carTwo.getCurrentFuel() + "  " + carTwo.getMpg());
        System.out.println();


        System.out.println("---- Car 3 Tests ----");
        Car carThree = new Car(32.0, 25.0);
        System.out.println(carThree.getCurrentFuel() + "  " + carThree.getMpg());
        possible = carThree.canMakeTrip(810);
        System.out.println(possible);
        System.out.println(carThree.getCurrentFuel() + "  " + carThree.getMpg());
        possible = carThree.canMakeTrip(150.0);
        System.out.println(possible);
        System.out.println(carThree.getCurrentFuel() + "  " + carThree.getMpg());
        possible = carThree.canMakeTrip(150.0);
        System.out.println(possible);
        System.out.println(carThree.getCurrentFuel() + "  " + carThree.getMpg());
        possible = carThree.canMakeTrip(150.0);
        System.out.println(possible);
        System.out.println(carThree.getCurrentFuel() + "  " + carThree.getMpg());
        possible = carThree.canMakeTrip(150.0);
        System.out.println(possible);
        System.out.println(carThree.getCurrentFuel() + "  " + carThree.getMpg());
        possible = carThree.canMakeTrip(150.0);
        System.out.println(possible);
        System.out.println(carThree.getCurrentFuel() + "  " + carThree.getMpg());
        possible = carThree.canMakeTrip(150.0);
        System.out.println(possible);
        System.out.println(carThree.getCurrentFuel() + "  " + carThree.getMpg());

    }
}
