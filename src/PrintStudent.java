public class PrintStudent {
    public void printStusent(Griffindor griffindor) {
        System.out.println("Student Griffindor - " + griffindor.getName() + " " + griffindor.getSurname() + "; MagicPower "
                + griffindor.getMagicPower() + "; TransgressionDistance " + griffindor.getTransgressionDistance()
                + "; Nobility " + griffindor.getNobility() + "; Honour " + griffindor.getHonour() + "; Bravery "
                + griffindor.getBravery());
    }

    public void printStusent(Slizeren slizeren) {
        System.out.println("Student Slizeren - " + slizeren.getName() + " " + slizeren.getSurname() + "; MagicPower "
                + slizeren.getMagicPower() + "; TransgressionDistance " + slizeren.getTransgressionDistance()
                + "; Cunning " + slizeren.getCunning() + "; Determination " + slizeren.getDetermination() + "; Ambition "
                + slizeren.getAmbition() + "; Resourcefulness " + slizeren.getResourcefulness()
                + "; LustForPower " + slizeren.getLustForPower());
    }

    public void printStusent(Pufendui pufendui) {
        System.out.println("Student Pufendui - " + pufendui.getName() + " " + pufendui.getSurname() + "; MagicPower "
                + pufendui.getMagicPower() + "; TransgressionDistance " + pufendui.getTransgressionDistance()
                + "; Diligence " + pufendui.getDiligence() + "; Loyalty " + pufendui.getLoyalty() + "; Honesty "
                + pufendui.getHonesty());
    }

    public void printStusent(Kogtevran kogtevran) {
        System.out.println("Student Kogtevran - " + kogtevran.getName() + " " + kogtevran.getSurname() + "; MagicPower "
                + kogtevran.getMagicPower() + "; TransgressionDistance " + kogtevran.getTransgressionDistance()
                + "; Mind " + kogtevran.getMind() + "; Wisdom " + kogtevran.getWisdom() + "; Wit "
                + kogtevran.getWit() + "; Creation " + kogtevran.getCreation());
    }
}
