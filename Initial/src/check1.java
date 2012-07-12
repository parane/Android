
import org.archive.wayback.util.url.*;
import org.archive.wayback.resourcestore.resourcefile.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
public class check1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(UrlOperations.urlToHost("http://tamilwin.com"));
		ArrayList<String> alst = null;
		try {
			alst=(ArrayList<String>) UrlLinkExtractor.extractLinks("http://youtube.com");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Iterator<String> itr=alst.iterator();
		while(itr.hasNext()){
			String str=itr.next();
			System.out.println(str);
		}
	}

}

