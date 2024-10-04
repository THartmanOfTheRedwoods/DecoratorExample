public class ConcreteTextComponent implements TextComponent{
    private String text;

    public ConcreteTextComponent(String text) {
        this.text = text;
    }
    @Override
    public void display() {
        System.out.println(this.text);
    }
}
