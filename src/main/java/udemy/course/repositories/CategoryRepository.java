package udemy.course.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.course.domain.Category;

import java.util.Optional;

/**
 * Created by jt on 6/13/17.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
