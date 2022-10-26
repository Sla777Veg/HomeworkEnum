public class Bus extends Transport {

    private TypeCapacity typeCapacity;

    @Override
    public void printType() {
        if (typeCapacity == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип вместимости автобуса от: " + typeCapacity.getFrom() +" чел. до "+ typeCapacity.getTo()+" чел. ");
        }
    }

    @Override
    public void startMove() {

    }

    @Override
    public void finishMove() {

    }

    public Bus(String brand, String model, double engineVolume, TypeCapacity typeCapacity) {
        super(brand, model, engineVolume);
        this.typeCapacity = typeCapacity;
    }

    public TypeCapacity getTypeCapacity() {
        return typeCapacity;
    }

    public void setTypeCapacity(TypeCapacity typeCapacity) {
        this.typeCapacity = typeCapacity;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "typeCapacity=" + typeCapacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
