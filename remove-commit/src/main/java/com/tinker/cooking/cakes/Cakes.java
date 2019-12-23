package com.tinker.cooking.cakes;

import com.tinker.cooking.Ingredient;
import com.tinker.cooking.Recipe;

import java.util.List;

public interface Cakes {

    void makeCakes();
    List<Ingredient> getIngredients();
    Recipe getRecipe();
    boolean isVegan();


}
