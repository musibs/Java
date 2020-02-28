package io.codefountain.xstream.xstream.domain;

public class Book {

	private String isbnNumber;
	private String title;
	private String publication;
	private String yearOfPublication;
	private String category;
	
	private Author[] authors;

	public Book(String isbnNumber, String title, String publication, String yearOfPublication, String category,
			Author[] authors) {
		super();
		this.isbnNumber = isbnNumber;
		this.title = title;
		this.publication = publication;
		this.yearOfPublication = yearOfPublication;
		this.category = category;
		this.authors = authors;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public String getTitle() {
		return title;
	}

	public String getPublication() {
		return publication;
	}

	public String getYearOfPublication() {
		return yearOfPublication;
	}

	public String getCategory() {
		return category;
	}

	public Author[] getAuthors() {
		return authors;
	}
	
	
	
	
}
