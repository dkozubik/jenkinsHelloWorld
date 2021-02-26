/** 
 * The HelloWorldApp class implements an application that simply prints "Hello World" to standard output with a delay.
 */
import java.util.concurrent.TimeUnit;

public class HelloWorld {
	public static void main(String[] args) {
	    try {
            Thread.sleep(20000);
        }
        catch(InterruptedException ex)  {
            Thread.currentThread().interrupt();
        }
		System.out.println("Hello World");
	}
}
