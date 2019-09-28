package com.dog.api;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dog-ratings")
public class DogController {
	@RequestMapping(method = RequestMethod.GET)
	public List<DogRating> getAllDogRatings() {
		return DogRatingManager.getInstance().getAllRatings();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void postDogRating(@RequestBody DogRating rating) throws Exception {
		if (rating == null) {
			throw new IllegalArgumentException("request body was null");
		}
		if (rating.getRating() < 10 || rating.getRating() > 16) {
			throw new IllegalArgumentException("rating should be between 10 and 16");
		}
		// TODO: Implement image processing to determine if image url links to a dog
		DogRatingManager.getInstance().addRating(rating);
	}
}
