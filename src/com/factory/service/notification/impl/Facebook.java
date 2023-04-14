/**
 * 
 */
package com.factory.service.notification.impl;

import com.factory.service.notification.Notification;

/**
 * @author manas
 *
 */
public class Facebook implements Notification {

	
	public LikeNotification likeNotification;
	public	CommentNotification commentNotification;
	
	
	public Facebook() {
		likeNotification = new LikeNotification();
	}
	
	public void setCommentNotification(CommentNotification commentNotification) {
		this.commentNotification = commentNotification;
	}

	@Override
	public void showNotification() {
		// TODO Auto-generated method stub
		System.out.println("Notification from Facebook");
	}
	
	
	
}
