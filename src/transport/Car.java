package transport;

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

    public Car(String brand, String model, Double engineVolume,
               String color, int productionYear,
               String productionCountry, String transmission,
               String bodyType, String registrationNumber,int numberSeats) {
        this.tires=true;
        if (numberSeats == 0) {
            this.numberSeats=4;
        }else {
            this.numberSeats=5;
        }

        if (registrationNumber == null) {
            this.registrationNumber = "x000x000";
        }else {
            this.registrationNumber = registrationNumber;
        }
        if (bodyType == null) {
            this.bodyType = "default";
        }else {
            this.bodyType=bodyType;
        }
        if (transmission == null) {
            this.transmission = "default";
        }else {
            this.transmission =transmission;
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
        }else {
        this.engineVolume = engineVolume;}
        if (color == null) {
            this.color = "white";
        }else {
        this.color = color;}
        if (productionYear == 0) {
            this.productionYear = 2000;
        }else {
        this.productionYear = productionYear;}
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
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

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

}
