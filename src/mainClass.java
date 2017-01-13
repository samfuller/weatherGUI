import java.io.*;
import java.net.*;

public class mainClass {

	public static void main(String[] args) throws IOException {
	String zip = null;
	zip = "92106";
	String urlreq = "https://www.wunderground.com/cgi-bin/findweather/getForecast?query=" + zip;
	String response = getHtml(urlreq);
	System.out.print(response);
	

	}



private static String getHtml(String input) throws IOException{
	URL xurl = null;
	try {
		xurl = new URL(input);
	} catch (MalformedURLException e)
	{
		String error = "Invalid URL";
		return error;
	}
	InputStream is = (InputStream) xurl.getContent();
	 BufferedReader br = new BufferedReader(new InputStreamReader(is));
	 String line = null;
	 StringBuffer sb = new StringBuffer();
	 while((line = br.readLine()) != null){
	   sb.append(line);
	 }
	String htmlContent = sb.toString();
	return htmlContent;
}
}