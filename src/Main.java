public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(-1989, "Максим", "Минск","бренд-менеджер");
        Human anna = new Human(1993, null, "Москва","методист образовательных программ");
        Human katya = new Human(1994, "Катя", "Калининград",null);
        Human artem = new Human(1995, "Артем", null,"директор по развитию бизнеса");
        Human vladimir = new Human(2001, "Владимир", "Казань",null);
        Car lada = new Car("","Granta.",1.7,"желтый.",2015,"Россия.");
        Car audi = new Car("Audi.","",3.0,"черный.",2020,"Германия.");
        Car bmw = new Car("BMW.","Z8.",0.0,"черный.",2021,"Германия.");
        Car kia = new Car("Kia.","Sportage 4-го поколения.",2.4,"",2018,"Южная Корея.");
        Car hyundai = new Car("Hyundai.","Avante.",1.6,"оранжевый.",0,"");
//        не понял как сделать так чтобы можно было не вводить переменные int && double и проверить на отсутсвие значений в переменной

        maksim.human();
        anna.human();
        katya.human();
        artem.human();
        vladimir.human();
        System.out.println();
        lada.car();
        audi.car();
        bmw.car();
        kia.car();
        hyundai.car();
    }

}