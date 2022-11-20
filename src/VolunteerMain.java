public class VolunteerMain {
    public static void main(String[] args) {
        VolunteerTeam frt = new VolunteerTeam();

        frt.addMember(new Volunteer("Bob", 100, 1));
        frt.addMember(new Volunteer("Sara", 200, 0));
        frt.addMember(new Volunteer("Scott", 1, 0));
        frt.addMember(new Volunteer("Sofya", 127, 13));
        frt.addMember(new Volunteer("Steve", 46,9));
        frt.addMember(new Volunteer("Muhammed", 273, 27));
        frt.addMember(new Volunteer("Amaara", 129, 33 ));
        frt.addMember(new Volunteer("Ayub", 129, 39));
        frt.addMember(new Volunteer("Tony", 17, 106));

        frt.sortTeam();
        System.out.println(frt.getTeamDetails());

    }
}
