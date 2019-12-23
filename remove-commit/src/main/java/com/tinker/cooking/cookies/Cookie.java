package com.tinker.cooking.cookies;

import com.tinker.cooking.Ingredient;
import com.tinker.cooking.Recipe;

import java.util.List;

public interface Cookie {

    void makeCookies();
    List<Ingredient> getIngredients();
    Recipe getRecipe();
    boolean isVegan();


}
