import org.json.JSONArray;

import java.sql.*;
import java.util.List;

public class RS  implements pg_DAO {


    public JSONArray  getRecords() {
        JSONArray myjson = null;
        List<String> myStrings;


        Connection con = null;
        PreparedStatement prSt = null;
        ResultSet rs = null;
        try { Class.forName(DRIVER);
            con = DriverManager.getConnection
                    (DB_URL, USER, PASS);

            String query = "SELECT   schema_rpr.fn_record_ret(pin_05=> ?, pin_02 => ?)";

prSt = con.prepareStatement(query);

            prSt.setInt(1, 5068);
            prSt.setString(2, "abc,dsdsdsdsds");

rs = prSt.executeQuery();

            myjson= ResultSetConverter.convertJSON(rs);
            //myStrings =ResultSetConverter.convertString(rs);


rs.close();
} catch (ClassNotFoundException e) {
// TODO Auto-generated catch block

e.printStackTrace();
} catch (SQLException e) {

// TODO Auto-generated catch block
e.printStackTrace();
} finally {
try {
if (rs != null) rs.close();
if (prSt != null) prSt.close();
if (con != null) con.close();
} catch (Exception ex) {
            }
}



        if (null != myjson){

           return myjson;

        //    if (null != myStrings){
       //         return myStrings.toString();

        }else{
            return null;
        }


    }




}
