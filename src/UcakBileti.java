import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        int km, age, typeOfFlight;
        double perKm = 0.10;

        Scanner input = new Scanner(System.in);

        System.out.println(" Please give me the distance : ");
        km = input.nextInt();

        System.out.println(" What is your age: ");
        age = input.nextInt();

        System.out.println(" One way => 1 or Round trip => 2 ");
        typeOfFlight = input.nextInt();

        double toplam = (km * perKm);
        double Tutarcocuk= (toplam * 0.50);
        double Tutar1 =((Tutarcocuk * 2)*0.20) ;
        double Tutar2 = (Tutarcocuk - Tutar1);
        double Tutar3 = (toplam * 0.10);
        double Tutar4 = ((Tutar3 * 2)*0.20);
        double Tutar5 = (toplam * 0.3);
        double Tutar6 = ((Tutar5 * 2 ) * 0.20);
        double Tutar7 = (Tutar5 - Tutar6);
        if (( age <= 12 ) && (typeOfFlight == 2)) {
            System.out.println(" Ucret: "+ Tutar2);
            }
            else if(( age <= 12 ) && (typeOfFlight == 1)) {
            System.out.println(" Ucret : "+ Tutarcocuk);
        }
            else if ((age >12) && (age <= 24) && (typeOfFlight == 2)) {
            System.out.println(" Ucret" + Tutar4);
        }
            else if((age >12) && (age <= 24) && (typeOfFlight == 1)) {
            System.out.println(" Ucret: " + Tutar3);
        }
            else if (( age > 65 ) && (typeOfFlight == 2 )) {
            System.out.println( " Ucret : "+ Tutar7);
        }   else if (( age > 65 ) && (typeOfFlight == 1 )) {
            System.out.println(" Ucret: " + Tutar5);
        }   else {
            System.out.println(" Hatali islem yaptiniz..");
        }
    }
        }



