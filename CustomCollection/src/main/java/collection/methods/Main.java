package collection.methods;
import java.util.*;


/*
 * @author Bhargav reddy id:170030703
 */

public class Main
{
	static final org.apache.log4j.Logger Logger =org.apache.log4j.Logger.getLogger("CustomCollection.class");
    public static void main(String[] args) 
    {
        CustomCollection<String> list = new CustomCollection<String>();
        int n;
        Scanner sc=new Scanner(System.in);
        Logger.info("No of Elements");
        n=sc.nextInt();
        int i;
        Logger.info("enter Elements"+n);
        String s;
        for(i=0;i<n;i++)
        {
        	s=sc.next();
        	list.addele(s);
        	
        }
        Logger.debug("List after adding elements"+list);
        list.remove(1);
        Logger.debug("List after removing  elements"+list);

        Logger.debug(list.getvalue(0));

        Logger.debug(list.size());
    }
}
