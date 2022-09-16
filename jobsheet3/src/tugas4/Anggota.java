package tugas4;
public class Anggota {
    private String noAnggota;
    private String nama;
    private int jumlahPinjaman;
    private int limitPinjaman;
    
    Anggota(String noAnggota, String nama, int limitPinjaman){
        this.noAnggota=noAnggota;
        this.nama=nama;
        this.limitPinjaman=limitPinjaman;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return this.nama;
    }
    public void setLimitPinjaman(int limitPinjaman){
        this.limitPinjaman=limitPinjaman;
    }
    public float getLimitPinjaman(){
        return this.limitPinjaman;
    }
    public void setNoAnggota(String alamat){
        this.noAnggota=noAnggota;
    }
    public String getNoAnggota(){
        return this.noAnggota;
    }
    public void pinjam(int uang){
        if(uang>this.limitPinjaman){
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }else{
            this.jumlahPinjaman+=uang;
        }
    }
    public float getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    public void angsur(int uang){
        if(uang<(this.jumlahPinjaman*10/100)){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }else{
            jumlahPinjaman-=uang;
        }
    }
    
}
