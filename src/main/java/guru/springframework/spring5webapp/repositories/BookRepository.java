package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

// Passing Long because that is the data type of the Id
public interface BookRepository extends CrudRepository<Book, Long> {
}
