
public class SpacedLogger implements Logger{

  @Override
  public void Log(String log) {
    
      System.out.println(log.replace("", " "));
   
    // implement a for loop i= 0; i < log.length(); i++) {sysout log.charAt(i)
  }

  @Override
  public void Error(String error) {
  
    
    System.out.println("ERROR: " + error.replace(""," "));
    
  }

}
