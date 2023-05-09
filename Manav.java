import java.util.Scanner;

public class Manav{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Armut = 2.14; 
        double Elma = 3.67 ;
        double Domates= 1.11 ;
        double Muz =0.95 ;
        double Patlican= 5.00;
        
        System.out.print("Armut kaç kilo ?: ");
        double armut = sc.nextDouble();

        System.out.print("Elma kaç kilo ?: ");
        double elma = sc.nextDouble();

        System.out.print("Domates kaç kilo ?: ");
        double domates = sc.nextDouble();

        System.out.print("Muz kaç kilo ?: ");
        double muz = sc.nextDouble();
        
        System.out.print("patlıcan kaç kilo ?: ");
        double patlican = sc.nextDouble();

        double toplam = (Armut * armut) + (Elma * elma) + (Domates * domates) + (Muz * muz) + (Patlican * patlican);
        System.out.print("Toplam tutar: "+toplam+"TL");
    }
}