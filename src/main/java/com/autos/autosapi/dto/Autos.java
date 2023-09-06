package com.autos.autosapi.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "auto")
@Entity(name = "auto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Autos {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String marca;
        private String kilometraje;
        private String usado;

        public Autos(DTOautos autos) {
                this.marca = autos.marca();
                this.kilometraje = autos.kilometraje();
                this.usado = autos.usado();
        }



        public void actualizarDatos(ModificarAutos modificarAutos ){
                if (modificarAutos.kilometraje() != null || modificarAutos.usado() != null){
                        this.kilometraje = modificarAutos.kilometraje();
                        this.usado = modificarAutos.usado();
                }
        }
}


