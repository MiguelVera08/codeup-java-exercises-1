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
        panda.leatherSeats();
        System.out.println(panda.getPriceBase());
        System.out.println(panda.honkHorn());
        System.out.println("===~~~---+++***+++---~~~===");
        Car lc = new LandCruiser();
        System.out.println(lc.getModel());
        System.out.println(lc.getCarType());
        System.out.println(lc.getMpgCity());
        System.out.println(lc.getMpgHwy());
        System.out.println(lc.honkHorn());
        System.out.println(lc.isHybrid());
        System.out.println(lc.isManual());
        System.out.println(lc.getPriceBase());
        lc.leatherSeats();
        System.out.println(lc.getPriceBase());
    }
}
