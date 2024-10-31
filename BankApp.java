import java.util.Scanner; 

class Client {
    private String firstName;
    private String lastName;

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

class Account {
    private String accountType;
    private Client owner;

    public Account(String accountType, Client owner) {
        this.accountType = accountType;
        this.owner = owner;
    }

    public String getAccountType() {
        return accountType;
    }

    public Client getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Konto typu: " + accountType + ", wlasciciel: " + owner.toString();
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Podaj imie klienta: ");
        String firstName = scanner.nextLine();
        System.out.print("Podaj nazwisko klienta: ");
        String lastName = scanner.nextLine();
        System.out.print("Podaj typ konta (np. Osobiste, Oszczednościowe): ");
        String accountType = scanner.nextLine();

        
        Client client = new Client(firstName, lastName);
        Account account = new Account(accountType, client);

        
        System.out.println(client.getFirstName() + " " + client.getLastName() + " zalozyl " + account.toString());

        
        scanner.close();
    }
}


