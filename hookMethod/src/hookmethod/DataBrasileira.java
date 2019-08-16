
package hookmethod;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBrasileira extends AData{
  
    
public String exibeData(String data){
    
    DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
    try {
        data = dateFormat.parse(data).toString();
            
    } catch (ParseException ex) {
        Logger.getLogger(DataBrasileira.class.getName()).log(Level.SEVERE, null, ex);
    }
    return data;
}    


}
