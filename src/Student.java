public class Student {
    private String name;
    private int grade;
    public Student(int grade, String name) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
