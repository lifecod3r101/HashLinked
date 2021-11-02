import java.util.HashMap;
import java.util.Scanner;

public class HashMapProg {
    HashMap<Integer, String> plTeams = new HashMap<>();
    private int id;
    private String teamName;
    private Scanner s = new Scanner(System.in);

    protected void enterTeam() {
        System.out.println("Enter the team's ID\n");
        id = s.nextInt();
        if (plTeams.containsKey(id)) {
            System.out.println("Sorry. A team with this ID exists\n");
        } else {
            System.out.println("Enter the team's name\n");
            teamName = s.nextLine();
            plTeams.put(id, teamName);
        }
    }



}
