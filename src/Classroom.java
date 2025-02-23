import java.util.ArrayList;
import java.util.List;

public class Classroom {
    String className;
    List<Student> students;

    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudentRanks() {
        int countA = 0, countB = 0, countC = 0, countD = 0, countLessD = 0;

        for (Student student : students) {
            switch (student.getRank()) {
                case "A": countA++; break;
                case "B": countB++; break;
                case "C": countC++; break;
                case "D": countD++; break;
                case "<D": countLessD++; break;
            }
        }

        System.out.println("Tổng kết điểm theo rank:");
        System.out.println("A: " + countA);
        System.out.println("B: " + countB);
        System.out.println("C: " + countC);
        System.out.println("D: " + countD);
        System.out.println("<D: " + countLessD);
    }

    @Override
    public String toString() {
        return className + " - Số sinh viên: " + students.size();
    }

}
