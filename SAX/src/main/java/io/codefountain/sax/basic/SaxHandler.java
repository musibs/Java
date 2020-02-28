package io.codefountain.sax.basic;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxHandler extends DefaultHandler{
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("Starting of document");
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println("Ending of document");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("Start of element "+qName);
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("End of element "+qName);
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		
		/*
		 * Ignore white spaces
		 */
		if(ch.length == 0) {
			return;
		}
		System.out.println("Start characters "+new String(ch, start, length));
	}

}
