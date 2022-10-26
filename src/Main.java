public class Main {
    public static void main(String[] args) {

        Car Lada = new Car("Lada","Granta",1.7, TypeBody.COUPE);
        System.out.println(Lada);
        Lada.printType();

        Car Kia = new Car("Kia","Sportage", 2.4, TypeBody.MINIVAN);
        System.out.println(Kia);
        Kia.printType();

        Bus Ferrari = new Bus("Ferrari", "F-500", 3.4, TypeCapacity.LARGE);
        System.out.println(Ferrari);
        Ferrari.printType();

        CargoCar Mercedes = new CargoCar("Mercedes", "SCLK", 4.1, TypeLoad.N2);
        System.out.println(Mercedes);
        Mercedes.printType();


    }
}