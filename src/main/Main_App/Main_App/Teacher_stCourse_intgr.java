package Main_App;

public class Teacher_stCourse_intgr {


    public static void integrate() {
        TeacherPage T = new TeacherPage();
        T.Teacher("ahmed.com");
        CourseStudent c = new CourseStudent();
        //System.out.println(T.arr);
        c.checkLink("ahmed.com", T.arr);

    }
    public static void main(String[] args){
        integrate();
    }
}

