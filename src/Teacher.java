import java.util.ArrayList;


    public class Teacher extends Person {

        ArrayList<String> currentCourses;
        ArrayList<String> canTeach;

        public Teacher(String navn, ArrayList canTeach ) {
            super(navn);
            this.canTeach = canTeach;

        }


        @Override
        public boolean addCourse(String course) {
            if (canTeach.contains(course)){
                return false;
            }else {
                canTeach.add(course);
                return true;
            }
        }

    }

