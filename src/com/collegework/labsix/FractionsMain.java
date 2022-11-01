package src.com.collegework.labsix;

public class FractionsMain {
    public static void main(String[] args){
        Fractions[] fractionsObject = new Fractions[3];

        fractionsObject[0] = new Fractions(1, 4);
        fractionsObject[1] = new Fractions(5, 6);
        fractionsObject[2] = new Fractions(6, 5);

        fractionsObject[0].add(fractionsObject[1]);
        System.out.println(fractionsObject[1].getNum());
        fractionsObject[2].getDenom();
        fractionsObject[1].setNum(1);
        fractionsObject[0].equals(fractionsObject[1]);
        System.out.println(fractionsObject[0]);
        System.out.println(fractionsObject[1]);
    }
}
