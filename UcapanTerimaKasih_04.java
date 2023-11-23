import java.util.Scanner;
public class UcapanTerimaKasih_04 {

  public static String PenerimaUcapan() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Tuliskan NAMA yang ingin Anda beri ucapan:");
    String namaOrang = sc.nextLine();
    sc.close();
    return namaOrang;

}
public static void UcapanTerimakasih(){
    System.out.println("thank you for being the best teacher in the world.\n"+
    "You inspired in me a love for learning and made me feel like I could ask you anything");  
}
public static void UcapanTambahan(String ucapanTambahan) {
  System.out.println("Ucapan Tambahan: " + ucapanTambahan);
}
public static void main (String[] args) {
  String penerima = PenerimaUcapan();
   UcapanTerimakasih();

   UcapanTambahan("Terima kasih atas semua bimbingan dan dukungan Anda, " + penerima + "!");
}
}
