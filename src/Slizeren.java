public class Slizeren extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizeren(String name, String surname, int magicPower, int transgressionDistance, int cunning,
                    int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public static void printBestSlizeren(Slizeren student1, Slizeren student2){
        int sumPoints1 = student1.cunning + student1.determination + student1.ambition + student1.resourcefulness
                + student1.lustForPower;
        int sumPoints2 = student2.cunning + student2.determination + student2.ambition + student2.resourcefulness
                + student2.lustForPower;
        if (sumPoints1 > sumPoints2){
            System.out.println(student1.getName() + " better Slizerener than " + student2.getName());
        } else {
            System.out.println(student2.getName() + " better Slizerener than " + student1.getName());
        }
    }
}
