package File;

import Light.Command;

public class OpenFileCommand implements Command {

    private final File file;

    public OpenFileCommand(final File file)
    {
        this.file = file;
    }

    @Override
    public void execute() {
        System.out.println(file.open());
    }
}
