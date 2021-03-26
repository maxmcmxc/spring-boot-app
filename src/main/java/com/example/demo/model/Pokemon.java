package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
@Data
public class Pokemon {

    private PokemonType type;
    private String name;

}
