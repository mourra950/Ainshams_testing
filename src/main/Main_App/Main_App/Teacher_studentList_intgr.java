package Main_App;

public class Teacher_studentList_intgr {
    String arr1[][] = {{"shaimaa", "19p7484", "database"}, {"rana", "19p2468", "AI"}, {"yara", "19p1881", "database"}, {"aya", "19p1689", "database"}};
    String arr2[][] = {{"shaimaa", "19p7484", "database"}, {"rana", "19p2468", "AI"}, {"yara", "19p1881", "database"}, {"aya", "19p1689", "database"}};
    public String check_integration(String name1 , String id1,String name2,String id2)
    {
        TeacherPage T=new TeacherPage();
        StudentList s=new StudentList();

        s.check_list(arr1,"database");
        T.see_list(arr2,"database");
        if(s.arr1.equals(T.arr1))
        {
            return "the integration successfully done";
        }
        else
        {
            return "the integration failed";
        }
    }

}
