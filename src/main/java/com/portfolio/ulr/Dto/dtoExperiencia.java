package com.portfolio.ulr.Dto;

import jakarta.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String  nombreE;
    @NotBlank
    private String empresaE;
    @NotBlank
    private String fechaE;
    @NotBlank
    private String descripcionE;
    
    //Constructor

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String empresaE, String fechaE, String descripcionE) {
        this.nombreE = nombreE;
        this.empresaE = empresaE;
        this.fechaE = fechaE;
        this.descripcionE = descripcionE;
    }
    
    //Getters abd Setters

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getEmpresaE() {
        return empresaE;
    }

    public void setEmpresaE(String empresaE) {
        this.empresaE = empresaE;
    }

    public String getFechaE() {
        return fechaE;
    }

    public void setFechaE(String fechaE) {
        this.fechaE = fechaE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
}
