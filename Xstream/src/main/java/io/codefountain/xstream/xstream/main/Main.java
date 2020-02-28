package io.codefountain.xstream.xstream.main;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import io.codefountain.xstream.xstream.domain.Author;
import io.codefountain.xstream.xstream.domain.Book;

public class Main {

	public static void main(String[] args) {
		
		
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("book", Book.class);
		xstream.alias("author", Author.class);
		
		Author author1 = new Author("Jones", "jones@example.com");
		Author author2 = new Author("Nick", "nick@example.com");
		
		Book book = new Book("987-546-777", "Java", "O'rielly", "2019", "Computer", new Author[] {author1, author2});
		
		System.out.println(xstream.toXML(book));
	}
}
