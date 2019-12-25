package cinema.web.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import cinema.web.app.model.Movie;
import cinema.web.app.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	MovieService movieService;

	@GetMapping(value = "/movies")
	public List<Movie> getMovies() {
		return movieService.findAll();
	}
	
	@PostMapping(value = "/movies")	
	public Movie createMovie(@RequestBody Movie movie) {
		return movieService.createMovie(movie);
	}
}
