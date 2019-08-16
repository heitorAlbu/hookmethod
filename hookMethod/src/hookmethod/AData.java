
package hookmethod;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class AData {
    
    public abstract String exibeData(String data);

    public String dataPrincipal(String data) throws ParseException {
      
      DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
      data = exibeData("2002-02-03");
   
      return   dateFormat.format(data);
     
    }

    
}
