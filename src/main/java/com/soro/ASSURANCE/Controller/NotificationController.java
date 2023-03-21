/**
 * 
 */
package com.soro.ASSURANCE.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.soro.ASSURANCE.Entity.HistorisqueConnexion;
import com.soro.ASSURANCE.Entity.Notification;
import com.soro.ASSURANCE.Repository.NotificationRepository;
import com.soro.ASSURANCE.Service.NotificationImpl;

import jakarta.transaction.Transactional;

/**
 * @author Administrator
 *
 */
@RestController
public class NotificationController {

	@Autowired
	NotificationImpl notifImp;
	@Autowired
	NotificationRepository notifR;

	@RequestMapping(value = "/ajouteNotification", method = RequestMethod.POST)
	public Notification AjouterNotification(@RequestBody Notification notif) {
		return notifImp.createDocument(notif);

	}

	@RequestMapping(value = "/listeNotification", method = RequestMethod.GET)

	public List<Notification> listeNotification() {
		return notifImp.readNotification();
	}

	@RequestMapping(value = "/afficherNotification/{id}", method = RequestMethod.GET)
	public Notification afficherNotification(@PathVariable Long id) {

		Notification notif = notifR.findById(id).orElse(null);

		return notif;

	}

	@DeleteMapping(value = "/deleteNotification/{id}")
	public void deleteNotification(@PathVariable Long id) {
		notifImp.deleteNotificationById(id);

	}

	@PutMapping(value = "/updateNotification/{id}")
	@ResponseBody
	@Transactional
	public Notification updateNotification(@RequestBody Notification notif, @PathVariable Long id) {

		notif.setId(id);
		notifR.save(notif);
		return notif;

	}

}
