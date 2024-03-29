package com.portfolio.backend.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "educacion",
       uniqueConstraints = {
           @UniqueConstraint(columnNames = "idEducacion")
       })
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idEducacion;
    
    @NotBlank
    @NotNull
    @Size(max = 40)
    private String institucion;
   
    @NotBlank
    @NotNull
    @Size(max = 40)
    private String titulo;
    
    @NotBlank
    @NotNull
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private String fechaInicio;
    
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private String fechaFin;
    
    private int porcentaje_carrera;
    
    @NotNull
    @Size(max = 254)
    private String linkimagen;
    
    @ManyToOne
    @JoinColumn(name ="idPersona", insertable = true,
                 updatable = true, referencedColumnName = "idPersona")
    private Persona persona;
}

