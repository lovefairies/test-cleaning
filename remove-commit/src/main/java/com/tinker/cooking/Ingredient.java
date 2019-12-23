package com.tinker.cooking;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Ingredient {
    private String name;
    private Measurement weigh;
    private String unit;

}
