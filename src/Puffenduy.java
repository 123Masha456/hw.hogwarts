public class Puffenduy extends Hogwarts {

    private int work;
    private int belief;
    private int honesty;

    public Puffenduy(String name, String surname, String faculty, int magicPower, int trancePower,
                     int work, int belief, int honesty) {
        super(name, surname, faculty, magicPower, trancePower);

        this.work = work;
        this.belief = belief;
        this.honesty = honesty;
    }

    public int getWork() {
        return work;
    }

    public void setWork(int work) {
        this.work = work;
    }

    public int getBelief() {
        return belief;
    }

    public void setBelief(int belief) {
        this.belief = belief;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Имя " + getName() + ";"
                + " фамилия " + getSurname() + ";"
                + " факультет " + getFaculty() + ";"
                + " мощность колдовства " + getMagicPower() + ";"
                + " трансгрессия на " + getTrancePower() + ";"
                + " трудолюбие " + getWork() + ";"
                + " верность " + getBelief() + ";"
                + " честность " + getHonesty();
    }
}
