class Vehicle {
    String Brand;
    int Year;
    void StartEngine(){
        System.out.println("This is Vehicle");
    }
}
class Car extends Vehicle{
      @SuppressWarnings("unused")
    String fuelType;

    void StartEngine() {
        System.out.println("Car engine starts");
    }
    void drive(){
        System.out.println("Car is driving");
    }
}
class Truck extends Vehicle {
    @SuppressWarnings("unused")
    int LoadCapacity ;

    @Override
    void StartEngine() {
        System.out.println("Truck engine starts");
    }
    void haul(){
        System.out.println("Truck is hauling");
    }
}
public class main{
    public static void main(String[] args){
        Truck t1 = new Truck();
        t1.StartEngine();
        t1.Year=2023;
        t1.Brand="xxx";
        t1.haul();
        Car car1= new Car();
        car1.Brand="Red car";
        car1.fuelType="Petrol";
        car1.drive();
    }
}
