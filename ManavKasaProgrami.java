import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double  ArmutFiyat = 2.14, ArmutKg,
                ElmaFiyat = 3.67, ElmaKg,
                DomatesFiyat = 1.11, DomatesKg,
                MuzFiyat = 0.95, MuzKg,
                PatlicanFiyat = 5, PatlicanKg,
                ToplamTutar;

        System.out.print("Armut Kac kilo ?:");
        ArmutKg = input.nextDouble();

        System.out.print("Elma Kac kilo ?:");
        ElmaKg = input.nextDouble();

        System.out.print("Domates Kac kilo ?:");
        DomatesKg = input.nextDouble();

        System.out.print("Muz Kac kilo ?:");
        MuzKg = input.nextDouble();

        System.out.print("Patlican Kac kilo ?:");
        PatlicanKg = input.nextDouble();

        ToplamTutar = (ArmutFiyat*ArmutKg) + (ElmaFiyat*ElmaKg) + (DomatesFiyat*DomatesKg) +
                (MuzFiyat*MuzKg) + (PatlicanFiyat*PatlicanKg);

        System.out.println("alisveris toplami" + ToplamTutar +" TL. Iyi gunler dileriz");

    }
}
