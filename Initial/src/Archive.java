import org.archive.wayback.archivalurl.*;

import org.archive.wayback.util.url.*;
import org.archive.wayback.util.*;
import org.archive.wayback.core.WaybackRequest;
public class Archive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WaybackRequest wbr=new WaybackRequest();
		System.out.println("xnmfc0");
		// TODO Auto-generated method stub
         ArchivalUrl arc=new ArchivalUrl(wbr);
       
         String str=arc.toReplayString("http://yahoo.com");
       IPRange  ip=new IPRange();
       System.out.println(ip.getIp());
       
	}

}
