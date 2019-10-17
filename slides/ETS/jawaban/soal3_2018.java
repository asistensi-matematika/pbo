import java.lang.*;

public class soal3_2018{
    public static void main(String[] args) {
        TitikQu a = new TitikQu(3,8);
        TitikQu b = new TitikQu(10,30);
        System.out.println(b.Gradient(a));
        System.out.println(a.jarak());

    }
}

class TitikQu{
    private int x,y;
    public TitikQu(){
        this.x = 0;
        this.y = 0;
    }
    public TitikQu(int X, int Y){
        this.x = X;
        this.y = Y;
    }
    public double[] GetData(){
        double[] a = {this.x,this.y};
        return a ;
    }
    public double jarak(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public double Gradient(TitikQu T){
        return (T.GetData()[0] - this.GetData()[0]) / (T.GetData()[1] - this.GetData()[1]);
    }
}