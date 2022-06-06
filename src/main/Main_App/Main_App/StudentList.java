package Main_App;

import java.util.ArrayList;

public class StudentList {
    String Teacher_course = "database";

    ArrayList<String> arr1 = new ArrayList<String>();

    Boolean check=false;
    public String check_list(String sList[][],String course) {
        for (int i = 0; i < sList.length; i++) {
            if (course.equals(sList[i][2])) {
                arr1.add(sList[i][1]);
                check = true;
            }
        }
        Display();
   if(check==false){
    return "the student isnot in the course";
    }
  else {

    return "the student is successfully added to list";
}

    }
    public void Display ()
    {
        for (int i=0;i< arr1.size();i++)
        {

            System.out.print(arr1.get(i));
            System.out.println("");
        }
    }
    Boolean check1=false;
    public String remove(String sList[][],String id,String Course) {
        for (int i = 0; i < sList.length; i++) {

            if (Course.equals(sList[i][2])&& id.equals(sList[i][1])) {
                arr1.remove(id);
                check1 = true;
            }
        }
        Display();
        if(check1==false){
            return "the student isnot in the course";
        }
        else {

            return "the student is successfully removed";
        }

    }
}
