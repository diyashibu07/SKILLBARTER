import java.util.*;

public class SkillBarter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        int uid = UserService.register(name);

        while (true) {

            System.out.println("\nYour credits : " + UserService.getCredits(uid));
            System.out.println("1. Teach");
            System.out.println("2. Learn");
            System.out.println("3. Exit");

            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                SessionService.teach(uid);
            } else if (ch == 2) {
                SessionService.learn(uid);
            } else {
                break;
            }
        }
    }
}