public class soal3_2016 {
    public static void main(String[] args) {
        Vektor2D a = new Vektor2D(1, 2);
        Vektor2D b = new Vektor2D(2, 3);
        Vektor2D c = new Vektor2D(3, 4);
        Vektor2D d = new Vektor2D(0,0);
        // a.Display();
        // a.SumVec(b).Display();
        // System.out.println( d.isVektorNol());



        // (a,b) + (c,d) = (a+c, b+d)
        // a,b
        // vektor1.a = 1;
        // vektor1.b = 2;

        // //c,d
        // vektor2.a = 5;
        // vektor2.b = 6;

        // // a+c, b+d
        // System.out.println(vektor1.a+vektor2.a + "," + vektor1.b + vektor2.b);

        Vektor2D vektor1 = new Vektor2D(1,2);
        Vektor2D vektor2 = new Vektor2D(5,9);

        Vektor2D jawaban = vektor1.SumVec(vektor2);
        jawaban.Display();
        System.out.println(vektor1.CariGradien(vektor2));


    }
}

class Vektor2D {
    protected double X, Y;

    public Vektor2D(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public void Display() {
        System.out.println(X + "," + Y);
    }

    public double CariGradien(Vektor2D V){
        // rumus gradien: (y2-y1) / (x2-x1)
        return (V.getY() - this.getY()) / (V.getX() - this.getX());
    }

    public Vektor2D SumVec(Vektor2D V){
        double atas = this.getX() + V.getX();
        double bawah = this.getY() + V.getY();
        Vektor2D hasil = new Vektor2D((int)atas, (int)bawah);
        return hasil;
    }

    public boolean isVektorNol() {
        if (X == 0 && Y == 0) {
            return true;
        } else {
            return false;
        }
    }
}


class titik2D{
    int a,b;
}

