public class Kogtevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Kogtevran(String name, String surname, int magicPower, int transgressionDistance, int mind,
                     int wisdom, int wit, int creation) {
        super(name, surname, magicPower, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }
    public static void printBestKogtevran(Kogtevran student1, Kogtevran student2){
        int sumPoints1 = student1.mind + student1.wisdom + student1.wit + student1.creation;
        int sumPoints2 = student2.mind + student2.wisdom + student2.wit + student2.creation;
        if (sumPoints1 > sumPoints2){
            System.out.println(student1.getName() + " better Kogtevraner than " + student2.getName());
        } else {
            System.out.println(student2.getName() + " better Kogtevraner than " + student1.getName());
        }
    }
}
