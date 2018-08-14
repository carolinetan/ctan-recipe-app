package udemy.course.repositories;

import org.springframework.data.repository.CrudRepository;
import udemy.course.domain.Recipe;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
