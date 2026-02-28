import java.util.*;

public class SkillService {

    static List<Skill> skills = new ArrayList<>();

    public static void publishSkill(int teacherId, String title, String content) {
        skills.add(new Skill(teacherId, title, content));
    }
}