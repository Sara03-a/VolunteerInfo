import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Collections;

public class Volunteer implements
        Comparable <Volunteer> {

    @Override
    public int compareTo(Volunteer fr) {
        if (fr.getWages() > this.getWages()) {
            return 1;
        } else if (fr.getWages() < this.getWages()) {
            return -1;
        } else {
            return 0;
        }
    }

    private String name;
    private int boxes;
    private double wages;
    private int furtherBoxes;

    public Volunteer(String name, int boxes, int furtherBoxes) {
        this.name = name;
        this.boxes = boxes;
        this.furtherBoxes = furtherBoxes;
    }


    public String getName() {
        return name;
    }

    public int getBoxes() {
        return boxes;
    }

    public double getWages() {
        if (boxes <= 50) {
            wages = boxes * 0.15;
        } else {
            wages = 50 * 0.15 + (boxes - 50) * 0.2;
        }
        //wages = 0.15*boxes;
        return wages;
    }

    public String getMoney(double amount) {
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);
        return nf.format(amount);
    }

    public int getFurtherBoxes() {
        if (boxes < 0) {
            System.out.println("Error");
        } else {
            this.boxes += furtherBoxes;
            System.out.println();
        }
        return this.boxes;
    }


    public static void main(String[] args) {
        Volunteer vol = new Volunteer("Bob", 100, 0);
        Volunteer vol2 = new Volunteer("Sara", 200, 0);
        Volunteer vol3 = new Volunteer("Scott", 1, 0);
        System.out.println("Name: " + vol.getName() + "\nWages: " + vol.getMoney(vol.getWages()));
        System.out.println("Name: " + vol2.getName() + "\nWages: " + vol2.getMoney(vol2.getWages()));
        System.out.println("Name: " + vol3.getName() + "\nWages: " + vol3.getMoney(vol3.getWages()));
    }
}


