package Main_App;

import java.util.ArrayList;

public class StudentList {
    String Teacher_course = "database";

    ArrayList<String> arr1 = new ArrayList<String>();

    public String check_list(String sList[][]) {
        for (int i = 0; i <= sList.length; i++) {
            if (Teacher_course.equals(sList[i][2])) {
                arr1.add(sList[i][1]);
                Display();

            }
            return "the student is successfully added to list";
        }
        return "the student isnot in the course";
    }
    public void Display ()
    {
        for (int i=0;i< arr1.size();i++)
        {

            System.out.print(arr1.get(i));
            System.out.println("");
        }
    }
}
