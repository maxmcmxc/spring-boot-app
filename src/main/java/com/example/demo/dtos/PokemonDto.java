package com.example.demo.dtos;


import com.example.demo.model.PokemonType;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@Builder
public class PokemonDto {

    @NonNull
    private final PokemonType type;
    @NonNull
    private final String name;

}
