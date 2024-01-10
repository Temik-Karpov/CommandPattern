import File.OpenFileCommand;
import File.SaveFileCommand;
import Light.Command;
import Light.TurnOnLightCommand;
import Light.TurnOffLightCommand;
import Light.Light;
import File.File;

public class Test {
    public static void main(String[] args) {

        final Light l = new Light();

        final Command switchUp = new TurnOnLightCommand(l);
        final Command switchDown = new TurnOffLightCommand(l);

        final CommandExecutor lightExecutor = new CommandExecutor();

        System.out.println("\n=====Выполнение команд для света:");
        lightExecutor.executeCommand(switchUp);
        lightExecutor.executeCommand(switchDown);


        final File file = new File("Image.png");

        final Command openFile = new OpenFileCommand(file);
        final Command saveFile = new SaveFileCommand(file);

        final CommandExecutor fileExecutor = new CommandExecutor();

        System.out.println("\n=====Выполнение команд для файла:");
        fileExecutor.executeCommand(openFile);
        fileExecutor.executeCommand(saveFile);
    }
}
