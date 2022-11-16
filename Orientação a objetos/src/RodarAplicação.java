public class RodarAplicação {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setColor("Blue");
        car1.setModel("BMW X3");
        car1.setFuelTankCapacity(63);
        

        System.out.println(car1.getColor());
        System.out.println(car1.getModel());
        System.out.println(car1.getFuelTankCapacity());
        System.out.println(car1.tankValueTotal(3.60));

    }
    
}
