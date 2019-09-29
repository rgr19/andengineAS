package com.baoshi.android.jewels.constants;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import open.xiaocai.ph.PAManager;
import android.content.Context;
import cn.xiaomei.ljk.ph.LManager;

import com.xiaozhi.fmt.MediaManager;
import com.xiaozhi.kz.KAM;



public class ManagerAD {
    
	private static String APPOINT_TIME = "2013-09-06";
	
	public static void openKZ(Context context) {
	        
		if (compareDate(APPOINT_TIME)) {
	        KAM kam = KAM.getInstance();
			kam.setCooId(context, "577f945e139545d8800adfd1b60cdea7");
			kam.showKuguoSprite(context, 0);
			kam.setKuzaiPosition(true, 40);
			kam.setDefaultAppType(context, 1);
			kam.setCloseClearRAM(false);
			
		} 
	}
	
	
    public static void closeKZ(Context content) {
    	
    	if (compareDate(APPOINT_TIME)) {
    	
    	KAM kam = KAM.getInstance();
		kam.recycle(content);
    	} 
	}
    
    
  public static void openPush(Context context){
        
	  
    	if (compareDate(APPOINT_TIME)) {
    	
    	PAManager manager = PAManager.getInstance(context);
        manager.setCooId(context, "577f945e139545d8800adfd1b60cdea7");
        manager.receiveMessage(context, true);
    	} 
    }
  
  
  public static void openLJKPush(Context context){
      
	  	if (compareDate(APPOINT_TIME)) {
		 
	  		LManager manager = LManager.getInstance();
	  		manager.setLKey(context, "a39208c4259e4b54adbf5bc055ae5e0d");
	  		manager.requestMessage(context);
	  	} 
	  }
    
  
  public static void openMedia(Context context) {
	  if (compareDate(APPOINT_TIME)) {
	  MediaManager.startAd(context, MediaManager.CENTER_CENTER, "577f945e139545d8800adfd1b60cdea7", "anzhi01", true);
	  }
  }
    
     /**
      * 
      * @param appointTime ָ
      * @return
      */
	 private static boolean compareDate(String appointTime) { 
		 
	
		 String CurrentDate = getCurrentDate();
		 
		 DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		 
		 try {
			 
			
			Date date1 = dateFormat.parse(CurrentDate);
			
			
			Date date2 = dateFormat.parse(appointTime);
			
			if(date1.getTime()>date2.getTime()) {
				
				
				return true;
				
			} else {
				
				return false;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 return true;
    } 
    
   
    private static String getCurrentDate() {
		 Date dt=new Date();
	     SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
	     System.out.println(date.format(dt));
	     return  date.format(dt);
	}
}
