class Laporan {
public void cetak(){
System.out.println("");
System.out.println(" FAKTUR");
System.out.println("=====================");
Admin a = new Admin();
a.update_Admin();
Sparepart c = new Sparepart();
c.tampil2();
}
public void ubah_lap() {
}
public void hapus_lap(){
}s
public void buat_lap(){
}
public boolean apakahHabis(){
return true;
}
}