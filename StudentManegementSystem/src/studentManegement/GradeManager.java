package studentManegement;

import java.util.HashMap;
import java.util.Map;

public class GradeManager {
    private Map<Student, Map<Course, String>> studentGrades;

    public GradeManager() {
        studentGrades = new HashMap<>();
    }

    public void assignGrade(Student student, Course course, String grade) {
        if (!studentGrades.containsKey(student)) {
            studentGrades.put(student, new HashMap<>());
        }
        studentGrades.get(student).put(course, grade);
    }

    public String getGrade(Student student, Course course) {
        Map<Course, String> courseGrades = studentGrades.get(student);
        if (courseGrades != null) {
            return courseGrades.get(course);
        }
        return null;
    }
}
