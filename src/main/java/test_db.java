import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test_db
{
   public static void main(String[] args) throws SQLException, ClassNotFoundException {

   }
   public static void UpdateData(String sql ) throws SQLException, ClassNotFoundException { // function to update table

      PreparedStatement ps = null;
      try{

         DBconnector.connect(sql);
         System.out.println("the table is updated successfully");
      }
      catch(SQLException e)
      {
         System.out.println(e.toString());
      }
   }


}
