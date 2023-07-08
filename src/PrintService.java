public class PrintService {
    public void print(Hogwarts[] students) {
        System.out.println("Студенты Хогвартса " + students.length);
        for (int i = 0; i < students.length; i++) {
            Hogwarts hogwarts = students[i];
            System.out.println(students[i].toString());
            int a = students[0].getTrancePower() + students[0].getMagicPower();
            int b = students[i].getTrancePower() + students[i].getMagicPower();
            if (a > b) {
                System.out.println(students[0].getName() + " сильнее студента " + students[i].getName());
            }
            if (a < b) {
                System.out.println(students[0].getName() + " слабее студента " + students[i].getName());
            }
            if (a == b) {
                System.out.println("Сила студента " + students[0].getName() + " равна силе студента " + students[i].getName());
            }
            System.out.println();
        }
    }

    public void print(Griffindor[] people) {
        System.out.println("Студенты факультета Гриффиндор " + people.length);
        for (int i = 0; i < people.length; i++) {
            Hogwarts hogwarts = people[i];
            System.out.println(people[i].toString());
        }
        int garry = people[0].getNobility() + people[0].getHonor() + people[0].getBravery();
        int hermiona = people[1].getNobility() + people[1].getHonor() + people[1].getBravery();
        int ron = people[2].getNobility() + people[2].getHonor() + people[2].getBravery();
        if (garry > hermiona && garry > ron) {
            System.out.println("Гарри лучший изГриффиндора");
        }
        if (hermiona > garry && hermiona > ron) {
            System.out.println("Гермиона лучшая из Гриффиндора");
        }
        if (ron > garry && ron > hermiona) {
            System.out.println("Рон лучший из Гриффиндора");
        }
        System.out.println();
    }

    public void print(Puffenduy[] persons) {
        System.out.println("Студенты факультета Пуффендуй " + persons.length);
        for (int i = 0; i < persons.length; i++) {
            Puffenduy puffenduy = persons[i];
            System.out.println(persons[i].toString());
        }
        int zaharia = persons[0].getWork() + persons[0].getBelief() + persons[0].getHonesty();
        int sedrik = persons[1].getWork() + persons[1].getBelief() + persons[1].getHonesty();
        int jastin = persons[2].getWork() + persons[2].getBelief() + persons[2].getHonesty();
        if (zaharia > sedrik && zaharia > jastin) {
            System.out.println("Захария лучшая из Пуффендуя");
        }
        if (sedrik > zaharia && sedrik > jastin) {
            System.out.println("Седрик лучший из Пуффендуя");
        }
        if (jastin > zaharia && jastin > sedrik) {
            System.out.println("Джастин лучший из Пуффендуя");
        }
        System.out.println();
    }

    public void print(Kogtevran[] humans) {
        System.out.println("Студенты факультета Когтевран " + humans.length);
        for (int i = 0; i < humans.length; i++) {
            Kogtevran kogtevran = humans[i];
            System.out.println(humans[i].toString());
        }
        int chjoy = humans[0].getMind() + humans[0].getWit() + humans[0].getWisdom() + humans[0].getCreativity();
        int padma = humans[1].getMind() + humans[1].getWit() + humans[1].getWisdom() + humans[1].getCreativity();
        int markus = humans[2].getMind() + humans[2].getWit() + humans[2].getWisdom() + humans[2].getCreativity();
        if (chjoy > padma && chjoy > markus) {
            System.out.println("Чжоу лучший из Когтеврана");
        }
        if (padma > chjoy && padma > markus) {
            System.out.println("Падма лучшая изи Когтеврана");
        }
        if (markus > chjoy && markus > padma) {
            System.out.println("Маркус лучший из Когтеврана");
        }
        System.out.println();
    }

    public void print(Slizerin[] members) {
        System.out.println("Студенты факультета Слизерин " + members.length);
        for (int i = 0; i < members.length; i++) {
            Slizerin slizerin = members[i];
            System.out.println(members[i].toString());
        }
        int drako = members[0].getTrick() + members[0].getResolve() + members[0].getAmbition() + members[0].getSmart() + members[0].getPower();
        int grehem = members[1].getTrick() + members[1].getResolve() + members[1].getAmbition() + members[1].getSmart() + members[1].getPower();
        int gregori = members[2].getTrick() + members[2].getResolve() + members[2].getAmbition() + members[2].getSmart() + members[2].getPower();
        if (drako > grehem && drako > gregori) {
            System.out.println("Драко лучший из Слизерина");
        }
        if (grehem > drako && grehem > gregori) {
            System.out.println("Грэхэм лучшая из Слизерина");
        }
        if (gregori > drako && gregori > grehem) {
            System.out.println("Грегори лучший из Слизерина");
        }
        System.out.println();
    }
}

