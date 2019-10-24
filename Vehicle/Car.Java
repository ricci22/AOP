public class Car extends Vehicle implements Lamp {
    private int power;

    @Override
    public void lightBeam(int power) {
        System.out.println("Lampu nyala dengan daya " + power);
    }
}