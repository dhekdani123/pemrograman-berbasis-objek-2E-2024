package tugasmodul4.pkg5;


abstract class karyawan {
    String nama;
    int usia;
    String posisi;
    
    public karyawan (String nama, int usia, String posisi){
        this.nama = nama;
        this.usia = usia;
        this.posisi = posisi;
        
    }
    
    public abstract void tampilkanData ();
    
    
}
