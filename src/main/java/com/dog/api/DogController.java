package com.dog.api;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dog-ratings")
public class DogController {
	@RequestMapping(method = RequestMethod.GET)
	public List<DogRating> getAllDogRatings() {
		return DogRatingManager.getInstance().getAllRatings();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void postDogRating(@RequestBody DogRating rating) throws Exception {
		if (rating.getRating() == null || rating.getRating() < 10 || rating.getRating() > 16) {
			throw new IllegalArgumentException("rating should be between 10 and 16");
		}
		if (rating.getImageUrl() == null || rating.getImageUrl().length() == 0) {
			throw new IllegalArgumentException("image url should be pup-ulated");
		}
		if (!UrlChecker.isValidUrl(rating.getImageUrl())) {
			throw new IllegalArgumentException("image url should be a valid url");
		}
		// TODO: Implement image processing to determine if image url links to a dog
		DogRatingManager.getInstance().addRating(rating);
	}
}
