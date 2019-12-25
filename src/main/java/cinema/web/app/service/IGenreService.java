package cinema.web.app.service;

import java.util.List;

import cinema.web.app.model.Genre;

public interface IGenreService {
	
	List<Genre> findByName();

}
