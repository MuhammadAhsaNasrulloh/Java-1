import java.util.Scanner;

public class kalkulator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan angka pertama");
        double angka1 = scanner.nextDouble();

        System.out.println("Masukkan angka kedua");
        double angka2 = scanner.nextDouble();

        System.out.println("Pilih operasi (+, -, /, *)");
        char operator = scanner.next().charAt(0);

        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '/':
                if(angka2 != 0){
                    hasil = angka1 / angka2;
                } else{
                    System.out.println("Error : Pembagian oleh nilai null tidak di perbolehkan.");
                    return;
                }
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            default:
                break;
            }
        System.out.println("Hasil :" + hasil);

    }
}