package genericUtility;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class JavaUtility {
	
	//Generate Random no
	
	public int getRandomNo() {
		
		Random r=new Random();
		
		return r.nextInt(1000);
	}		
		//CurrentDate
		
	
	public String getCurrentDate() {
		
		Date date =new Date(0);
		return date.toString();
		
		}
	
	public String getDateAndTime() {
		SimpleDateFormat sdf=new SimpleDateFormat();
		
		return sdf.format(new Date(0));
	}
		}
	


