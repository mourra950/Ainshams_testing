package Main_App;

public class Teacher_stCourse_intgr {


    public static void integrate() {
        TeacherPage T = new TeacherPage();
        T.Teacher("https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/");
        CourseStudent c = new CourseStudent();
        String statues =c.checkLink("https://www.geeksforgeeks.org/initialize-an-arraylist-in-java/", T.arr);
        System.out.println(statues);
    }
    public static void main(String[] args){
        integrate();
    }
}

