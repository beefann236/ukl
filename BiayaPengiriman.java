import java.util.Scanner;

public class BiayaPengiriman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi;
        double biayaPerKg = (jarak <= 10) ? 4250 : 6000;
        double biaya = berat * biayaPerKg;

        if (volume > 100) {
            biaya += 50000;
        }

        System.out.println("\nVolume paket: " + volume + " cm³");
        System.out.println("Total biaya pengiriman: Rp " + biaya);
    }
}
