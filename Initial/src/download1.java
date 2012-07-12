import java.io.*;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.net.URL;

public class download1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Connection connection = Jsoup.connect("http://www.tamilwin.com");
		Document doc = Jsoup.connect("http://www.tamilwin.com").userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/535.2 (KHTML, like Gecko) Chrome/15.0.874.120 Safari/535.2").get();
		System.out.println(doc.getElementById("results"));
	}

}
