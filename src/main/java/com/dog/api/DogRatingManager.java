package com.dog.api;

import java.util.ArrayList;
import java.util.List;

public class DogRatingManager {
	private static DogRatingManager instance;
	private List<DogRating> ratings;
	
	private DogRatingManager() {
		ratings = new ArrayList<DogRating>();
	}
	
	public static DogRatingManager getInstance() {
		if (instance == null) {
			instance = new DogRatingManager();
		}
		return instance;
	}
	
	public boolean addRating(DogRating rating) {
		return getInstance().ratings.add(rating);
	}
	
	public List<DogRating> getAllRatings() {
		return getInstance().ratings;
	}
}
