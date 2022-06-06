package Main_App.Main_App_test;

import Main_App.StudentList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    String arr[][] = {{"shaimaa", "19p7484", "database"}, {"rana", "19p2468", "compilers"},{"yara","19p1881","database"},{"aya","19p1689","database"}};
    @Test
    public void check_list(){
        StudentList sList =new StudentList();
        assertEquals("the student is successfully added to list",sList.check_list(arr));
    }

}