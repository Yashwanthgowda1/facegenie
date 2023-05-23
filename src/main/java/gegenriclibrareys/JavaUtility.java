package gegenriclibrareys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/**
	 * this method usgenerate a random number to number
	 * @param limit 
	 * @return 
	 */
	public int genaraterandomnumber(int limit) {
		Random random=new Random();
		int randomnumber=random.nextInt(limit);
		return randomnumber;
	}
	public String getcurrentdatetime() {
		Date formate=new Date();
	SimpleDateFormat sdf=new SimpleDateFormat("yy-MM-dd-hh-mm-ss");
	String currentdate=sdf.format(formate);
	return currentdate;
	}
	
	
	
	

}
