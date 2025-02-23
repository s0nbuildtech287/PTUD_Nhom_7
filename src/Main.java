import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            // Khởi tạo lớp học
            Classroom class1 = new Classroom("CNTT1");
            class1.addStudent(new Student("Nguyen", "A", "2000-01-01", "Hanoi", "CNTT1", new double[]{85, 90, 78, 88, 92}));
            class1.addStudent(new Student("Tran", "B", "2000-02-02", "Hanoi", "CNTT1", new double[]{75, 80, 68, 70, 72}));
            class1.addStudent(new Student("Le", "C", "2000-03-03", "Hanoi", "CNTT1", new double[]{95, 98, 100, 90, 94}));
            class1.addStudent(new Student("Pham", "D", "2000-04-04", "Hanoi", "CNTT1", new double[]{60, 65, 70, 55, 50}));
            class1.addStudent(new Student("Hoang", "E", "2000-05-05", "Hanoi", "CNTT1", new double[]{80, 85, 88, 82, 90}));
            class1.addStudent(new Student("Kim", "F", "2000-06-06", "Hanoi", "CNTT1", new double[]{92, 85, 90, 80, 88}));
            class1.addStudent(new Student("Lan", "G", "2000-07-07", "Hanoi", "CNTT1", new double[]{70, 75, 72, 68, 80}));
            class1.addStudent(new Student("Minh", "H", "2000-08-08", "Hanoi", "CNTT1", new double[]{88, 90, 85, 92, 94}));
            class1.addStudent(new Student("Duc", "I", "2000-09-09", "Hanoi", "CNTT1", new double[]{55, 60, 65, 58, 62}));
            class1.addStudent(new Student("Tam", "J", "2000-10-10", "Hanoi", "CNTT1", new double[]{78, 75, 80, 70, 72}));

            Classroom class2 = new Classroom("CNTT2");
            class2.addStudent(new Student("Hai", "K", "2000-01-11", "Hanoi", "CNTT2", new double[]{90, 95, 92, 88, 91}));
            class2.addStudent(new Student("Ngoc", "L", "2000-02-12", "Hanoi", "CNTT2", new double[]{85, 80, 78, 82, 87}));
            class2.addStudent(new Student("Tu", "M", "2000-03-13", "Hanoi", "CNTT2", new double[]{78, 80, 75, 70, 72}));
            class2.addStudent(new Student("Linh", "N", "2000-04-14", "Hanoi", "CNTT2", new double[]{60, 65, 70, 55, 50}));
            class2.addStudent(new Student("Quang", "O", "2000-05-15", "Hanoi", "CNTT2", new double[]{88, 85, 90, 82, 87}));
            class2.addStudent(new Student("Son", "P", "2000-06-16", "Hanoi", "CNTT2", new double[]{72, 75, 78, 70, 68}));
            class2.addStudent(new Student("Thao", "Q", "2000-07-17", "Hanoi", "CNTT2", new double[]{65, 60, 58, 62, 61}));
            class2.addStudent(new Student("Binh", "R", "2000-08-18", "Hanoi", "CNTT2", new double[]{90, 92, 94, 88, 91}));
            class2.addStudent(new Student("Hao", "S", "2000-09-19", "Hanoi", "CNTT2", new double[]{80, 82, 85, 78, 76}));
            class2.addStudent(new Student("Khanh", "T", "2000-10-20", "Hanoi", "CNTT2", new double[]{70, 75, 72, 68, 74}));


            // Danh sách lớp
            List<Classroom> classes = new ArrayList<>();
            classes.add(class1);
            classes.add(class2);

            // Hiển thị danh sách lớp
            System.out.println("Danh sách lớp:");
            for (int i = 0; i < classes.size(); i++) {
                System.out.println((i + 1) + ". " + classes.get(i));
            }

        // Nhập mã lớp
        int classIndex = -1;
        while (classIndex < 0 || classIndex >= classes.size()) {
            System.out.print("Nhập mã lớp (1 hoặc 2): ");
            try {
                classIndex = scanner.nextInt() - 1;
                if (classIndex < 0 || classIndex >= classes.size()) {
                    System.out.println("Mã lớp không hợp lệ! Vui lòng nhập lại.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập một số nguyên hợp lệ.");
                scanner.next(); // Xóa bỏ đầu vào không hợp lệ
            }
        }

        // Hiển thị danh sách sinh viên và tổng kết
        if (classIndex >= 0 && classIndex < classes.size()) {
            System.out.println("Danh sách sinh viên trong lớp " + classes.get(classIndex).className + ":");
            for (Student student : classes.get(classIndex).students) {
                System.out.println(student);
            }
            classes.get(classIndex).printStudentRanks();
        } else {
            System.out.println("Mã lớp không hợp lệ!");
        }

        scanner.close();
    }
}