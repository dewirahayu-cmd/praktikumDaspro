import java.util.Scanner;

public class ifCetakKRS8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas ? (True/False): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cek KRS dan minta tangan DPA");
        } else {
            System.out.print("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }

    }
    
}
