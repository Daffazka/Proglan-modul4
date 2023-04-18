import java.util.Scanner;

public class modul4 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        extracted(input);
    }

    private static void extracted(Scanner input) {
        int hari, tahun, bulan, sisa, sisa1;

        System.out.print("Masukkan jumlah hari : ");
        hari = input.nextInt();

        tahun = hari / 365;
        sisa = hari % 365;

        bulan = sisa / 30;
        sisa1 = sisa % 30;

        System.out.println(hari + " hari = " + tahun + " tahun " + bulan + " bulan dan " + sisa1 + " hari");
    }
}
