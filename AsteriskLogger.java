
public class AsteriskLogger implements Logger{

  @Override
  public void Log(String log) {
   System.out.println("***" + log + "***"); 
  }

  
  
  
  @Override
  public void Error(String error) {
    System.out.println(placeAsterisk(error));
    System.out.println("*** Error: " + error + "***");
    System.out.println(placeAsterisk(error));
  }
//  public string placeAsterisk (String
  
  public String placeAsterisk (String error) {
    String result = "";
    int stringlength = error.length();
    for (int i = 0; i != stringlength + 15; i++) {
        result += "*";
  }
    return result;
  
}
}
