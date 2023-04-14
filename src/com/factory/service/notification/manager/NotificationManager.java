/**
 * 
 */
package com.factory.service.notification.manager;

import com.factory.service.notification.Notification;

/**
 * @author manas
 *
 */
public class NotificationManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification notification = notificationFactory.createNotification("Facebook");
		notification.showNotification();
	}
}
