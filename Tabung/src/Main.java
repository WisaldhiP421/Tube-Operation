import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tabung tabung1 = new Tabung();
        String lagi = "y";

        while(lagi.equalsIgnoreCase("Y")){
            System.out.println();
            System.out.println("------ Operasi Tabung ------");

            System.out.println();
            System.out.print("Masukkan Jari-jari : ");
            tabung1.setJari(input.nextInt());

            System.out.print("Masukkan Tinggi : ");
            tabung1.setTinggi(input.nextInt());

            System.out.println();
            System.out.println("-------- Hasil --------");
            System.out.println("Jari-jari Tabung : " + tabung1.jari);
            System.out.println("Tinggi Tabung : " + tabung1.tinggi);
            System.out.println("Luas Tabung : " + tabung1.getLuas());
            
            System.out.println();
            System.out.print("Ingin Menghitung Lagi? [Y/T] : ");
            lagi = input.next();
        }
    }
}
