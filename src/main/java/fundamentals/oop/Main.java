package fundamentals.oop;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        //  System.out.println("Type: " + bankAccount.getType());
        //  System.out.println("Currency: " + bankAccount.getCurrency());
        //case 1: give bank account to the client from the outside (created outside)
        Client client = new Client("Larisa", "20332544641516", bankAccount);
        // System.out.println(client.toString());

        client.getBankAccount().addMoney(25.5);
        //  System.out.println(client.toString());
        client.getBankAccount().setType("SAVING");
        client.getBankAccount().addMoney(10);
        client.getBankAccount().withdrawMoney(50);
        double x = BankAccount.covertMoneyToCurrency(10, "EUR", "USD");
        //  System.out.println(BankAccount.covertMoneyToCurrency(10, "EUR", "USD"));
        //  System.out.println(x);

        BankAccount bankAccount1 = new BankAccount("SAVING", "USD");
        BankAccount bankAccount2 = new BankAccount("SPENDING", "USD");
        BankAccount[] bankArray = {bankAccount1, bankAccount2};

        client.setBankAccounts(bankArray);
        // System.out.println(bankArray[0]);
        BankAccount[] clientBankaccounts = client.getBankAccounts(); //sau linia 31 in loc de 29 + 30
        //System.out.println(clientBankaccounts[0]);
        // System.out.println(client.getBankAccounts()[0]);
        System.out.println(client);
        System.out.println("Type of new bankaccount (SAVING/SPENDING): ");
        String newTypeAccount = scanner.next();
        System.out.println("Select currency for new bankaccount (EUR/USD): ");
        String newCurrency = scanner.next();
        BankAccount newBankAccount = new BankAccount(newTypeAccount, newCurrency);
        client.addBankAccount(newBankAccount);
        System.out.println("Client`s status bankaccounts (update): " + client);
        System.out.println("The SAVING account is: " + client.getSavingAccount());
        System.out.println("Enter the type of bankaccount you want to remove (SAVING/SPENDING): ");
        newTypeAccount = scanner.next();
        client.removeAccountByType(newTypeAccount);
        System.out.println(client);

       /* System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("CNP: ");
        String cnp = scanner.next();
        //case 2: client has asigned by default a default banck account - create the bank account inside the constructor
        Client client2 = new Client(name, cnp); // contructorii se folosec cu new pt a putea crea obiecte
        System.out.println(client2.toString());
*/
    }
}
