
public class App {

  public static void main(String[] args) {
    
  Logger loggerOne = new AsteriskLogger();
    
    loggerOne.Log("Hello");

        System.out.println("");  
    
    loggerOne.Error("Hello");
    
  Logger loggerTwo = new SpacedLogger();
    
    loggerTwo.Log("Goodbye");
    
        System.out.println("");
        
    loggerTwo.Error("Purple");
    
}
}
