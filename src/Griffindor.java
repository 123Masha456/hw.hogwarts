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

    @Override
    public String toString() {
        return "Имя " + getName() + ";"
                + " фамилия " + getSurname() + ";"
                + " факультет " + getFaculty() + ";"
                + " мощность колдовства " + getMagicPower() + ";"
                + " трансгрессия на " + getTrancePower() + ";"
                + " благородство " + getNobility() + ";"
                + " честь " + getHonor() + ";"
                + " храбрость " + getBravery();
    }
}
