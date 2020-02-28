package io.codefountain.xstream.xstream.domain;

public class Author {

	private String name;
	private String contactEmail;
	
	public Author(String name, String contactEmail) {
		super();
		this.name = name;
		this.contactEmail = contactEmail;
	}
	public String getName() {
		return name;
	}
	public String getContactEmail() {
		return contactEmail;
	}
}
