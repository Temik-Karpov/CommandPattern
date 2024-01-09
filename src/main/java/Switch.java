public class Switch {

    private final Command flipUpCommand;
    private final Command flipDownCommand;

    public Switch(final Command flipUpCommand, final Command flipDownCommand){
        this.flipUpCommand = flipUpCommand;
        this.flipDownCommand = flipDownCommand;
    }

    public void flipUp() {
        flipUpCommand.execute();
    }

    public void flipDown() {
        flipDownCommand.execute();
    }
}
