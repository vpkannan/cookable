package dev.vignesh.home.entity.service;

import dev.vignesh.home.entity.Recipe;
import org.springframework.stereotype.Component;

/**
 * Created by vignesh on 6/20/17.
 */
@Component
public interface RecipeService {
    Recipe getRecipeById(long id);
}
