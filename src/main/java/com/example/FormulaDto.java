package com.example;

import io.micronaut.core.annotation.Introspected;
import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Max;
import lombok.Getter;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Introspected
@Getter
public class FormulaDto extends FormulaCreationDto {

	@Max(50)
	private final List<String> otherColumns;
	public FormulaDto(
		String name,
		@Nullable String description,
		String column1,
		String column2,
		List<String> otherColumns,
		Boolean percent
	) {
        super(name, description, column1, column2, Optional.of(percent));
        this.otherColumns = Collections.unmodifiableList(otherColumns);
	}
}
