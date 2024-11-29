package kz.spring.springboot.springproject2.db;

import kz.spring.springboot.springproject2.controllers.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class DbManager {
    @Getter
    private static List<Student> students = new ArrayList<>(
            List.of(
                    new Student(1L, "George", "Bush", 86, 'B'),
                    new Student(2L, "Dontald", "Tramp", 99, 'A'),
                    new Student(3L, "Vladimir", "Putin", 92, 'A'),
                    new Student(4L, "Anna", "Vasolyeva", 76, 'C'),
                    new Student(5L, "Vasya", "Pupkin", 44, 'F'),
                    new Student(6L, "Naruto", "Uzumaki", 56, 'D'),
                    new Student(7L, "Sasuke", "Uchiha", 89, 'B'),
                    new Student(8L, "Alibek", "Medeubayev", 48, 'F'),
                    new Student(9L, "Alexandr", "Gerchik", 84, 'B'),
                    new Student(10L, "Alexandr", "Makednoskiy", 94, 'A'),
                    new Student(11L, "Suzuki", "Yamato", 65, 'C')
            ));

    private static Long id = 12L;

    private static char getGrade(int examScore) {
        if (examScore >= 90) return 'A';
        if (examScore >= 75) return 'B';
        if (examScore >= 60) return 'C';
        if (examScore >= 50) return 'D';
        return 'F';
    }

    public static void addStudent(Student student){
        if (student != null) {
            student.setId(id);
            student.setMark(getGrade(student.getExam()));
            students.add(student);
            id++;
        }
    }
}
