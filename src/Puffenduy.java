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

    public String toStringPuffenduy() {
        return "Пуффендуй{ " + super.toString()
                + " трудолюбие " + getWork() + ";"
                + " верность " + getBelief() + ";"
                + " честность " + getHonesty() + "}";
    }

    public void compareToStudentInPuffenduy(Puffenduy puffenduyStudent) {
        int sumThis = this.work + this.belief + this.honesty;
        int sumPuffenduyStudent = puffenduyStudent.getWork() + puffenduyStudent.getBelief() + puffenduyStudent.getHonesty();
        if (sumThis > sumPuffenduyStudent) {
            System.out.println(this.getName() + " сильнее " + puffenduyStudent.getName());
        }
        if (sumThis < sumPuffenduyStudent) {
            System.out.println(puffenduyStudent.getName() + " сильнее " + this.getName());
        }
        if (sumThis == sumPuffenduyStudent) {
            System.out.println("Студенты равны по силе");
        }
    }
}
