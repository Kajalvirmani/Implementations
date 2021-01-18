//proxy pattern implementation
import java.util.ArrayList; 
import java.util.List; 

 interface Internet 
{ 
	public void connectTo(String serverhost) throws Exception; 
} 
//if the site can be accessed , this class is accessed and site is connected to
 class RealInternet implements Internet 
{ 
	@Override
	public void connectTo(String serverhost) 
	{ 
		System.out.println("Connecting to "+ serverhost); 
	} 
} 


  
  // checking for the site to acces as banned or not using proxy
 class ProxyInternet implements Internet 
{ 
    private Internet internet = new RealInternet(); 
    private static List<String> bannedSites; 
      
    static
    { 
        bannedSites = new ArrayList<String>(); 
        bannedSites.add("abc.com"); 
        bannedSites.add("def.com"); 
        bannedSites.add("ijk.com"); 
        bannedSites.add("lnm.com"); 
    } 
      
    @Override
    public void connectTo(String serverhost) throws Exception 
    { 
        //if connecting to any banned sites
        if(bannedSites.contains(serverhost.toLowerCase())) 
        { 
            throw new Exception("Access Denied"); 
        } 
          
        internet.connectTo(serverhost); 
    } 
  
} 
//send a connection request to server
public class Proxy 
{ 
    public static void main (String[] args) 
    { 
        Internet internet = new ProxyInternet(); 
        try
        {   //tries to connect to non banned site and works fine
            internet.connectTo("geeksforgeeks.org"); 
            //tries to connect to banned site and gives "Acces Denied"
            internet.connectTo("abc.com"); 
        } 
        catch (Exception e) 
        { 
            System.out.println(e.getMessage()); 
        } 
    } 
} 

