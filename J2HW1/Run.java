package J2HW1;
/**
 * Java Core.  Homework 1
 * @author Yaforov Roman
 * @version Date: 16.05.2022 г.
 */

public abstract class Run {
    protected final static boolean run(Obscacle[] obscacles, Member member){
        for (Obscacle obscacle : obscacles){
            if(!obscacle.ablePass(member.getSkill())){
                return  false;
            }
        }
        return true;
    }
    protected abstract void doIt(Team team);
}