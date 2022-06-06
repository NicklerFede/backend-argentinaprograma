package com.portfolio.backend.model;

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
@Table(name = "proyectos",
       uniqueConstraints = {
           @UniqueConstraint(columnNames = "idProyecto")
       })
public class Proyecto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idProyecto;
    
    @NotBlank
    @NotNull
    @Size(max = 40)
    private String proyecto;
   
    
    @NotBlank
    @NotNull
    @Size(max = 40)
    private String tecnologia;
    
 
    @Size(max = 254)
    private String linkrepositorio;
    
     @ManyToOne
    @JoinColumn(name ="idPersona", insertable = true,
                 updatable = true, referencedColumnName = "idPersona")
    private Persona persona;
}

