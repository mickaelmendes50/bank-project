import java.util.ArrayList;

public class Person {
    private String mName;
    private String mSurname;
    private String mCPF;
    private long mPhoneNumber;

    private ArrayList <Account> accounts = new ArrayList<Account>();

    Person(String name, String surname, String cpf, long phoneNumber) {
        mName = name;
        mSurname = surname;
        mCPF = cpf;
        mPhoneNumber = phoneNumber;
    }

    // Cria uma conta 
    public void createAccount(Person person, int type) {        
        Account newAccount = new Account(type, person);
        accounts.add(newAccount);
    }

    public String toString() {
        String personData = "\n-----------------------------\n" +
                            "\nName: " + mName + " " + mSurname +
                            "\nCPF: " + mCPF +
                            "\nPhone Number: " + mPhoneNumber + 
                            "\nContas:\n";
        for (int i = 0; i < accounts.size(); i++) {
            personData += accounts.get(i);
        }
        return personData;
    }
}
