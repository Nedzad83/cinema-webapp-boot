package cinema.web.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import cinema.web.app.model.Genre;
import cinema.web.app.repository.GenreRepository;

@Service
public class GenreService implements IGenreService {

	@Autowired
	private GenreRepository repository;
	
	
	public List<Genre> findAll() {
		List<Genre> genres = (List<Genre>) repository.findAll();;
		return genres;
	}
	
	public Genre createGenre(Genre genre) {
		Genre _genre = repository.save(new Genre(genre.getName(), genre.getDescription()));
		return _genre;
	}
	
	public ResponseEntity<Genre> updateGenre (Long genreId, Genre genre) {
		Optional<Genre> genreData = repository.findById(genreId);

		if (genreData.isPresent()) {
			Genre _genre = genreData.get();
			_genre.setName(genre.getName());
			_genre.setDescription(genre.getDescription());
			return new ResponseEntity<Genre>(repository.save(_genre), HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Genre>(HttpStatus.NOT_FOUND);
		}
	}
	
	public ResponseEntity<String> deleteGenreById (long id) {
		repository.deleteById(id);
		return new ResponseEntity<>("Genre with id " + id + " was deleted!", HttpStatus.OK);
	}

	@Override
	public List<Genre> findByName() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
