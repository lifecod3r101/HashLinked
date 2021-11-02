import java.util.LinkedList;

public class LinkedListProg {
    private LinkedList<String> teams = new LinkedList<>();
    private int teamPosition;
    private double teamPoints;
    private LinkedList<String> sortedTeams = new LinkedList<>();
    //A method to get user input. From the input, there should be sorting and returning team position.
    //Input: Team points
    //Output: Team position
    //Use bubble sort

    //Theoretical idea: Loop through the sorted linked list and based on the si
    private LinkedListProg() {
        for (String entry : sortedTeams) {
            teamPosition = sortedTeams.indexOf(entry);
        }
        System.out.println(teamPosition);
    }
}
