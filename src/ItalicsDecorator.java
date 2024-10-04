import java.io.PrintStream;

public class ItalicsDecorator extends TextDecorator{

    public ItalicsDecorator(TextComponent component) {
        super(component);
    }

    @Override
    public void display() {
        // Save the original System.out
        PrintStream originalOut = System.out;
        // Redirect System.out to the new PrintStream
        System.setOut(printStream);
        // Call println (output will be captured)
        this.getComponent().display();
        // Restore the original System.out
        System.setOut(originalOut);

        // Convert captured output to a String
        System.out.printf("<i>%s</i>%n", outputStream.toString().strip());
    }
}
