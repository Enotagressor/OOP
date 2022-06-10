public class Pufendui extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Pufendui(String name, String surname, int magicPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(name, surname, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public static void printBestPufendui(Pufendui student1, Pufendui student2){
        int sumPoints1 = student1.diligence + student1.loyalty + student1.honesty;
        int sumPoints2 = student2.diligence + student2.loyalty + student2.honesty;
        if (sumPoints1 > sumPoints2){
            System.out.println(student1.getName() + " better Pufenduier than " + student2.getName());
        } else {
            System.out.println(student2.getName() + " better Pufenduier than " + student1.getName());
        }
    }
}
