package Main_App.Main_App_test;

import Main_App.Teacher_studentList_intgr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Teacher_studentList_intgrTest {
    @Test
    public void check_integration(){
        Teacher_studentList_intgr t_i =new Teacher_studentList_intgr();
        assertEquals("the integration successfully done",t_i.check_integration("rana","19p7484","shaimaa","19p7484"));
    }

}