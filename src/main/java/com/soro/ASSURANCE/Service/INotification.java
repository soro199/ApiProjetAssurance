/**
 * 
 */
package com.soro.ASSURANCE.Service;

import java.util.List;

import com.soro.ASSURANCE.Entity.*;

/**
 * @author Administrator
 *
 */
public interface INotification {

	public Notification createDocument(Notification ag);

	public List<Notification> readNotification();

	public Notification updateNotificationById(Long id, Notification ag);

	public void deleteNotificationById(Long id);

}
