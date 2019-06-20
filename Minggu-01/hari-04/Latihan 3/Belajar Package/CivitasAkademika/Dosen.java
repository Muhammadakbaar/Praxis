package CivitasAkademika;

public class Dosen{
    private String nik;
    private String nama;

    public Dosen(String nik, String nama){
        this.nik = nik;
        this.nama = nama;
    }
    public void cetakDosen(){
        System.out.println(this.nik+"(Saya Dosen"+this.nama+" 125510100)");
    }
}