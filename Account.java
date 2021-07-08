public class Account {
    private String mType;
    private Person mPerson;
    private int mNumber;

    private static int sNumber = 1;

    Account(int type, Person person) {
        setType(type);
        mPerson = person;
        mNumber = sNumber;
        setNumber();
    }

    public void setType(int type) {
        switch (type) {
            case 1:
                mType = "Poupança";
                break;
            case 2:
                mType = "Salário";
                break;
            case 3:
                mType = "Corrente";
                break;
            default:
                System.out.println("Not a valid option");
                break;
        }
    }

    public static void setNumber() {
        Account.sNumber++;
    }

    public String toString() {
        String accountData = " - " + mType +
                             "\n   Número: "+ mNumber;
        return accountData;
    }
}
