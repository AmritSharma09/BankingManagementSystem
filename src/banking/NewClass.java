
package banking;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

//THIS CLASS IS FOR GET SMS GETWAY THROUGH WHICH WE SEND MESSAGE TO ACCOUNT HOLDER IF ANY TRANSACTION IS PERFORMED WITH HIS RESPECTION ACCOUNT
public class NewClass {
    private final String USER_AGENT = "Mozilla/5.0";
    public static String escapeHTML(String s) {
        
        
    StringBuilder out = new StringBuilder(Math.max(16, s.length()));
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (c > 127 || c == '"' || c == '<' || c == '>' ) {
            out.append("&#");
            out.append((int) c);
            out.append(';');
        } 
        else if(c==' ')
        {
          out.append("%20");
        }
        else {
            out.append(c);
        }
    }
    return out.toString();
}
    public void sendSms(String pno, String sms){
   try{

       
        String urlString="http://THAT_WEBSITE_LINK_FROM_WHERE_YOU_GET_THIS_SERVICE/sms.aspx?pno="+pno+"&message="+sms; 
        System.out.println(escapeHTML(urlString));
  URL url=new URL(escapeHTML(urlString));
   

 
 


 URLConnection conn = url.openConnection();
 conn.setDoOutput (true);
 OutputStreamWriter wr = new OutputStreamWriter (conn.getOutputStream());
 //wr.write (q);
 wr.flush();
 // BufferedReader rd = new BufferedReader(new InputStreamReader(((HttpURLConnection) (new URL(urlString)).openConnection()).getInputStream(), Charset.forName("UTF-8")));

 BufferedReader rd = new BufferedReader (new InputStreamReader (conn.getInputStream()));
 String line;
 System.out.println ("Message Send Successfully");
 while ((line = rd.readLine()) != null) {  }
 wr.close();
 rd.close();
   
  
   
   }catch(Exception e){System.out.println(e.getMessage());}
    
    }
    
}
