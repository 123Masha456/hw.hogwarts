public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = {
                new Hogwarts("Гарри", "Поттер", "Гриффиндор", 92, 65),
                new Hogwarts("Гермиона", "Грейнджер", "Гриффиндор", 99, 87),
                new Hogwarts("Рон", "Уизли", "Гриффиндор", 99, 34),
                new Hogwarts("Драко", "Малфой", "Слизерин", 56, 66),
                new Hogwarts("Грэхэм", "Монтегю", "Слизерин", 23, 81),
                new Hogwarts("Грегори", "Гойл", "Слизерин", 44, 65),
                new Hogwarts("Захария", "Смит", "Пуффендуй", 35, 46),
                new Hogwarts("Седрик", "Диггори", "Пуффендуй", 29, 73),
                new Hogwarts("Джастин", "Финтч-Флетчли", "Пуффендуй", 48, 38),
                new Hogwarts("Чжоу", "Чанг", "Когтевран", 82, 22),
                new Hogwarts("Падма", "Патил", "Когтевран", 50, 43),
                new Hogwarts("Маркус", "Белби", "Когтевран", 58, 49)
        };

        Griffindor[] people = {
                new Griffindor("Гарри", "Поттер", "Гриффиндор", 92, 65, 54, 32, 52),
                new Griffindor("Гермиона", "Грейнджер", "Гриффиндор", 45, 87, 63, 96, 23),
                new Griffindor("Рон", "Уизли", "Гриффиндор", 99, 34, 74, 25, 86)
        };

        Puffenduy[] persons = {
                new Puffenduy("Захария", "Смит", "Пуффендуй", 35, 46, 37, 91, 44),
                new Puffenduy("Седрик", "Диггори", "Пуффендуй", 29, 73, 54, 38, 62),
                new Puffenduy("Джастин", "Финтч-Флетчли", "Пуффендуй", 48, 38, 40, 20, 60),
        };

        Kogtevran[] humans = {
                new Kogtevran("Чжоу", "Чанг", "Когтевран", 82, 22, 29, 65, 84, 50),
                new Kogtevran("Падма", "Патил", "Когтевран", 50, 43, 10, 72, 52, 25),
                new Kogtevran("Маркус", "Белби", "Когтевран", 58, 49, 62, 33, 32, 78)
        };

        Slizerin[] members = {
                new Slizerin("Драко", "Малфой", "Слизерин", 56, 66, 54, 25, 65, 64, 77),
                new Slizerin("Грэхэм", "Монтегю", "Слизерин", 23, 81, 73, 72, 71, 43, 45),
                new Slizerin("Грегори", "Гойл", "Слизерин", 44, 65, 68, 34, 67, 87, 43),
        };

        PrintService printService = new PrintService();
        printService.print(students);
        printService.print(people);
        printService.print(persons);
        printService.print(humans);
        printService.print(members);
    }
}
