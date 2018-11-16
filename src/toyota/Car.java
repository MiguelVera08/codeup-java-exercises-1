package toyota;

public class Car {
    protected String model;
    protected String carType;
    protected boolean isHybrid;
    protected boolean isManual;
    protected int mpgCity;
    protected int mpgHwy;
    protected int priceBase;

    public void leatherSeats() {
        this.priceBase = this.priceBase + 450;
    }

    public String honkHorn() {
        return "Honk HONK!";
    }

    protected Car() { }

    public Car(String model, String carType, boolean isHybrid, boolean isManual, int mpgCity, int mpgHwy, int priceBase) {
        this.model = model;
        this.carType = carType;
        this.isHybrid = isHybrid;
        this.isManual = isManual;
        this.mpgCity = mpgCity;
        this.mpgHwy = mpgHwy;
        this.priceBase = priceBase;
    }


}
