public class Main {
    public static void main(String[] args) {
        TextComponent tc = new BoldDecorator(
                new ItalicsDecorator(
                    new ConcreteTextComponent("Trevor")
                )
        );
        tc.display();
    }
}
