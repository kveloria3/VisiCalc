// placeholder
public class Cell
{
  String value;
  public Cell()
  {
    value = " ";
  }
  public Cell(String val)
  {
    value = val;
  }
  public String getValue()
  {
    return value;
  }
  public String toDisplay()
  {
    int columnWidth = 12;
    String output = value;
    if(output.length()>columnWidth)
    {
      output = output.substring(0, columnWidth - 1) + ">";
    }
    if(output.length()%2 == 1)
    {
      output += " ";
    }
    while(output.length()<columnWidth)
    {
      output = " " + output + " ";
    }
    return output;
  }
  
  public String toString()
  {
    String result = getValue();
    if(result.length() == 0)
    {
      result = "<empty>";
    }
    return result;
  }
}
  
 
