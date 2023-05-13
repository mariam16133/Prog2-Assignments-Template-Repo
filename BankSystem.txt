//Mariam Mohamed
//20216133

package BankSystem;

final class Bankaccount {
    private double balance ;

    public double getBalance() {
        return balance + balance * 0.1;

    }

    public void setBalance(double balance) {
        if (balance >=0 || balance <=100000){
            this.balance +=balance;
        }
    }
    public void setBalance(double balance, double Tax ){
        this.balance += balance - (balance * (Tax/100));
    }

}




public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Mariam", 20, "Female", 6000, "IT");
        employee.PrintData();
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Department: " + employee.getDepartment());

        customer customer = new customer("Mariam", 20, "Female", "112233445", "10 ZAYED St");



        Bankaccount Bank = new Bankaccount();
        Bank.setBalance(1000);
        Bankaccount Bank2 = new Bankaccount();
        Bank.setBalance(1000,20);
        System.out.println(Bank.getBalance());
        System.out.println(Bank2.getBalance());





    }
}
