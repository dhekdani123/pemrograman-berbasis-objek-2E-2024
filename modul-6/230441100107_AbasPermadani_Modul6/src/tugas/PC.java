
package tugas;


public class PC extends Komputer implements Mouse, Keyboard, Printer {
    @Override
    public void hidupkan_os(){
        System.out.println("silahkan hidupkan PC anda dengan tombol power");
    }
    @Override
    public void matikan_os(){
        System.out.println("silahkan matikan PC anda dengan tombol power");
    }
    @Override
    public void klik_kanan(){
        System.out.println("klik kanan untuk sesuatu pada PC anda");
    }
    @Override
     public void klik_kiri(){
        System.out.println("klik kiri untuk sesuatu pada PC anda");
    }
    @Override
    public void tekan_enter(){
        System.out.println("tekan enter pada PC anda untuk memberikan space pada deskripsi");
    }
    @Override
    public void cetak_data(){
        System.out.println("silahkan cetak data anda dengan icon print yang ada di PC anda");
        System.out.println();
    }
    
}
