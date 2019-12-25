package cinema.web.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import cinema.web.app.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}
