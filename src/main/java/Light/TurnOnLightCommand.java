package Light;


public class TurnOnLightCommand implements Command{

    private final Light theLight;

    public TurnOnLightCommand(final Light light) {
        this.theLight = light;
    }

    @Override
    public void execute() {
        theLight.turnOn();
    }
}
