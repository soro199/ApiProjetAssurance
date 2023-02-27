/**
 * 
 */
package com.soro.ASSURANCE.Controller;

import java.awt.PageAttributes.MediaType;
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

import com.soro.ASSURANCE.Repository.DocumentRepository;
import com.soro.ASSURANCE.Service.DocumentImpl;

import jakarta.transaction.Transactional;

import com.soro.ASSURANCE.Entity.*;

/**
 * @author Administrator
 *
 */
@RestController
public class DocumentController {
	
	@Autowired
	public DocumentRepository documentR;
	@Autowired
	public DocumentImpl documentI;
	
	
	@RequestMapping(value = "/ajouteDocument",method =RequestMethod.POST )
	public Document AjouterDocument(@RequestBody Document ag) {
		return documentI.createDocument(ag);
				
	}
	
	
	
	@RequestMapping(value="/listeDocument", method = RequestMethod.GET)

	public List<Document> listeDocument(){		
		return documentI.readDocument();
	}
	
	
	
	@RequestMapping(value="/afficherDocument/{id}", method = RequestMethod.GET)
	public Document afficherDocument(@PathVariable Long id){
		
		Document doc = documentR.findById(id).orElse(null);
		
		return doc;
		
	}
	
	
	@DeleteMapping(value="/deleteDocument/{id}")
	public void deleteDocument(@PathVariable Long id) {
	documentI.deleteDocumentById(id);
		
	
	}
	
	
	@PutMapping(value="/updateDocument/{id}")
	@ResponseBody
	@Transactional
	public Document updateDocument(@RequestBody Document D, @PathVariable Long id) {
		
		D.setId(id);
		documentR.save(D);
		return D;

		
		
	}
	

}
