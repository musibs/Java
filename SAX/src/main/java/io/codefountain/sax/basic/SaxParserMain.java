package io.codefountain.sax.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class SaxParserMain {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, FileNotFoundException, IOException {
		
		if(args.length != 1) {
			System.err.println("Usage:  SaxParserMain <absolute filepath>");
			System.exit(1);
		}
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		XMLReader xmlReader = saxParser.getXMLReader();
		xmlReader.setContentHandler(new SaxHandler());
		xmlReader.setErrorHandler(new SaxErrorHandler());
		xmlReader.parse(new InputSource(new FileInputStream(new File(args[0]))));

	}
}
