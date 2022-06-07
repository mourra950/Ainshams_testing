package Main_App;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
public class TeacherPage {
    public static ArrayList<String> arr = new ArrayList<String>() {
        {
            add("https://engasuedu.sharepoint.com/sites/CSE371UG2018-ControlEngineering24668");
            add("www.google.com");
            add("www.youtube.com");
        }
    };
    public static  ArrayList<String> arr_list = new ArrayList<String>();
    public static String Teacher(String url) throws SQLException {
    //CourseStudent c=new CourseStudent();
        if (url.equals("")) {
            return "please fill in all the fields";
        }
          else if (Check_validity(url)) {
            arr.add(url);
            arr_list.addAll(arr);
            display2();
            return "url updated";
        }
        return "url is invalid";
    }

    public static void display2() {
        for (int i = 0; i < arr_list.size(); i++) {
          System.out.println(arr_list.get(i));
        }
    }

    public static boolean Check_validity (String url)
    {
                /* Try creating a valid URL */
                try {
                    new URL(url).toURI();
                    return true;
                }
                // If there was an Exception
                // while creating URL object
                catch (Exception e) {
                    return false;
                }
            }
    public void Display ()
    {
        for (int i=0;i< arr.size();i++)
        {
            System.out.print(arr.get(i));
            System.out.println("");
        }
    }
    }


