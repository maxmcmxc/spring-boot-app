package com.example.demo.controllers;
import com.example.demo.model.Pokemon;
import io.swagger.annotations.ApiOperation;
import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/pokemon")
@Log
public class DemoController {

    @PostMapping
    @ApiOperation(value = "create a pokemon", notes = "those are the notes")
    public ResponseEntity<Pokemon> postPokemon(){
        log.info("Receiving post request on /api/v1/pokemon");
        return new ResponseEntity<>(Pokemon.builder().build(), HttpStatus.OK);
    }

}
