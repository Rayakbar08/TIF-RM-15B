import java.util.Scanner;
public class Dealer extends Barang {
public void tampil(){
String merek = "Yamaha";
String harga = "25jt";
String warna = "black";
String jenis = "15cc";
System.out.println("");
System.out.println("INPUT BARANG");
System.out.println("==============================");
Scanner input = new Scanner (System.in);
System.out.print("Kode :");
kode = input.nextLine();
Barang b = new Barang();
b.input ("Yamaha", "100", "sply");
System.out.println("Merek :"+merek);
System.out.println("harga :"+harga);
System.out.println("warna :"+warna;
System.out.println("jenis :"+jenis);
}
public void tampil2(){
String merek = "Honda";
String harga = "15JT";
String Warna = "red";
String jenis = "135cc";
Barang b = new Barang();
b.tampil ("suzuki", "black");
System.out.println("Merek :"+merek);
System.out.println("harga :"+harga);
System.out.println("warna :"+warna);
System.out.println("jenis :"+jenis);
}
}