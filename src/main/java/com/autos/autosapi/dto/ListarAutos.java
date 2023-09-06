package com.autos.autosapi.dto;

public record ListarAutos(Long id, String marca, String kilometraje, String usado) {

        public ListarAutos(Autos autos){
            this(autos.getId(), autos.getMarca(), autos.getKilometraje(), autos.getUsado());
        }

}
