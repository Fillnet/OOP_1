public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(1989, " Максим", " Минск"," бренд-менеджер");
        Human anna = new Human(1993, " Аня", " Москва"," методист образовательных программ");
        Human katya = new Human(1994, " Катя", " Калининград"," продакт-менеджер");
        Human artem = new Human(1995, " Артем", " Москва"," директор по развитию бизнеса");
        Car lada = new Car("Lada.","Granta.",1.7,"желтый.",2015,"Россия.");
        Car audi = new Car("Audi.","A8 50 L TDI quattro.",3.0,"черный.",2020,"Германия.");
        Car bmw = new Car("BMW.","Z8.",3.0,"черный.",2021,"Германия.");
        Car kia = new Car("Kia.","Sportage 4-го поколения.",2.4,"красный.",2018,"Южная Корея.");
        Car hyundai = new Car("Hyundai.","Avante.",1.6,"оранжевый.",2016,"Южная Корея.");

        maksim.human();
        anna.human();
        katya.human();
        artem.human();
        System.out.println();
        lada.car();
        audi.car();
        bmw.car();
        kia.car();
        hyundai.car();
    }

}