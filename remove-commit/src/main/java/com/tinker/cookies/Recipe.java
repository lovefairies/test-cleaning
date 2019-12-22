package com.tinker.cookies;

import java.util.List;

public interface Recipe {

    List<Ingredient> getIngredients();
    List<String> getSteps();
    List<String> getCookingTools();
}
