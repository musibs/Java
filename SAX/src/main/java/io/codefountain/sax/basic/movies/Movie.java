package io.codefountain.sax.basic.movies;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Movie {
	
	private int id;
	private String name;
	private String releaseYear;
	private List<Artist> artists = new ArrayList<>();
	private String rating;
	private String theme;
	
}
