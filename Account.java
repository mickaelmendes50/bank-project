public class Account {
    private int mType;
    private Person mPerson;

    private static int sNumber = 0;

    Account(int type, Person person) {
        mType = type;
        mPerson = person;
    }

    public static void setsNumber() {
        Account.sNumber++;
    }

    public String toString() {
        String accountData = " - " + mType +
                             "\n   Número: "+ sNumber;
        return accountData;
    }
}
