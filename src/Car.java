public class Car {
    String brand;
    String model;
    Double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, Double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    void car() {
        System.out.println("Марка автомобиля: "+this.brand+" Модель: "+this.model+" Год производства: "+this.productionYear+" Страна производитель: "+this.productionCountry+
                " Цвет кузова: "+this.color+" Обьем двигателя: "+this.engineVolume);
    }
}
