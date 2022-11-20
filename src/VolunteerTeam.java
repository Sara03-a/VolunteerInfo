import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Collections;



public class VolunteerTeam {
    private ArrayList<Volunteer> team = new ArrayList<>();

    public VolunteerTeam() {
    }

    public void addMember(Volunteer vt){
        team.add(vt);
    }

    public double getTotalVolunteers(){
        double totalVolunteers = 0;
        for(Volunteer vt : team){
            totalVolunteers += vt.getWages();
        }
        return totalVolunteers;
    }

    public String getTeamDetails(){
        StringBuilder sb = new StringBuilder();
        for(Volunteer vt : team){
            sb.append(String.format("%-10s | %7s | %10s | %7s" , vt.getName(), vt.getBoxes(), getMoney(vt.getWages()), vt.getFurtherBoxes()));

            sb.append("\n");
        }
        return sb.toString();
    }

    public String getMoney(double amount){
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);
        return nf.format(amount);
    }

    public void sortTeam(){
        Collections.sort (team);

    }
}