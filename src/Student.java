public class Student {


    // private attributes
    private int rollNumber ;
    private String stdName;
    private double grade;

    //default one
    public Student(){

    }


    public Student(int rollNumber, String stdName, double grade) {
        this.rollNumber = rollNumber;
        this.stdName = stdName;
        this.grade = grade;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student| " +
                "rollNumber=" + rollNumber +
                ", | stdName='" + stdName + '\'' +
                ", | grade= " + grade +" "+
                '|';
    }
}
