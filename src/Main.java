public class Main {

    public static void main(String[] args) {

        Griffindor garry = new Griffindor("Гарри", "Поттер", "Гриффиндор",
                92, 65, 54, 32, 52);
        Griffindor hermiona = new Griffindor("Гермиона", "Грейнджер", "Гриффиндор",
                45, 87, 63, 96, 23);
        Griffindor ron = new Griffindor("Рон", "Уизли", "Гриффиндор",
                99, 34, 74, 25, 86);

        Puffenduy zaharia = new Puffenduy("Захария", "Смит", "Пуффендуй",
                35, 46, 37, 91, 44);
        Puffenduy sedrik = new Puffenduy("Седрик", "Диггори", "Пуффендуй",
                29, 73, 54, 38, 62);
        Puffenduy jastin = new Puffenduy("Джастин", "Финтч-Флетчли", "Пуффендуй",
                48, 38, 40, 20, 60);

        Kogtevran chjoy = new Kogtevran("Чжоу", "Чанг", "Когтевран",
                82, 22, 29, 65, 84, 50);
        Kogtevran padma = new Kogtevran("Падма", "Патил", "Когтевран",
                50, 43, 10, 72, 52, 25);
        Kogtevran marcus = new Kogtevran("Маркус", "Белби", "Когтевран",
                58, 49, 62, 33, 32, 78);

        Slizerin drako = new Slizerin("Драко", "Малфой", "Слизерин",
                56, 66, 54, 25, 65, 64, 77);
        Slizerin grehem = new Slizerin("Грэхэм", "Монтегю", "Слизерин",
                23, 81, 73, 72, 71, 43, 45);
        Slizerin gregori = new Slizerin("Грегори", "Гойл", "Слизерин",
                44, 65, 68, 34, 67, 87, 43);

        System.out.println(garry.toStringGriffindor());
        System.out.println(zaharia.toStringPuffenduy());
        System.out.println(padma.toStringKogtevran());
        System.out.println(gregori.toStringSlizerin());
        System.out.println();

        hermiona.compareToStudentInGriffindor(garry);
        jastin.compareToStudentInPuffenduy(zaharia);
        padma.compareToStudentInKogtevran(marcus);
        drako.compareToStudentInSlizerin(gregori);
        drako.compareToStudentInHogwarts(garry);
    }
}
