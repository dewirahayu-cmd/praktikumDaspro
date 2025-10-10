import java.util.Scanner;

public class izinMasuk8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---IZIN MASUK---");
        System.out.println("Apakah anda membawa kartu atau sudah registrasi online? ");
        System.out.println("Apakah anda sudah memenuhi IZIN tersebut? (True/False): ");
        boolean izinMasuk = sc.nextBoolean();

        String pesan = izinMasuk ?
        "Izin anda terpenuhi\nAnda bisa masuk kedalam perpustakaan! " : "Izin anda tak terpenuhi\nAnda tidak bisa masuk kedalam perpustakaan.";
       
        System.out.println(pesan);

        sc.close();



    }
}
