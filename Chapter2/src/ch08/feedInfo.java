package ch08;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class feedInfo {
	public String orderNumber;
	public String orderPhoneNumber;
	public String orderAddress;
	public String orderDate;
	public String orderTime;
	public String orderPrice;
	public String menuNumber;
	
	
	
	 public feedInfo(String orderPhoneNumber, String orderAddress,  String orderPrice, String menuNumber) {
		 
		  	String dateTime = getDateTimeString();		 
		  	String today = getToday();   
		  	String time = getTime();
		  			 
		    this.orderNumber = dateTime;
		    this.orderPhoneNumber = orderPhoneNumber.replace("-", "");
		    this.orderAddress = orderAddress;
		    this.orderDate = today;
		    this.orderTime = time;
		    this.orderPrice = orderPrice;
		    this.menuNumber = menuNumber;
	  }
	 
	 
	 private String getDateTimeString() {
		LocalDateTime now = LocalDateTime.now();
	  	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmmss");
	  	String dateTime = now.format(formatter); 
	  	
	  	return dateTime;		 
	 }
	 
	 private String getToday() {
		 String today = LocalDate.now().toString();	
		 return today;
	 }
	 
	 private String getTime() {
		 String time = LocalTime.now().truncatedTo(ChronoUnit.SECONDS).toString();
		 return time;
	 }
	 
	 public void showFeedInfo() {
	        System.out.println("Order Number: " + orderNumber);
	        System.out.println("Order Phone Number: " + orderPhoneNumber);
	        System.out.println("Order Address: " + orderAddress);
	        System.out.println("Order Date: " + orderDate);
	        System.out.println("Order Time: " + orderTime);
	        System.out.println("Order Price: " + orderPrice);
	        System.out.println("Menu Number: " + menuNumber);
	    }
	}

