package designMode.proxy;

public class Proxy implements Sourceable {
    Sourceable source;

    public Proxy() {
        source = new Source();
    }

    @Override
    public void method() {
        System.out.println("before...");
        source.method();
        System.out.println("after...");
    }
}
