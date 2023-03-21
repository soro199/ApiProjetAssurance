/**
 * 
 */
package com.soro.ASSURANCE.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soro.ASSURANCE.Entity.*;
import com.soro.ASSURANCE.Repository.*;

/**
 * @author Administrator
 *
 */
@Component
public class NotificationImpl implements INotification {

	@Autowired
	NotificationRepository notification;

	@Override
	public Notification createDocument(Notification ag) {
		// TODO Auto-generated method stub
		return notification.save(ag);
	}

	@Override
	public List<Notification> readNotification() {
		// TODO Auto-generated method stub
		return notification.findAll();
	}

	@Override
	public Notification updateNotificationById(Long id, Notification ag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteNotificationById(Long id) {
		// TODO Auto-generated method stub
		notification.deleteById(id);
	}

}
