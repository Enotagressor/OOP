import java.util.Objects;

public class Griffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public Griffindor(String name, String surname, int magicPower, int transgressionDistance,
                      int nobility, int honour, int bravery) {
        super(name, surname, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public static void printBestGrifindorer(Griffindor student1, Griffindor student2){
        int sumPoints1 = student1.nobility + student1.honour + student1.bravery;
        int sumPoints2 = student2.nobility + student2.honour + student2.bravery;
        if (sumPoints1 > sumPoints2){
            System.out.println(student1.getName() + " better Grifindorer than " + student2.getName());
        } else {
            System.out.println(student2.getName() + " better Grifindorer than " + student1.getName());
        }
    }
}
