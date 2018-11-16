package toyota;

public class CarTester {
    public static void main(String[] args) {
        EightSix panda = new EightSix();
        panda.makeTRD();
        panda.makeAutomatic();
        System.out.println(panda.getModel());
        System.out.println(panda.getCarType());
        System.out.println(panda.isManual());
        System.out.println(panda.getPriceBase());
        System.out.println(panda.honkHorn());
    }
}
