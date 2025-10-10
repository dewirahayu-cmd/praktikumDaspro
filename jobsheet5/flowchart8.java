import java.util.Scanner;

public class flowchart8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan angka: ");
        int angka = sc.nextInt();

        String pesan = (angka % 2 == 0) ? "Output merupakan angka genap" : "Output merupakan angka ganjil";

        System.out.println(pesan);

        sc.close();
    }
    
}
