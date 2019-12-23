package com.tinker.cooking;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Recipe {

    private List<Ingredient> ingredients;
    private List<String> steps;
    public List<String> cookingTools;
    public List<Recipe> relatedRecipes;
    public List<Recipe> recommendedRecipes;
}
