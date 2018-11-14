public class Car {
    private int mpg;
    private boolean isFast;
    private String carModel;
    private boolean isNew;
    private static String carMake = "Chevy";

    public void carCrash(){
        this.isFast = false;
    }

    public void tradeIn(){
        this.isNew = false;
    }

    public static void honkHonk() {
        System.out.println("The car goes: \"HONK!\"");
    }

    public Car(){}

    public Car(int mpg, boolean isFast, String carModel, boolean isNew) {
        this.mpg = mpg;
        this.isFast = isFast;
        this.carModel = carModel;
        this.isNew = isNew;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public boolean isFast() {
        return isFast;
    }

    public void setFast(boolean fast) {
        isFast = fast;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public static String getCarMake() {
        return carMake;
    }


    public static void main(String[] args) {
        Car chevelle = new Car(18,true,"Chevelle", false);
        System.out.println(chevelle.getCarModel());
        System.out.println(chevelle.isFast());
        chevelle.honkHonk();
    }
}
