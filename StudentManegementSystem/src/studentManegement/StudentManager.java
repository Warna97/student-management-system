package studentManegement;

import java.util.ArrayList;

import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(int id, String firstName, String lastName, String email) {
        Student student = findStudentById(id);
        if (student != null) {
            student.setFirstName(firstName);
            student.setLastName(lastName);
            student.setEmail(email);
        }
    }
}

//Student cannot be resolved to a type
//The method findStudentById(int) from the type StudentManager refers to the missing type Student
//Student cannot be resolved to a type