/** 
 * The HelloWorldApp class implements an application that simply prints "Hello World" to standard output with a delay.
 */
import java.util.concurrent.TimeUnit;

public class HelloWorld {
  public static void main(String[] args) {
    TimeUnit.SECONDS.sleep(30);
    System.out.println("Hello, World");
  }
}
