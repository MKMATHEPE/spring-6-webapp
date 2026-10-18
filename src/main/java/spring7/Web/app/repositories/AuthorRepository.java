package spring7.Web.app.repositories;

import org.springframework.data.repository.CrudRepository;
import spring7.Web.app.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
