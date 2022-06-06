package Main_App.Main_App_test;

import Main_App.StudentList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {


    String arr[][] = {{"shaimaa", "19p7484", "database"}, {"rana", "19p2468", "AI"},{"yara","19p1881","database"},{"aya","19p1689","database"}};
    String arr_remove[][] = {{"shaimaa", "19p7484", "database"}, {"rana", "19p2468", "AI"},{"yara","19p1881","database"},{"aya","19p1689","database"}};
    @Test
    public void check_list1(){
        StudentList sList =new StudentList();
        assertEquals("the student is successfully added to list",sList.check_list(arr,"database"));
    }
    @Test
    public void check_list2(){
        String arr[][] = {{"Rana", "19p2468", "compilers"},{"Ahmed", "19p2057", "compilers"}};
        StudentList sList =new StudentList();
        assertEquals("the student isnot in the course",sList.check_list(arr,"compilers"));
    }
    @Test
    public void check_list3() {
        String arr[][] = {{"Rana", "19p2468", "compilers"}, {"Ahmed", "19p2057", "AI"}};
        StudentList sList = new StudentList();
        assertEquals("the student isnot in the course", sList.check_list(arr, "compilers"));
    }
    @Test
    public void check_list4() {
        StudentList sList = new StudentList();
        assertEquals("the student is successfully added to list", sList.check_list(arr, "AI"));
    }
    @Test
    public void check_list5() {
        StudentList sList = new StudentList();
        assertEquals("the student is successfully removed", sList.remove(arr_remove, "19p7484","database"));
    }
    @Test
    public void check_list6() {
        StudentList sList = new StudentList();
        assertEquals("the student isnot in the course", sList.remove(arr_remove, "19p7455","database"));
    }
    }