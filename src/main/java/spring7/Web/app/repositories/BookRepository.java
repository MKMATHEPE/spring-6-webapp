package spring7.Web.app.repositories;

import org.springframework.data.repository.CrudRepository;
import spring7.Web.app.domain.Book;

public interface BookRepository extends CrudRepository <Book, Long> {
}
