package initial;

public class Client {

    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Button button = new Button(lamp);
        button.pressed();
    }
}
