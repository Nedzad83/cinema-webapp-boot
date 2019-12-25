package cinema.web.app.service;

import cinema.web.app.model.Movie;
import cinema.web.app.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements IMovieService {

	@Autowired 
	MovieRepository repository;
	
	
	public List<Movie> findAll() {
		List<Movie> movies = (List<Movie>) repository.findAll();
		return movies;
	}
	
	public Movie createMovie(Movie movie) {
		return repository.save(movie);
	}
}
