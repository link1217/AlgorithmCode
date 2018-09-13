package designMode.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Decorator(new Source());
        source.method();
    }
}
