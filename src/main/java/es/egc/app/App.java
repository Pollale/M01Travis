package es.egc.app;
import org.apache.log4j.*; 
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{

	static Logger log=Logger.getLogger(App.class);
	
	static int getVal(){
	return 1;
	}
	
	 
	
    public static void main( String[] args )
    {	
		log.info("Returning 1");
        System.out.println( "Hello World! EGC is beautiful" );
		Date d = new Date();
		System.out.println( "It's " + d );
		
    }
}
