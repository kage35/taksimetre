import java.util.Scanner;
public class taksi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kmBasiUcret = 2.20; // KM başına ücret
        double minUcret = 20; // minimum ödenecek ücret
        double acilisUcreti = 10; // açılış ücreti

        // Kullanıcıdan mesafe girişi iste
        System.out.print("Gidilen mesafe (km): ");
        double mesafe = sc.nextDouble();

        // Taksimetre ücretini hesapla
        double taksiUcreti = acilisUcreti + mesafe * kmBasiUcret;
        if (taksiUcreti < minUcret) {
            taksiUcreti = minUcret;
        }

        // Taksimetre ücretini ekrana yazdır
        System.out.println("Taksimetre ücreti: " + taksiUcreti + " TL");
    }
}
