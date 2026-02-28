import java.util.*;

public class UserService {

    static Map<Integer, User> users = new HashMap<>();

    public static int register(String name) {
        int id = users.size() + 1;
        users.put(id, new User(id, name));
        return id;
    }

    public static void earnCredit(int uid) {
        users.get(uid).credits++;
    }

    public static boolean useCredit(int uid) {
        User u = users.get(uid);
        if (u.credits > 0) {
            u.credits--;
            return true;
        }
        return false;
    }

    public static boolean giveFreeTrial(int uid) {
        User u = users.get(uid);
        if (!u.trialUsed) {
            u.trialUsed = true;
            return true;
        }
        return false;
    }

    public static int getCredits(int uid) {
        return users.get(uid).credits;
    }
}