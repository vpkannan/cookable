package dev.vignesh.home;

import dev.vignesh.home.controller.RecipeController;
import dev.vignesh.home.entity.service.RecipeService;
import dev.vignesh.home.repository.RecipeRepo;
import dev.vignesh.home.service.impl.RecipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Created by vignesh on 6/20/17.
 */

@SpringBootConfiguration
public class CookableApplicationConfig {

    @Autowired
    RecipeRepo recipeRepo;

    @Bean
    public RecipeService recipeService() {
        return new RecipeServiceImpl(recipeRepo);
    }

    @Bean
    public RecipeController recipeController() {
        return new RecipeController(recipeService());
    }

}
