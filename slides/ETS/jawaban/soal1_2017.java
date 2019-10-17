public class soal4_2017 {
    public static void main(String[] args) {
        E2 o = new E2(12);
        System.out.println(o.getA() + "," + o.f(34));
    }
}

class E1 {
    protected int a;

    public E1(int x) {
        a = x;
    }

    public int getA() {
        return a;
    }

    public int f(int x) {
        return x + a;
    }
}

class E2 extends E1 {
    protected int a;

    public E2(int y) {
        super(y + 100);
    }

    public int getA() {
        return a;
    }
}