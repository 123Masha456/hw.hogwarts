public abstract class Hogwarts {
    private String name;
    private String surname;
    private String faculty;
    private int magicPower;
    private int trancePower;

    public Hogwarts(String name, String surname, String faculty, int magicPower, int trancePower) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.magicPower = magicPower;
        this.trancePower = trancePower;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTrancePower() {
        return trancePower;
    }

    public void setTrancePower(int trancePower) {
        this.magicPower = magicPower;
    }

    @Override
    public String toString() {
        return "Имя " + this.name + ";"
                + " фамилия " + this.surname + ";"
                + " факультет " + this.faculty + ";"
                + " мощность колдовства " + this.magicPower + ";"
                + " трансгрессия на " + this.trancePower + ";";
    }

    public void compareToStudentInHogwarts(Hogwarts hogwartsStudent) {
        int sumThis = this.magicPower + this.trancePower;
        int sumHogwartsStudent = hogwartsStudent.getMagicPower() + hogwartsStudent.getTrancePower();
        if (sumThis > sumHogwartsStudent) {
            System.out.println(this.getName() + " сильнее " + hogwartsStudent.getName());
        }
        if (sumThis < sumHogwartsStudent) {
            System.out.println(hogwartsStudent.getName() + " сильнее " + this.getName());
        } else {
            System.out.println("Студенты равны по силе");
        }
    }
}

