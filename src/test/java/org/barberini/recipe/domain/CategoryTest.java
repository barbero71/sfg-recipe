package org.barberini.recipe.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void getId() {
        Long idValue = 4L;

        category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() {
        String catValue = "desctiTest";
        category.setDescription(catValue);
        assertEquals(catValue, category.getDescription());
    }

    @Test
    public void getRecipes() {
        Set<Recipe> recipeValue = new HashSet<>();
        Recipe rec1 = new Recipe();
        rec1.setDescription("descri");
        rec1.setId(1L);
        recipeValue.add(rec1);
        category.setRecipes(recipeValue);

        assertEquals(recipeValue, category.getRecipes());
    }
}