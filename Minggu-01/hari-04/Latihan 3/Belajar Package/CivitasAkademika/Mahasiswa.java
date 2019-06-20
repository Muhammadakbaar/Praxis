package CivitasAkademika;

public class Mahasiswa{
    private String nim;
    private String nama;
        public Mahasiswa(String nim, String nama){
            this.nim = nim;
            this.nama = nama;
        }
        public void cetakMhs(){
            System.out.println(this.nim+"(Saya Mahasiswa"+this.nama+" 155410100)");
        }
}