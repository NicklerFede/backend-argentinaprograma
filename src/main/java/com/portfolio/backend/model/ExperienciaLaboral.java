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
@Table(name = "experienciaslaborales",
       uniqueConstraints = {
           @UniqueConstraint(columnNames = "idExperienciaLaboral")
       })
public class ExperienciaLaboral {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idExperienciaLaboral;
    
    @NotBlank
    @NotNull
    @Size(max = 50)
    private String empresa;
   
    @NotBlank
    @NotNull
    
    private String puesto;
    
    @NotBlank
    @NotNull
    @Size(max = 40)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private String fechaInicio;
    
    
    @Size(max = 40)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private String fechaFin;
    
    @NotBlank
    @NotNull
    @Size(max = 255)
    private String descripcionTareas;
    
    
    @ManyToOne
    @JoinColumn(name ="idPersona", insertable = true,
                 updatable = true, referencedColumnName = "idPersona")
    private Persona persona;
}
