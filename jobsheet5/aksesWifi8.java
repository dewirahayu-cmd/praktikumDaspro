import java.util.Scanner;

public class aksesWifi8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;
        int sks;

        System.out.print("Masukkan jenis pengguna! (Mahasiswa/Dosen): ");
        String jenisPengguna = sc.nextLine().trim();

        if (jenisPengguna.equalsIgnoreCase("Dosen")) {
            pesan = "Akses wifi diberikan (Dosen)";
        } else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan jumlah SKS mahasiswa: ");
            sks = sc.nextInt();

            if (sks >= 12) {
                pesan = "Akses wifi diberikan (Mahasiswa aktif)";
            } else {
                pesan = "Akses ditolak, SKS kurang dari 12";
            }
        } else {
            pesan = "Akses ditolak (bukan Mahasiswa/Dosen)";
        }

        System.out.println(pesan);
        sc.close();
    }
}






