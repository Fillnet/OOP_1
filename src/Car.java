public class Car {
    String brand;
    String model;
    Double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, Double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand.length() == 0) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model.length() == 0) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        }else {
        this.engineVolume = engineVolume;}
        if (color.length() == 0) {
            this.color = "white";
        }else {
        this.color = color;}
        if (productionYear == 0) {
            this.productionYear = 2000;
        }else {
        this.productionYear = productionYear;}
        if (productionCountry.length() == 0) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
    }

    void car() {
        System.out.println("Марка автомобиля: " + this.brand + " Модель: " + this.model +
                " Год производства: " + this.productionYear + " Страна производитель: " + this.productionCountry +
                " Цвет кузова: " + this.color + " Обьем двигателя: " + this.engineVolume);
    }
}
