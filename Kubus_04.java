import java.util.Scanner;

public class Kubus_04 {
  
    public static int hitungVolume(int sisi) {
        return sisi*sisi*sisi;
    }

    
    public static int hitungLuasPermukaan(int sisi) {
        return 6*sisi*sisi;
    }
   
    public static void main(String[] args) {
        Scanner scan04 = new Scanner(System.in);
        int s,LP,Vol;

        System.out.print("Masukkan panjang sisi :");
        s = scan04.nextInt();

        LP = hitungLuasPermukaan(s);
        System.out.println("Luas Persegi adalah :" +LP);

        Vol = hitungVolume(s);
        System.out.println("Volume Kubus adalah :" +Vol);
        
    }

}
