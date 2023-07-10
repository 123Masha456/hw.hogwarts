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


    public String toStringSlizerin() {
        return "Слизерин{ " + super.toString()
                + " хитрость " + getTrick() + ";"
                + " решительность " + getResolve() + ";"
                + " амбициозность " + getAmbition() + ";"
                + " находчивость " + getSmart() + ";"
                + " жажда власти " + getPower() + "}";
    }

    public void compareToStudentInSlizerin(Slizerin slizerinStudent) {
        int sumThis = this.trick + this.resolve + this.ambition + this.smart + this.power;
        int sumSlizerinStudent = slizerinStudent.getTrick() + slizerinStudent.getResolve() + slizerinStudent.getAmbition()
                + slizerinStudent.getSmart() + slizerinStudent.getPower();
        if (sumThis > sumSlizerinStudent) {
            System.out.println(this.getName() + " сильнее " + slizerinStudent.getName());
        }
        if (sumThis < sumSlizerinStudent) {
            System.out.println(slizerinStudent.getName() + " сильнее " + this.getName());
        }
        if (sumThis == sumSlizerinStudent) {
            System.out.println("Студенты равны по силе");
        }
    }
}
