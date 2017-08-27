package entity;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;

/*
 * 切面增强类
 */
public class Audience {
	
     public void enter() {
         System.out.println("Entering the Cinema");
     }
 
     public void leave() {
         System.out.println("Leaving the Cinema");
     }
 
     public void sad() { 
         System.out.println("Feeling sadness");
     }
 
     public void anger() { 
         System.out.println("Feeling anger");
     }
 
     public void scare() { 
         System.out.println("Feeling scared");
     }
     
     public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    	 DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //
    	 Timestamp time1 = new Timestamp(System.currentTimeMillis());
    	 System.out.println("start time: " + df.format(time1));
    	 proceedingJoinPoint.proceed();
    	 Timestamp time2 = new Timestamp(System.currentTimeMillis());
    	 System.out.println("end   time: " + df.format(time2));
    	 System.out.println("total time: " + (time2.getTime() - time1.getTime())/1000.0 + " s.");
     }
 }
