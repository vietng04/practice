public class Main {
    public static void main(String[] args) {
    }
}

class Parent {
    protected char c = 'p';
    public int a;
    public int b;

    public Parent(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void func() {
        System.out.println(c);
    }
    public int calculate(int a, int b) {
        return a + b;
    }
}
class Child extends Parent {
    public Child(int a, int b) {
        super(a, b);
    }

    @Override
    public void func() {
        super.func();
    }

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
