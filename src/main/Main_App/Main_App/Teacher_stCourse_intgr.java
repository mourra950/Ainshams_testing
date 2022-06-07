package Main_App;

public class Teacher_stCourse_intgr {


    public static String integrate(String url1,String url2) {

        TeacherPage T = new TeacherPage();
        T.Teacher(url1);
        CourseStudent c = new CourseStudent();
        String statues = c.checkLink(url2, T.arr);
        if (statues.equals("valid")) {
            //System.out.println(statues);
            return "integration is done successfully";
        } else {
            return "integration failed";
        }
    }
    //public static void main(String[] args){
    //integrate();
    //}
}

