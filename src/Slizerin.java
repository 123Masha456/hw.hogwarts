public class Slizerin extends Hogwarts {

    private int trick;
    private int resolve;
    private int ambition;
    private int smart;
    private int power;

    public Slizerin(String name, String surname, String faculty, int magicPower, int trancePower,
                    int trick, int resolve, int ambition, int smart, int power) {
        super(name, surname, faculty, magicPower, trancePower);
        this.trick = trick;
        this.resolve = resolve;
        this.ambition = ambition;
        this.smart = smart;
        this.power = power;
    }


    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getResolve() {
        return resolve;
    }

    public void setResolve(int resolve) {
        this.resolve = resolve;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Имя " + getName() + ";"
                + " фамилия " + getSurname() + ";"
                + " факультет " + getFaculty() + ";"
                + " мощность колдовства " + getMagicPower() + ";"
                + " трансгрессия на " + getTrancePower() + ";"
                + " хитрость " + getTrick() + ";"
                + " решительность " + getResolve() + ";"
                + " амбициозность " + getAmbition() + ";"
                + " находчивость " + getSmart() + ";"
                + " жажда власти " + getPower();
    }
}
