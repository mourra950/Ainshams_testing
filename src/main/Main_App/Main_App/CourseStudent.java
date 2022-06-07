package Main_App;

import java.util.ArrayList;

public class CourseStudent {


    String url1[] = {"https://engasuedu.sharepoint.com/sites/CSE371UG2018-ControlEngineering24668/",
            "www.google.com", "www.youtube.com"};

    public String checkLink(String url, ArrayList<String> arr) {
        for (int i = 0; i < url1.length; i++) {
            if (url.equals(arr.get(i)))
                return "valid";
        }
        return "INVALID";
    }

}
