package studentManegement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseEnrollmentManager {
    private Map<Course, List<Student>> courseEnrollments;

    public CourseEnrollmentManager() {
        courseEnrollments = new HashMap<>();
    }

    public void enrollStudentInCourse(Student student, Course course) {
        if (!courseEnrollments.containsKey(course)) {
            courseEnrollments.put(course, new ArrayList<>());
        }
        courseEnrollments.get(course).add(student);
    }

    public List<Student> getStudentsInCourse(Course course) {
        return courseEnrollments.getOrDefault(course, new ArrayList<>());
    }
}

