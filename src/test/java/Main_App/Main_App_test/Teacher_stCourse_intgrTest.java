package Main_App.Main_App_test;

import Main_App.Teacher_stCourse_intgr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Teacher_stCourse_intgrTest {
    @Test
    public void check_integration1()
    {
        Teacher_stCourse_intgr i =new Teacher_stCourse_intgr();
        assertEquals("integration is done successfully",Teacher_stCourse_intgr.integrate("https://www.youtube.com/watch?v=dQw4w9WgXcQ","https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
    }
    @Test
    public void check_integration2()
    {
        Teacher_stCourse_intgr i =new Teacher_stCourse_intgr();
        assertEquals("integration failed",Teacher_stCourse_intgr.integrate("ahmed.com","ahmed.com"));
    }
    @Test
    public void check_integration3()
    {
        Teacher_stCourse_intgr i =new Teacher_stCourse_intgr();
        assertEquals("integration is done successfully",Teacher_stCourse_intgr.integrate("https://www.youtube.com/watch?v=dQw4w9WgXcQ","ahmed.com"));
    }
}