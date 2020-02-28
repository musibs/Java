package io.codefountain.sax.basic.movies;

import java.io.FileInputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class Main {
	
	public static void main(String[] args) throws Exception {
		
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();
		MovieSaxHandler handler = new MovieSaxHandler();
		saxParser.parse(new FileInputStream(args[0]), handler);
		System.out.println(handler.getMovies());
	}

}
