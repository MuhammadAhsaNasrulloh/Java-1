import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int change;
        
        String[] brand = {"nestle", "unilever", "danone"};
        int[] price = {1000, 5000, 8000};
        
        brand[0] = "nestle";
        price[0] = 3000;
        brand[1] = "unilever";
        price[1] = 5000;
        brand[2] = "danone";
        price[2] = 4000;
        
        

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan merek yang ingin dibeli: ");
        String selectedBrand = scanner.nextLine();

        System.out.print("Masukkan harga pembelian: ");
        int buyPrice = scanner.nextInt();

        if(selectedBrand.equals(brand[0]) && buyPrice >= price[0]){
            System.out.println("Anda membeli " + brand[0]);
            System.out.println("Kembalian :" + (change = buyPrice - price[0]));
        } else if(selectedBrand.equals(brand[1]) && buyPrice >= price[1]){
            System.out.println("Anda membeli " + brand[1]);
            System.out.println("Kembalian :" + (change = buyPrice - price[1]));
        } else if(selectedBrand.equals(brand[2]) && buyPrice >= price[2]){
            System.out.println("Anda membeli " + brand[2]);
            System.out.println("Kembalian : " + (change = buyPrice - price[2]));
        } else{
            System.out.print("Tidak bisa membeli barang");
        }
            
    }
}
