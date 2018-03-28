package designPattern;

abstract class Super {
    public void templateMethod() {

    }

    protected void hookMethod() { }
    public abstract void abstractMethod();
}


public class Sub1 extends Super{
    @Override
    public void abstractMethod() {
        System.out.println("템플릿 메소드 패턴 ");
    }
}
