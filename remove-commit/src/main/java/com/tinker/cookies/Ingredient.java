package com.tinker.cookies;

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
    private Unit weigh;
    private String unit;

}
