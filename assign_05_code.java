//Mariam Mohamed 20216133


class BankAccount {
    public double balance;
    public String username;
    public String bankname;
    public final String country = "Egypt";
    public int Numofusers = 0;
    public int Numofcalls = 0;
    public BankAccount(){
        System.out.println("Bank account has been created");
        Numofusers ++;
    }
    public BankAccount(double x, String n, String b){
        balance = x;
        username = n;
        bankname = b;
        Numofusers ++;

    }
    public void Deposite (double amount){
        balance+= amount;
        Numofcalls++;

    }
    public void Withdraw (double amount) {
        balance -= amount;
        Numofcalls++;
    }

    public class Main{
        public static void main(String[] args){
            BankAccount acc1 = new BankAccount();
            BankAccount acc2 = new BankAccount(1612,"Mariam","bank" );
            acc2.Deposite(1000);
            acc2.Withdraw(500);
            System.out.println("balance of account is =" +acc2.balance);
            System.out.println(acc2.Numofcalls);
            System.out.println(acc2.Numofusers);
        }
    }
}
