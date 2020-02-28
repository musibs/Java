package io.codefountain.sax.basic.movies;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MovieSaxHandler extends DefaultHandler {

	private List<Movie> movies = new ArrayList<>();
	private Movie movie;
	private Artist artist;
	private StringBuilder dataContainer = null;

	private boolean isMovieNameFound;
	private boolean isReleaseYearFound;
	private boolean isArtistNameFound;
	private boolean isContactFound;
	private boolean isRatingFound;
	private boolean isThemeFound;

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if ("Movie".equals(qName)) {
			movie = new Movie();
			movie.setId(Integer.parseInt(attributes.getValue("id")));
		} else if ("Name".equals(qName)) {
			isMovieNameFound = true;
		} else if ("ReleaseYear".equals(qName)) {
			isReleaseYearFound = true;
		} else if ("Artist".equals(qName)) {
			artist = new Artist();
			artist.setId(Integer.parseInt(attributes.getValue("id")));
		} else if ("ArtistName".equals(qName)) {
			isArtistNameFound = true;
		} else if ("Contact".endsWith(qName)) {
			isContactFound = true;
		} else if ("Rating".endsWith(qName)) {
			isRatingFound = true;
		} else if ("Theme".equals(qName)) {
			isThemeFound = true;
		}

		dataContainer = new StringBuilder();
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (isArtistNameFound) {
			artist.setName(dataContainer.toString());
			isArtistNameFound = false;
		}
		if (isContactFound) {
			artist.setContact(dataContainer.toString());
			isContactFound = false;
		}

		if ("Artist".equals(qName)) {
			movie.getArtists().add(artist);
		}

		if (isMovieNameFound) {
			movie.setName(dataContainer.toString());
			isMovieNameFound = false;
		}

		if (isReleaseYearFound) {
			movie.setReleaseYear(dataContainer.toString());
			isReleaseYearFound = false;
		}

		if (isRatingFound) {
			movie.setRating(dataContainer.toString());
			isRatingFound = false;
		}
		if (isThemeFound) {
			movie.setTheme(dataContainer.toString());
			isThemeFound = false;
		}

		if ("Movie".equalsIgnoreCase(qName)) {
			getMovies().add(movie);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		dataContainer.append(new String(ch, start, length));
	}

	public List<Movie> getMovies() {
		return movies;
	}
}
