import java.util.concurrent.ThreadLocalRandom;

public class CargoCar extends Transport {

    private TypeLoad typeLoad;


    public CargoCar(String brand, String model, double engineVolume, TypeLoad typeLoad) {
        super(brand, model, engineVolume);
        this.typeLoad = typeLoad;
    }

    public TypeLoad getTypeLoad() {
        return typeLoad;
    }

    public void setTypeLoad(TypeLoad typeLoad) {
        this.typeLoad = typeLoad;
    }

    @Override
    public void printType() {
        if (typeLoad == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            String from = typeLoad.getFrom() == null ? "" : " от " + typeLoad.getFrom() + " т. ";
            String to = typeLoad.getTo() == null ? "" : " до " + typeLoad.getTo()+ " т. ";
            System.out.println("Тип грузоподъемности авто:" + from + to);
        }
    }

    @Override
    public void startMove() {

    }

    @Override
    public void finishMove() {

    }

    @Override
    public String toString() {
        return "CargoCar{" +
                "typeLoad=" + typeLoad +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
