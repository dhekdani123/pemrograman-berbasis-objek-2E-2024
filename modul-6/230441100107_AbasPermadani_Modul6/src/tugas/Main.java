package tugas;

public class Main {

  
    public static void main(String[] args) {
       PC alat1 = new PC ();
       Laptop alat2 = new Laptop ();
       Netbook alat3 = new Netbook ();
       
       alat1.hidupkan_os();
       alat1.matikan_os();
       alat1.klik_kanan();
       alat1.klik_kiri();
       alat1.tekan_enter();
       alat1.cetak_data();
       
       alat2.hidupkan_os();
       alat2.matikan_os();
       alat2.klik_kanan();
       alat2.klik_kiri();
       alat2.tekan_enter();
       alat2.cetak_data();
       
       alat3.hidupkan_os();
       alat3.matikan_os();
       alat3.klik_kanan();
       alat3.klik_kiri();
       alat3.tekan_enter();
       alat3.cetak_data();
    }
    
}
