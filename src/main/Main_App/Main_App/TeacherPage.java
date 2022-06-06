package Main_App;
import java.sql.SQLException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
public class TeacherPage {

    ArrayList<String> arr = new ArrayList<String>() {
        {
            add("https://engasuedu.sharepoint.com/sites/CSE371UG2018-ControlEngineering24668");
            add("www.google.com");
            add("www.youtube.com");
        }
    };


    public String Teacher(String url) throws SQLException {

        if (url.equals("")) {
            return "please fill in all the fields";
        } else {

           arr.add(url);
           return "url updated";
        }

    }
}

