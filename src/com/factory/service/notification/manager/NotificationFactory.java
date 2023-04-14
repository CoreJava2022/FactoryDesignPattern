/**
 * 
 */
package com.factory.service.notification.manager;

import com.factory.service.notification.Notification;
import com.factory.service.notification.impl.Facebook;
import com.factory.service.notification.impl.Instagram;
import com.factory.service.notification.impl.LikeNotification;
import com.factory.service.notification.impl.Whatsapp;

/**
 * @author manas
 *
 */
public class NotificationFactory {	
	
	
	public Notification createNotification(String notificationName) {
		
		if(notificationName != null && !notificationName.isEmpty()){    
			
			switch(notificationName){
			
			case "Facebook" :
	
				return new Facebook();
			
			case "Instagram" :
			
				return new Instagram();
				
			case "Whatsapp" :
			
				return new Whatsapp();
				
			default :
				throw new IllegalStateException();	
		   }
		}
		return null;
	}	
	}