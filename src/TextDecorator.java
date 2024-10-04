import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public abstract class TextDecorator implements TextComponent{

    private TextComponent component;
    // Create a ByteArrayOutputStream to capture the output
    // These will be used to capture sout from TextComponent
    protected ByteArrayOutputStream outputStream;
    protected PrintStream printStream;

    public TextDecorator(TextComponent component) {
        this.component = component;
        outputStream = new ByteArrayOutputStream();
        printStream = new PrintStream(outputStream);
    }

    public abstract void display();

    public TextComponent getComponent() {
        return component;
    }
}
