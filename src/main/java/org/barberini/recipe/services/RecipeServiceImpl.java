package org.barberini.recipe.services;

import lombok.extern.slf4j.Slf4j;
import org.barberini.recipe.domain.Recipe;
import org.barberini.recipe.repositories.RecipeRepository;
import org.barberini.recipe.services.RecipeService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {

        log.debug("I'm in the Service");

        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining((recipeSet::add));

        return recipeSet;
    }
}
