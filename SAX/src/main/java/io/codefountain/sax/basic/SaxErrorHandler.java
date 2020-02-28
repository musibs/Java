package io.codefountain.sax.basic;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class SaxErrorHandler implements ErrorHandler {

	public void error(SAXParseException exception) throws SAXException {
		System.err.println("Error "+exception.getMessage());
		throw new SAXException(exception);
		
	}

	public void fatalError(SAXParseException exception) throws SAXException {
		System.err.println("Fatal error "+exception.getMessage());
		throw new SAXException(exception);
		
	}

	public void warning(SAXParseException exception) throws SAXException {
		System.err.println("Warning "+exception.getMessage());
		
	}

}
