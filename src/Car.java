import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport  {


    private TypeBody typeBody;

    @Override
    public void printType() {
        if (typeBody == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип кузова авто: " + typeBody);
        }
    }

    @Override
    public void startMove() {

    }

    @Override
    public void finishMove() {

    }

    public Car(String brand, String model, double engineVolume, TypeBody typeBody) {
        super(brand, model, engineVolume);
        this.typeBody = typeBody;
    }

    public TypeBody getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(TypeBody typeBody) {
        this.typeBody = typeBody;
    }

    @Override
    public String toString() {
        return "Car{" +
                "typeBody=" + typeBody +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
