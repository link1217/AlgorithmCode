package designMode.decorator;

public class Decorator implements Sourceable {
    Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("before...");
        source.method();
        System.out.println("after...");
    }
}
