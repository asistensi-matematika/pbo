public class soal3 {
    public static void main(String[] args) {
        Vektor2D a = new Vektor2D(1, 2);
        Vektor2D b = new Vektor2D(2, 3);
        Vektor2D c = new Vektor2D(3, 4);
        Vektor2D d = new Vektor2D(0,0);
        a.Display();
        a.SumVec(b).Display();
        System.out.println( d.isVektorNol());
    }
}

class Vektor2D {
    private int X, Y;

    public Vektor2D(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public void Display() {
        System.out.println(X + "," + Y);
    }

    public Vektor2D SumVec(Vektor2D V){
        return new Vektor2D(this.getX()+V.getX(), this.getY()+V.getY());
    }

    public boolean isVektorNol() {
        if (X == 0 && Y == 0) {
            return true;
        } else {
            return false;
        }
    }
}