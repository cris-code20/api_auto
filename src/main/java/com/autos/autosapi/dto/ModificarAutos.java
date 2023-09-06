package com.autos.autosapi.dto;

import jakarta.validation.constraints.NotNull;

public record ModificarAutos(@NotNull Long id, String kilometraje, String usado) {



}
