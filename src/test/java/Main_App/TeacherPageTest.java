package Main_App;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherPageTest {

    @Test
    void teacher() {
        TeacherPage T = new TeacherPage();
        T.Teacher("ahmed.com");
        System.out.println(T.arr);

        CourseStudent C = new CourseStudent();
//        C.checkLink("ahmed.com");


    }
}