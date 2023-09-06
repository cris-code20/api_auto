package com.autos.autosapi.dto;

import jakarta.validation.constraints.NotBlank;

public record DTOautos(@NotBlank String marca,@NotBlank String kilometraje,@NotBlank String usado) {
}
