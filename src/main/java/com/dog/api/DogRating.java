package com.dog.api;

public class DogRating {
	private final int rating;
	private final String imageUrl;
	
	public DogRating(int rating, String imageUrl) {
		this.rating = rating;
		this.imageUrl = imageUrl;
	}
	
	public int getRating() {
		return rating;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
}
