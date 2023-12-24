public class exercise {
    public static void main(String[] args){
        int[] harga = {5000, 10000, 15000};
        String[] ticket = {"Regular", "VIP", "VVIP"}; 


        harga[0] = 5000;
        ticket[0] = "Regular";
        harga[1] = 10000;
        ticket[0] = "VIP";
        harga[2] = 15000;
        ticket[2] = "VVIP";

        int  buy = 10000;
        int change;

        if(buy == harga[0] || buy >= harga[0]){
            System.out.println("Tiket anda :" + ticket[0]);
            System.out.println("Kembalian : " + (change = buy - harga[0]));

        }else if (buy == harga[1] || buy >= harga[1]){
            System.out.println("Tiket anda :" + ticket[1]);
            System.out.println("Kembalian :" + (change = buy - harga[1]));
        }

    }
}
