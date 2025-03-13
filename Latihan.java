import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();
        
        int jumlahVokal = 0;
        String vokal = "aiueoAIUEO";
        
        for (char c : kalimat.toCharArray()) {
            if (vokal.indexOf(c) != -1) {
                jumlahVokal++;
            }
        }
        
        String hasil;
        switch (jumlahVokal % 2) {
            case 0:
                hasil = "Jumlah vokal genap";
                break;
            case 1:
                hasil = "Jumlah vokal ganjil";
                break;
            default:
                hasil = "Error";
        }

        System.out.println("Jumlah huruf vokal: " + jumlahVokal);
        System.out.println(hasil);

        System.out.print("String terbalik: ");
        char[] charArray = kalimat.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();

        scanner.close();
    }
}