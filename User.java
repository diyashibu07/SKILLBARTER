public class User {
    int id;
    String name;
    int credits;
    boolean trialUsed;   // NEW

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.credits = 0;
        this.trialUsed = false;   // NEW
    }
}