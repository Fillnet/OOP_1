public class Human {
    int dateBirth;
    String name;
    String city;
    String post;

    public Human(int dateBirth, String name, String city, String post) {
        if (dateBirth >= 0) {
            this.dateBirth = dateBirth;
        } else {
            this.dateBirth = Math.abs(dateBirth);
        }
        if (name.length() == 0) {
            this.name = "Информация не указана! ";
        } else {
            this.name = name;
        }if (city.length() == 0) {
            this.city = "Информация не указана! ";
        } else {
            this.city = city;
        }if (post.length() == 0) {
            this.post = "Информация не указана! ";
        } else {
            this.post = post;
        }

    }

    void human() {
        System.out.println("Привет! Меня зовут " + this.name + " Я из города " + this.city + " Я родился в " + this.dateBirth + " году.Я работаю на должности " + this.post + " ,Будем знакомы!");
    }
}
