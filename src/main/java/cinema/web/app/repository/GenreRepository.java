package cinema.web.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cinema.web.app.model.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
