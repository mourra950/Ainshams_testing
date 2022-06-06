import java.net.URI;

public class Browser {


    public static short open(String url) throws Exception {
        System.out.println(url);
        try {
            URI u = new URI(url);
            java.awt.Desktop.getDesktop().browse(u);
            System.out.println("ana hena");
 for (int i=0;i<0;i++)
 {

 }
        }

        catch (Exception e)
        {
            Alertbox.display("Invalid link","please report to the admin or the Doctor of the course");

            throw new Exception();
        }
        return 0;
    }
}
