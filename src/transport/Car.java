package transport;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    private Double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberSeats;
    private boolean tires;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, Double engineVolume,
               String color, int productionYear,
               String productionCountry, String transmission,
               String bodyType, String registrationNumber, int numberSeats, Key key, Insurance insurance) {
        this.tires = true;
        if (numberSeats == 0) {
            this.numberSeats = 4;
        } else {
            this.numberSeats = 5;
        }

        if (registrationNumber == null) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (bodyType == null) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (transmission == null) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "white";
        } else {
            this.color = color;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
    }

    public boolean getTires() {
        return this.tires;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    //проверк на соответсвие номера формату х000хх000
    public boolean setRegistrationNumber(String registrationNumber) {
//        this.registrationNumber = registrationNumber;
//    }

//    public boolean isCorrect() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) ||
                !Character.isDigit(chars[2]) ||
                !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) ||
                !Character.isDigit(chars[7]) ||
                !Character.isDigit(chars[8])) {
            return false;
        }
        if (Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) && Character.isDigit(chars[6]) && Character.isDigit(chars[7])) {
            Character.isDigit(chars[8]);
        }
        return false;
    }

    public class Key {
        private final boolean distanceStart;
        private final boolean noKey;

        public Key(boolean distanceStart, boolean noKey) {
            this.distanceStart = distanceStart;
            this.noKey = noKey;
        }

        public Key() {
            this(false, false);
        }


        public boolean getDistanceStart() {
            return distanceStart;
        }

        public boolean getNoKey() {
            return noKey;
        }
    }

    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null)
            {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkExpireDay() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println(" нужно оформлять страховку!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println(" номер страховки некорректный");
            }
        }
    }
}







