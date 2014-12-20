import java.text.*;
import java.util.*;
public class CellDate
{
   private DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
   
   public void setValue(String input)
   {
     Date date;
    try
    {
      date = dateFormat.parse(input);
      input = dateFormat.format(date);
    }  catch (Exception e){
      input = " ";
    }
    super.setValue(input);
   }
}
     
