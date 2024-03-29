package com.portfolio.ulr.Dto;

import jakarta.validation.constraints.NotBlank;

public class dtoHyS {
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;
    
    //Constructor
    
    public dtoHyS() {
    }

    public dtoHyS(String nombre, int porcentaje) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

    //Getters abd Setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    
}
