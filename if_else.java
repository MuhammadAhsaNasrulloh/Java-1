import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
    int[] price = {35000, 20000, 15000};
    String[] ticket = {"VVIP", "VIP", "Reg"};

    
    ticket[0] = "VVIP";
    price[0] = 35000;
    ticket[1] = "VIP";
    price[1] = 20000;
    ticket[2] = "Reg";
    price[2] = 15000;
    
    Scanner scanner = new Scanner(System.in);//initialization input
    System.out.print("Masukkan tiket yang ingin dibeli: ");
    String selectedString = scanner.nextLine();

    System.out.print("Masukkan harga pembelian: ");//input harga 
    int buyPrice = scanner.nextInt();

    if(selectedString.equals(ticket[0]) && buyPrice >= price[0]){
        System.out.println("Anda membeli tiket :" + ticket[0]);
        System.out.println("Kembalian :" + (buyPrice - price[0]));
    } else if(selectedString.equals(ticket[1]) && buyPrice >= price[1]){
        System.out.println("Anda membeli tiket :" + ticket[1]);
        System.out.println("Kembalian :" + (buyPrice - price[1]));
    } else if(selectedString.equals(ticket[2]) && buyPrice >= price[2]){
        System.out.println("Anda membeli tiket :" + ticket[1]);
        System.out.println("Kembalian :" + (buyPrice - price[2]));
    } else{
        System.out.println("Maaf uang anda kurang");
    }
    

}
}
