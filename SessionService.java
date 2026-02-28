import java.util.*;

public class SessionService {

    static Scanner sc = new Scanner(System.in);

    public static void teach(int uid) {

        System.out.print("Enter skill title: ");
        String title = sc.nextLine();

        System.out.print("Write what you will teach: ");
        String content = sc.nextLine();

        SkillService.publishSkill(uid, title, content);
        UserService.earnCredit(uid);

        System.out.println("Skill published. +1 credit");
    }

    public static void learn(int uid) {

        if (SkillService.skills.isEmpty()) {
            System.out.println("No skills available.");
            return;
        }

        System.out.println("Available skills:");
        for (int i = 0; i < SkillService.skills.size(); i++) {
            System.out.println((i + 1) + ". " +
                    SkillService.skills.get(i).title);
        }

        System.out.print("Choose a skill number: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice < 1 || choice > SkillService.skills.size()) {
            System.out.println("Invalid choice");
            return;
        }

        Skill selectedSkill = SkillService.skills.get(choice - 1);

        if (UserService.useCredit(uid)) {

            System.out.println("\nYou are learning: " + selectedSkill.title);
            System.out.println("---- Content ----");
            System.out.println(selectedSkill.content);

        } else if (UserService.giveFreeTrial(uid)) {

            System.out.println("\nFree trial used.");
            System.out.println("You are learning: " + selectedSkill.title);
            System.out.println("---- Content ----");
            System.out.println(selectedSkill.content);

        } else {
            System.out.println("Out of credits. Please teach to earn credits.");
        }
    }
}