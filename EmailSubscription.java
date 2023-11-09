package org.setinterface;

import java.util.HashSet;

public class EmailSubscription {

	public static void main(String[] args) {
		//create a HashSet to manage unique email ID
		HashSet<String> emailSubs = new HashSet<String>();
		 //add all this email id to subscription list
		emailSubs.add("jon@gmail.com");
		emailSubs.add("lavish@gmail.com");
		emailSubs.add("swapnil@gmail.com");
		emailSubs.add("James@gmail.com");
		emailSubs.add("jon@gmail.com"); //attempting a duplicate user
		emailSubs.add("lavish@gmail.com");//attempting a duplicate user
		
		System.out.println("Email Subscription :"+emailSubs);
		
		//insertion order can not be predicted->
		//what is index?
		 
		//check if the user exist or not in set
		boolean hasSubscription = emailSubs.contains("l@gmail.com");
		if(hasSubscription) {
			System.out.println("User is available in the subscription..");
		}else {
			System.out.println("User is not subscribed...");
		}
	}

}
