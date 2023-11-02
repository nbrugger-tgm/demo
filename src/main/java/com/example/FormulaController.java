package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import jakarta.validation.Valid;

@Controller("/formula")
public class FormulaController {

    @Put
    public void createFormula(@Valid FormulaCreationDto formula) {
        System.out.println(formula);
    }
    @Get("/{id}")
    public FormulaDto getFormula(String id) {
        return new FormulaDto("name", "description", "column1", "column2", java.util.Collections.emptyList(), false);
    }

    @Post
    public void updateFormula(@Valid FormulaDto formula) {
        System.out.println(formula);
    }

}
