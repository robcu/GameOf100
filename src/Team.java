import java.util.ArrayList;

public class Team {

    static String teamMember1; // needs to be Player class and not String - left as String so it can be testable

    static String teamMember2; // needs to be Player class and not String - left as String so it can be testable

    String teamName;

    int runningScore;

    int roundScore;

    public Team() {
    }

    public Team(String teamMember1, String teamMember2, String teamName, int runningScore, int roundScore) {
        this.teamMember1 = teamMember1;
        this.teamMember2 = teamMember2;
        this.teamName = teamName;
        this.runningScore = runningScore;
        this.roundScore = roundScore;
    }

    public static String getTeamMember1() {
        return teamMember1;
    }

    public void setTeamMember1(String teamMember1) {
        this.teamMember1 = teamMember1;
    }

    public static String getTeamMember2() {
        return teamMember2;
    }

    public void setTeamMember2(String teamMember2) {
        this.teamMember2 = teamMember2;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getRunningScore() {
        return runningScore;
    }

    public void setRunningScore(int runningScore) {
        this.runningScore = runningScore;
    }

    public int getRoundScore() {
        return roundScore;
    }

    public void setRoundScore(int roundScore) {
        this.roundScore = roundScore;
    }

    public static ArrayList<String> makeTeam(String teamMember1, String teamMember2) {
        ArrayList<String> team = new ArrayList();
        team.add(getTeamMember1());
        team.add(getTeamMember2());
        return team;
    }

}