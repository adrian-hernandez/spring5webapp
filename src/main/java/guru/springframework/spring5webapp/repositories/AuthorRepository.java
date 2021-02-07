package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

// Passing Long because that is the data type of the Id
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
