package File;

public class File {

    private final String name;

    public File(final String name) {
        this.name = name;
    }

    public String open() {
        return "Opening file " + name;
    }

    public String save() {
        return "Saving file " + name;
    }
}
