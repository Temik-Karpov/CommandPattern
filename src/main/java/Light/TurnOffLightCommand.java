package Light;

public class TurnOffLightCommand implements Command {

    private final Light theLight;

    public TurnOffLightCommand(final Light light) {
        this.theLight = light;
    }

    @Override
    public void execute() {
        theLight.turnOff();
    }
}