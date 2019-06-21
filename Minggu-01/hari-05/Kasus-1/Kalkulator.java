


import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int pilih ;
        double angka1 = 0, angka2 = 0, hasil = 0;
        boolean stop = false;
        String bantu;
        
        try {
            
            while(!stop){
                System.out.println("PILIH : \n"
                                 + "1.Tambah \n"
                                 + "2.Kurang \n"
                                 + "3.Kali \n"
                                 + "4.Bagi \n");
                pilih = input.nextInt();

                System.out.println("Angka 1 : ");
                angka1 = input.nextDouble();
                System.out.println("Angka 2 : ");
                angka2 = input.nextDouble();

                switch (pilih){
                    default : 
                        System.out.println("PILIHAN TIDAK ADA");
                        break;
                    case 1 :
                        hasil = angka1 + angka2;
                        System.out.println("angka1 + angka2 = " + hasil);
                        break;
                    case 2 :
                        hasil = angka1 - angka2;
                        System.out.println("angka1 - angka2 = " + hasil);
                        break;
                    case 3 :
                        hasil = angka1 * angka2;
                        System.out.println("angka1 * angka2 = " + hasil);
                        break;
                    case 4 :
                        hasil = angka1 / angka2;
                        System.out.println("angka1 / angka2 = " + hasil);
                        break;
                }

                System.out.println("\nTekan y atau ya atau Y atau YA jika ingin berhenti");
                bantu = input.next();
                if(bantu.equalsIgnoreCase("y") || bantu.equalsIgnoreCase("ya")){
                    stop = true;
                }
            }
        } catch (Exception e) {
        }
    }
}
