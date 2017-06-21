package dev.vignesh.home.controller;

import dev.vignesh.home.entity.Recipe;
import dev.vignesh.home.entity.service.RecipeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vignesh on 6/20/17.
 */

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public Recipe getRecipeById(long id) {
        return new Recipe();
    }

}
