package com.soro.ASSURANCE.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soro.ASSURANCE.Entity.*;
import com.soro.ASSURANCE.Repository.*;

@Component
public class DocumentImpl implements IDocument {

	@Autowired
	DocumentRepository document;

	@Override
	public Document createDocument(Document ag) {
		// TODO Auto-generated method stub
		return document.save(ag);
	}

	@Override
	public List<Document> readDocument() {
		// TODO Auto-generated method stub
		return document.findAll();
	}

	@Override
	public Document updateDocumentById(Long id, Document ag) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDocumentById(Long id) {
		// TODO Auto-generated method stubù

		document.deleteById(id);

	}

}
