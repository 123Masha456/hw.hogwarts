public class Kogtevran extends Hogwarts {

    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(String name, String surname, String faculty, int magicPower, int trancePower,
                     int mind, int wisdom, int wit, int creativity) {
        super(name, surname, faculty, magicPower, trancePower);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
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

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }


    public String toStringKogtevran() {

        return "Когтевран{ " + super.toString()
                + " ум " + getMind() + ";"
                + " мудрость " + getWisdom() + ";"
                + " остроумие " + getWit() + ";"
                + " креативность " + getCreativity() + "}";

    }

    public void compareToStudentInKogtevran(Kogtevran kogtevranStudent) {
        int sumThis = this.mind + this.wisdom + this.wit + this.creativity;
        int sumKogtevranStudent = kogtevranStudent.getMind() + kogtevranStudent.getWisdom() + kogtevranStudent.getWit() + kogtevranStudent.getCreativity();
        if (sumThis > sumKogtevranStudent) {
            System.out.println(this.getName() + " сильнее " + kogtevranStudent.getName());
        }
        if (sumThis < sumKogtevranStudent) {
            System.out.println(kogtevranStudent.getName() + " сильнее " + this.getName());
        }
        if (sumThis == sumKogtevranStudent) {
            System.out.println("Студенты равны по силе");
        }
    }
}
