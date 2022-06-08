package Main_App;

public class Teacher_studentList_intgr {
    String arr1[][] = {{"shaimaa", "19p7484", "database"}, {"rana", "19p2468", "AI"}, {"yara", "19p1881", "database"}, {"aya", "19p1689", "database"}};
    String arr2[][] = {{"shaimaa", "19p7484", "database"}, {"rana", "19p2468", "AI"}, {"yara", "19p1881", "database"}, {"aya", "19p1689", "database"}};
    public String check_integration(String name1 , String id1,String name2,String id2)
    {
        TeacherPage T=new TeacherPage();
        StudentList s=new StudentList();
        String arr1t[][]=new String[arr1.length][3];
        String arr2t[][]=new String[arr1.length][3];
        for(int i =0;i<arr1.length;i++)
        {
            arr1t[i]=arr1[i];
        }
        for(int i =0;i<arr2.length;i++)
        {
            arr2t[i]=arr2[i];
        }

        arr2t[arr2.length-1][0]=name2;
        arr2t[arr2.length-1][1]=id2;
        arr2t[arr2.length-1][2]="database";

        arr1t[arr1.length-1][0]=name1;
        arr1t[arr1.length-1][1]=id1;
        arr1t[arr1.length-1][2]="database";


        s.check_list(arr1t,"database");
        T.see_list(arr2t,"database");
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
