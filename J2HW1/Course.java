package J2HW1;
/**
 * Java Core.  Homework 1
 * @author Yaforov Roman
 * @version Date: 16.05.2022 г.
 */

public class Course extends Run {

    private final Obscacle[] obscacles;
    public Course(Obscacle... obscacles) {
        this.obscacles = obscacles;
    }

    @Override
    protected void doIt(Team team) {
        for(Member member: team.members){
            member.finished = run(obscacles, member);
        }
    }
}