public class Dealer extends Barang{
public void tampil(){
String merek = "yamaha;
String harga = " 15jt ";
String warna= "black";
String jenis = "150cc";
Barang b = new Barang();
b.input ("Yamaha", "2", "sply");
System.out.println("Merek :"+merek);
System.out.println("harga :"+harga);
System.out.println("Warna:"+warna);
System.out.println("jenis :"+jenis);
}
}