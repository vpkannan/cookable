package dev.vignesh.home.service.impl;

import dev.vignesh.home.entity.Recipe;
import dev.vignesh.home.entity.service.RecipeService;
import dev.vignesh.home.repository.RecipeRepo;

/**
 * Created by vignesh on 6/20/17.
 */
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepo recipeRepo;

    public RecipeServiceImpl(RecipeRepo recipeRepo) {
        this.recipeRepo = recipeRepo;
    }

    @Override
    public Recipe getRecipeById(long id) {
        return new Recipe();
    }

}
