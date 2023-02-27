package com.soro.ASSURANCE.Service;

import java.util.List;

import com.soro.ASSURANCE.Entity.*;


public interface IDocument {
	
	public Document createDocument(Document ag);
	public List<Document> readDocument();
	public Document updateDocumentById(Long id, Document ag);
	public void deleteDocumentById(Long id);
	
}
