package File;

import Light.Command;

public class SaveFileCommand implements Command {

    private final File file;

    public SaveFileCommand(final File file)
    {
        this.file = file;
    }

    @Override
    public void execute() {
        System.out.println(file.save());
    }
}
