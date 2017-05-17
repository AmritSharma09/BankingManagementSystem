
package banking;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;


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
//   Socket sk=new Socket("www.flexonLabs.com",80);
//   BufferedReader br=new BufferedReader(new InputStreamReader(sk.getInputStream()));
//   String str;
//   while((str=br.readLine())!=null){
//       System.out.print(str);
//
//   
//   }
       
        String urlString="http://flexonlabs.com/sms.aspx?pno="+pno+"&message="+sms; 
        System.out.println(escapeHTML(urlString));
  URL url=new URL(escapeHTML(urlString));
//   URLConnection con= url.openConnection();
//   BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
//   String str;
//   while((str=br.readLine())!=null){
//       System.out.print(str);
//
//   
//   }
//  
//   
//   

 
 

//    HttpClient client = new DefaultHttpClient();
//    HttpGet request = new HttpGet();
//    request.setURI(url);
//   // HttpGet request = new HttpGet("http://flexonlabs.com/Default/Pages/Default.aspx?Type=Info");
//    HttpResponse response = client.execute(request);

   
    //StringBuffer response = new StringBuffer();
    //while ((line = rd.readLine()) != null) {
              //response.append(line);
     

    //System.out.println(response.toString());
   
   
   // URL url = new URL (MATRIXURL);

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
