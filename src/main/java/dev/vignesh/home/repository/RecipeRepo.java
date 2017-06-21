package dev.vignesh.home.repository;

import dev.vignesh.home.entity.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vignesh on 6/20/17.
 */
public interface RecipeRepo extends CrudRepository<Recipe, Long> {
}
