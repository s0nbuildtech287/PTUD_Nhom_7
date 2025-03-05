//Lop student
public class Student {
    String firstName;
    String lastName;
    String birthDate;
    String address;
    String className;
    double[] scores;

    public Student(String firstName, String lastName, String birthDate, String address, String className, double[] scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.className = className;
        this.scores = scores;
    }
    public double getAverageScore() {
        double total = 0;
        for (double score : scores) {
            total += score;
        }
        return total / scores.length;
    }
    public String getRank() {
        double average = getAverageScore();
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "<D";
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - " + getAverageScore() + " (" + getRank() + ")";
    }
}



