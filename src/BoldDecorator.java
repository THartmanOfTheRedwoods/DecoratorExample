import java.io.PrintStream;

public class BoldDecorator extends TextDecorator{

    public BoldDecorator(TextComponent component) {
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
        System.out.printf("<b>%s</b>%n", outputStream.toString().strip());
    }
}
