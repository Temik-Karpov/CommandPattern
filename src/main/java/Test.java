public class Test {
    public static void main(String[] args) {

        final Light l = new Light();

        final Command switchUp = new TurnOnLightCommand(l);
        final Command switchDown = new TurnOffLightCommand(l);

        final Switch s = new Switch(switchUp, switchDown);

        s.flipUp();
        s.flipDown();
    }
}
