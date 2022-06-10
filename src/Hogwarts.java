public class Hogwarts {
    private String name;
    private String surname;
    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, String surname, int magicPower, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

public static void printBestStudent(Hogwarts student1, Hogwarts student2) {
    if (student1.magicPower > student2.magicPower) {
        System.out.print(student1.getName() + " kick ass " + student2.getName());
        if (student2.transgressionDistance > student1.transgressionDistance) {
            System.out.println(", if he catches up");
        }
    } else {
        System.out.print(student2.getName() + " kick ass " + student1.getName());
        if (student1.transgressionDistance > student2.transgressionDistance) {
            System.out.println(", if he catches up");
        }
    }
}
}
