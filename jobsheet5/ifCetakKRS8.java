import java.util.Scanner;

public class ifCetakKRS8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas ? (True/False): ");
        boolean uktLunas = sc.nextBoolean();

        String pesan = uktLunas ?
        "Pembayaran UKT terverifikasi\nSilakan cek KRS dan minta tangan DPA":
        "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
       
        System.out.println(pesan);
        
        sc.close();
    }
}

