public class Human {
    int dateBirth;
    String name;
    String city;
    String post;

    public Human(int dateBirth, String name, String city, String post) {
        this.dateBirth = dateBirth;
        this.name = name;
        this.city = city;
        this.post = post;
    }

    void human() {
        System.out.println("Привет! Меня зовут" + this.name + " Я из города" + this.city + " Я родился в " + this.dateBirth + " году.Я работаю на должности" + this.post + " Будем знакомы!");
    }
}
