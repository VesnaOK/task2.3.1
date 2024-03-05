package web.model;

public class Car {
    private String model;
    private int number;
    private int fine;

    public Car(String model, int number, int fine) {
        this.model = model;
        this.number = number;
        this.fine = fine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", number=" + number +
                ", fine=" + fine +
                '}';
    }
}
