public class Person {
    private String fName;
    private String mName;
    private String lName;

    public Person(String fName, String mName, String lName) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }

    public boolean hasFullName() {
        return mName != null && !mName.equals("") && !mName.equals(" ");
    }

    public String fullName() {
        return createFullName();
    }

    private String createFullName() {
        boolean hFn = hasFullName();
        if (hFn) {
            return String.format("%s %s %s", fName, mName, lName);
        }
        return String.format("%s %s", fName, lName);
    }
}
