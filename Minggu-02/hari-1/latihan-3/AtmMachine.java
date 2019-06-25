import java.util.Scanner;
public class AtmMachine {
private double availableBal =80;
private double totalBal =100;
Scanner input = new Scanner(System.in);

public int userAccount() {
System.out.print("Masukan nomer account anda: ");
int account;
account = input.nextInt();
return account;
}
public int userPin() {
System.out.print("Masukan nomer PIN anda: ");
int pin;
pin =input.nextInt();
return pin;
}

public void startAtm(){
userAccount();
userPin();
drawMainMenu();
}

public void drawMainMenu() {
int selection;

System.out.println("\nATM main menu:");
System.out.println("1 - Melihat tabungan");
System.out.println("2 - Menarik uang");
System.out.println("3 - Menambah tabungan");
System.out.println("4 - Mengakhiri transaksi");
System.out.print("Choice: ");
selection =input.nextInt();

switch(selection){
case 1:
viewAccountInfo();
break;
case 2:
withdraw();
break;
case 3:
addFunds();
break;
case 4:
System.out.println("Terima kasih sudah mengunakan ATM");
}
}

public void viewAccountInfo() {
System.out.println("informasi account:");
System.out.println("\t--Total: Rp"+totalBal);
System.out.println("\t--Total tersedia: Rp"+availableBal);
drawMainMenu();
}

public void deposit(int depAmount) {
System.out.println("\n***Tolong masukan uang anda sekarang...***");
totalBal =totalBal +depAmount;
availableBal =availableBal +depAmount;
}

public void checkNsf(int withdrawAmount) {
if(totalBal -withdrawAmount < 0)
System.out.println("\n***ERROR!!! Insufficient funds in you account***");
else
{
totalBal =totalBal -withdrawAmount;
availableBal =availableBal -withdrawAmount;
System.out.println("\n***Tolong ambil uang anda sekarang...***");
}
}

public void addFunds() {
int addSelection;
System.out.println("Menabung:");
System.out.println("1 - Rp.20.000");
System.out.println("2 - Rp.50.000");
System.out.println("3 - Rp.100.000");
System.out.println("4 - Rp.1.000.000");
System.out.println("5 - Kembali ke menu");
System.out.print("Choice: ");
addSelection =input.nextInt();

switch(addSelection){
case 1:
deposit(20000);
drawMainMenu();
break;
case 2:
deposit(50000);
drawMainMenu();
break;
case 3:
deposit(100000);
drawMainMenu();
break;
case 4:
deposit(1000000);
drawMainMenu();
break;
case 5:
drawMainMenu();
break;
}
}

public void withdraw() {
int withdrawSelection;
System.out.println("Mengambil uang:");
System.out.println("1 - Rp.20.000");
System.out.println("2 - Rp.50.000");
System.out.println("3 - Rp.100.000");
System.out.println("4 - Rp.1.000.000");
System.out.println("5 - Kembali ke menu");
System.out.print("Choice: ");
withdrawSelection =input.nextInt();

switch(withdrawSelection) {
case 1:
checkNsf(20000);
drawMainMenu();
break;
case 2:
checkNsf(50000);
drawMainMenu();
break;
case 3:
checkNsf(100000);
drawMainMenu();
break;
case 4:
checkNsf(1000000);
drawMainMenu();
break;
case 5:
drawMainMenu();
break;
}
}

public static void main(String args[]) {
AtmMachine myAtm = new AtmMachine();
myAtm.startAtm();
}
}
