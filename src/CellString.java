// placeholder
public class CellString extends Cell
{
  public CellString()
  {
    super();
  }
  public CellString(String val)
  {
    setValue(val);
  }
  public String toString()
  {
    String result = getValue();
    if(result.length() == 0)
    {
      result = "<empty>";
    }
    else
    {
      result = "\"" + result + "\"";
    }
    return result;
  }
  public String setValue()
  {
    return setValue();
  }
}
