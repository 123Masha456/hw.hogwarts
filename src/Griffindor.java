public class Griffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surname, String faculty, int magicPower, int trancePower, int nobility,
                      int honor, int bravery) {
        super(name, surname, faculty, magicPower, trancePower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public String toStringGriffindor() {
        return "Гриффиндор{ " + super.toString()
                + " благородство " + getNobility() + ";"
                + " честь " + getHonor() + ";"
                + " храбрость " + getBravery() + "}";

    }

    public void compareToStudentInGriffindor(Griffindor griffindorStudent) {
        int sumThis = this.nobility + this.honor + this.bravery;
        int sumGriffindorStudent = griffindorStudent.getNobility() + griffindorStudent.getHonor() + griffindorStudent.getBravery();
        if (sumThis > sumGriffindorStudent) {
            System.out.println(this.getName() + " сильнее " + griffindorStudent.getName());
        }
        if (sumThis < sumGriffindorStudent) {
            System.out.println(griffindorStudent.getName() + " сильнее " + this.getName());
        }
        if (sumThis == sumGriffindorStudent) {
            System.out.println("Студенты равны по силе");
        }
    }
}

