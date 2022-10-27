import java.time.LocalDate;

public class Human {
    private int dateBirth;
    private int age;
    private String name;
    private String city;
    private String post;

    public Human(int dateBirth, String name, String city, String post) {
        if (dateBirth < 0) {
            this.dateBirth = dateBirth;
        } else {
            this.dateBirth = Math.abs(dateBirth);
        }
        if (name == null) {
            this.name = "Информация не указана! ";
        } else {
            this.name = name;
        }
        if (city == null) {
            this.city = "Информация не указана! ";
        } else {
            this.city = city;
        }
        if (post == null) {
            this.post = "Информация не указана! ";
        } else {
            this.post = post;
        }

        this.age = LocalDate.now().getYear() - Math.abs(dateBirth);
    }

    public int getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(int dateBirth) {
        if (dateBirth >= 0) {
            this.dateBirth = dateBirth;
        } else {
            this.dateBirth = Math.abs(dateBirth);
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null) {
            this.city = "Информация не указана! ";
        } else {
            this.city = city;
        }
    }

    public int getAge() {
        return age;
    }

    void human() {
        System.out.println("Привет! Меня зовут " + this.name + " Я из города " + getCity() + " Мне исполнилось " + getAge() + " лет.Я работаю на должности " + this.post + " ,Будем знакомы!");
    }
}
