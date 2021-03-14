class Mobil {
      String warna_mobil;
	int tahun_produksi;
      boolean hidup;
      int gigi;

      public void nyalakan_mobil(){
            hidup = true;
      }
      public void matikan_mobil(){
            hidup = false;
      }
      public void ubahGigi(int gigiBaru){
            gigi = gigiBaru;
      }
}
public class MobilDemo2 {
      public static void main(String[] args){
	      Mobil mobil_saya = new Mobil();
            mobil_saya.warna_mobil = "Merah";
            mobil_saya.tahun_produksi = 1996 ;

            mobil_saya.hidup = false;
            mobil_saya.gigi = 0;
            System.out.println("Warna Mobil : " + mobil_saya.warna_mobil);
            System.out.println("Tahun Produksi Mobil : " + mobil_saya.tahun_produksi);
            System.out.println("Hidupkan Mobil : " + mobil_saya.hidup);
            System.out.println("Gigi Mobil Sekarang : " + mobil_saya.gigi);
            mobil_saya.nyalakan_mobil();
            System.out.println("Hidupkan Mobil : " + mobil_saya.hidup);
            mobil_saya.ubahGigi(1);
            System.out.println("Gigi Mobil Sekarang : " + mobil_saya.gigi);
      }
}
