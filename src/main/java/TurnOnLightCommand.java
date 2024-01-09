


public class TurnOnLightCommand implements Command{

    private final Light theLight;

    public TurnOnLightCommand(final Light light) {
        this.theLight = light;
    }

    public void execute() {
        theLight.turnOn();
    }
}
