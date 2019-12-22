package com.tinker.cookies;

import java.util.List;

public interface Cookies {

    void makeCookies();
    List<Ingredient> getIngredients();
    Recipe getRecipe();
    boolean isVegan();


}
