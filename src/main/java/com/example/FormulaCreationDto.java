package com.example;

import io.micronaut.core.annotation.Introspected;
import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;

import java.util.Optional;

@Introspected
@Data
@Valid
public class FormulaCreationDto {
    @NotNull
    private final String column1;

    @NotNull
    private final String column2;

    private final boolean percent;

    @NotNull
    private final String name;

    @Nullable
    private final String description;
    /**
     * @param percent (boolean) whether the formula expresses a percentage
     */
    public FormulaCreationDto(
            @NotNull @NotBlank @Size(
                    min = 3,
                    max = 250
            ) String name, @Nullable String description,
            String column1, String column2,
            Optional<@NotNull Boolean> percent
    ) {
        this.column1 = column1;
        this.column2 = column2;
        this.percent = percent.orElse(false);
        this.name = name;
        this.description = description;
    }
}
