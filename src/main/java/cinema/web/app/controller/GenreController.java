package cinema.web.app.controller;

import cinema.web.app.model.Genre;
import cinema.web.app.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GenreController {

	@Autowired
	GenreService genreService;
	
	@GetMapping(value = "/genres")
	public List<Genre> getGenres() {
		return genreService.findAll();
	}
	
	@PostMapping(value = "/genres")
	public Genre createGenre(@RequestBody Genre genre) {
		return genreService.createGenre(genre);
	}
}
