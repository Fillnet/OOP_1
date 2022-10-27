import transport.Car;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(-1989, "Максим", "Минск","бренд-менеджер");
        Human anna = new Human(1993, null, "Москва","методист образовательных программ");
        Human katya = new Human(1994, "Катя", "Калининград",null);
        Human artem = new Human(1995, "Артем", null,"директор по развитию бизнеса");
        Human vladimir = new Human(2001, "Владимир", "Казань",null);
        Car lada = new Car(null,
                "Granta.",
                1.7,
                "желтый.",
                2015,
                "Россия.",
                "Auto",
                "Sedan",
                null,
                4);
//        Car audi = new Car("Audi.","",3.0,"черный.",2020,"Германия.");
//        Car bmw = new Car("BMW.","Z8.",0.0,"черный.",2021,"Германия.");
//        Car kia = new Car("Kia.","Sportage 4-го поколения.",2.4,"",2018,"Южная Корея.");
//        Car hyundai = new Car("Hyundai.","Avante.",1.6,"оранжевый.",0,"");

        maksim.human();
        anna.human();
        katya.human();
        artem.human();
        vladimir.human();
        System.out.println();
        car(lada);
    }

    private static void car(Car car) {
        System.out.println("Марка автомобиля: " + car.getBrand() + " Модель: " + car.getModel() +
                " Год производства: " + car.getProductionYear() + "\nСтрана производитель: " + car.getProductionCountry() +
                " Цвет кузова: " + car.getColor() + " \nОбьем двигателя: " + car.getEngineVolume() +
                " Коробка передач: " + car.getTransmission() + " \nТип кузова: " + car.getBodyType() +
                " Регистрационный номер: " + car.getRegistrationNumber() +
                " Количество мест: " + car.getNumberSeats() +
                " Тип резины: " + car.getTires());
    }
}