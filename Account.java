public class Account {
    private int mType;
    private Person mPerson;

    private static int sNumber = 1;

    Account(int type, Person person) {
        mType = type;
        mPerson = person;
    }

    public static void setsNumber() {
        Account.sNumber++;
    }
}
