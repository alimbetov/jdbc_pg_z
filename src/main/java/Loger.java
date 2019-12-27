import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class Loger {


  public static void main(String[] args) throws IOException {

      RS myrs = new RS();
      System.out.println( myrs.getRecords());
      FileWriter nFile = new FileWriter("file1.txt");

      JSONArray myjsons;

      myjsons = myrs.getRecords();

     
      if (myjsons!=null){
          nFile.write(  myjsons.toString());
      }


      nFile.close();
 }

}
