public class Motorcycle extends Vehicle implements Lamp{
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void lightBeam(int power) {
        System.out.println("Lampu motor nyala dengan daya " + power);
    }
}