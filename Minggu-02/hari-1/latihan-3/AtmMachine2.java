import java.util.Scanner;
 
public class AtmMachine2{
 
    private static Scanner in; 
    private static float balance = 0; // initial balance to 0 for everyone
    private static int anotherTransaction;
 
    public static void main(String args[]){
        in = new Scanner(System.in);
 
        // call our transaction method here 
        transaction();
    }
 
    private static void transaction(){
        // here is where most of the work is
 
        int choice; 
 
        System.out.println("Silakan pilih satu opsi"); 
        System.out.println("1. Tarik Tunai");
        System.out.println("2. Liat Tabungan");
        System.out.println("3. Liat Saldo");
 
        choice = in.nextInt();
 
        switch(choice){
            case 1:
                float amount; 
                System.out.println("Silakan masukkan jumlah yang akan ditarik: "); 
                amount = in.nextFloat();
                if(amount > balance || amount == 0){
                    System.out.println("Anda memiliki dana yang tidak mencukupi\n\n"); 
                    anotherTransaction(); // ask if they want another transaction
                } else {
                    // they have some cash
                    // update balance 
                    balance = balance - amount; 
                    System.out.println("Silahkan Ambil Uang anda "+amount+" dan sisa saldo anda adalah "+balance+"\n");
                    anotherTransaction(); 
                }
            break; 
 
            case 2:
                // option number 2 is depositing 
                float deposit; 
                System.out.println("Silakan masukkan jumlah setoran: "); 
                deposit = in.nextFloat();
                // update balance 
                balance = deposit + balance;
                System.out.println("Anda sudah menyetor"+deposit+" saldo baru anda adalah "+balance+"\n");
                anotherTransaction();
            break; 
 
            case 3:
                // this option is to check balance 
                System.out.println("Saldo anda adalah "+balance+"\n");
                anotherTransaction(); 
            break;
 
            default:
                System.out.println("Opsi tidak valid:\n\n"); 
                anotherTransaction();
            break;
        }
 
    }
 
    private static void anotherTransaction(){
        System.out.println("Apakah Anda ingin transaksi lain?\n\nTekan 1 Untuk transaksi lain\n2 untuk keluar");
        anotherTransaction = in.nextInt();
        if(anotherTransaction == 1){
            transaction(); // call transaction method
        } else if(anotherTransaction == 2){
            System.out.println("Thanks for choosing us. Good Bye!");
        } else {
            System.out.println("Invalid choice\n\n");
            anotherTransaction();
        }
    }
}