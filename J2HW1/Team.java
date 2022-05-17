package J2HW1;
/**
 * Java Core.  Homework 1
 * @author Yaforov Roman
 * @version Date: 16.05.2022 г.
 */

public class Team {

    private final String teamName; // Название Команды
    public final Member[] members; // Список команды

    public Team(Member... members) {
        this("Атлеты", members);
    }
    public Team(String teamName, Member... members) {
        this.teamName = teamName;
        this.members = members;
    }

    @Override
    public String toString() {
        String print =  "Название комманды: \"" + teamName + "\"\n" +
                "Члены комманды: \n" ;
        for (Member i : members){
            print += i.toString() + "\n";
        }
        return print;
    }

    public void showResults() {
        System.out.println("Список членов комманды \"" + teamName +
                "\", прошеших испытание:\n");
        for(Member member: members){
            if (member.finished) {
                System.out.println(member);
            }
        }
    }

    public void showTeam() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Team team = new Team(
                new Member("Адольф", 61),
                new Member("Рудольф", 40),
                new Member("Леопольд", 70),
                new Member("Фольдж", 80));
        Course c = new Course(Obscacle.RUNING, Obscacle.CLIMBING, Obscacle.JUMPING, Obscacle.SWINIMNG);
        c.doIt(team);
        team.showTeam();
        team.showResults();
    }
}