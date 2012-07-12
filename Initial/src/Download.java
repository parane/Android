import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;

import org.archive.wayback.*;
import org.archive.wayback.util.FileDownloader;
public class Download {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NoSuchAlgorithmException 
	 */
	public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
		// TODO Auto-generated method stub
           File target=new File("C:/Users/Parani/Desktop/Videos/paranex.html");
           FileDownloader fld=new FileDownloader();
           URL url = null;
		try {
			url = new URL("http://www.bbc.co.uk");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(fld.setDigest(true));
           fld.download(url, target);
	}

}
