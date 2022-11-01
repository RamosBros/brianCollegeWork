package src.com.collegework.labsix;

public class Fractions {
    private int n;
    private int d;

    public Fractions(int n, int d) {
        int gcd = greatestComDenom(n,d);
        this.n = n/gcd;
        this.d = d/gcd;
        if(this.d == 0){
            throw new ArithmeticException();
        }
    }

    public int getNum() {
        return this.n;
    }

    public int getDenom() {
        return this.d;
    }

    public void setNum(int n) {
        this.n = n;
    }

    public void setDenom(int d) {
        this.d = d;
        if(this.d == 0){
            throw new ArithmeticException();
        }
    }

    public Fractions add(Fractions n){
        int a = this.n;
        int b = this.d;
        int c = n.n;
        int d = n.d;
        int newN;
        int newD;
        newN = (a * d + b * c);
        newD = b*d;
        return new Fractions(newN, newD);
    }

    public boolean equals(Fractions other) {
        if (this.n != other.n) {
            return false;
        }
        if (this.d != other.d) {
            return false;
        }
        return true;
    }

    public String toString() {
        return n + "/" + d;
    }

    private int greatestComDenom(int n, int d) {
        if (d == 0) {
            return n;
        }
        return greatestComDenom(d, n % d);
    }


}
