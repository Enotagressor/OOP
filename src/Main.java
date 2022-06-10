public class Main {
    public static void main(String[] args) {

        Griffindor garry = new Griffindor("Garry", "Potter", 70, 47, 70,
                90, 99);
        Griffindor germiona = new Griffindor("Germiona", "Grainger", 90, 56,
                99, 89, 50);
        Griffindor ron = new Griffindor("Ron", "Wisli", 30, 99, 50,
                70, 30);

        Pufendui zaharia = new Pufendui("Zaharia", "Smith", 44, 37, 76,
                46, 81);
        Pufendui sedrik = new Pufendui("Sedrik", "Diggori", 81, 65, 67,
                53, 35);
        Pufendui jastin = new Pufendui("Jastin", "Finch-Fletchly", 34, 45,
                76, 14, 78);

        Kogtevran chjou = new Kogtevran("Chjou", "Chang", 54, 51, 57,
                62,34,84);
        Kogtevran padma = new Kogtevran("Padma", "Patil", 53, 34, 84,
                42,34,74);
        Kogtevran marcus = new Kogtevran("Marcus", "Belbi", 43, 21, 53,
                62,24,64);

        Slizeren drako = new Slizeren("Drako", "Malfoyi", 65, 76, 57,
                76, 44, 67, 99);
        Slizeren graham = new Slizeren("Graham", "Montegru", 42, 65, 65,
                78, 34, 43, 50);
        Slizeren gregory = new Slizeren("Gregory", "Goil", 23, 13, 19,
                43, 49, 46, 36);

    PrintStudent printStudent = new PrintStudent();
    printStudent.printStusent(garry);
    printStudent.printStusent(drako);
    printStudent.printStusent(zaharia);
    printStudent.printStusent(marcus);
    Griffindor.printBestGrifindorer(germiona, garry);
    Pufendui.printBestPufendui(sedrik, zaharia);
    Slizeren.printBestSlizeren(gregory, graham);
    Kogtevran.printBestKogtevran(padma,marcus);
    Hogwarts.printBestStudent(ron, drako);
    }

}