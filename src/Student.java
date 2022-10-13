import java.util.ArrayList;

public class Student extends Person {

    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses;

    public Student(String navn, ArrayList passedCourses) {

        super (navn);

        this.currentCourses = passedCourses;
    }


    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)){
            return false;
        }else {
            passedCourses.add(course);
            return true;
        }
    }
}