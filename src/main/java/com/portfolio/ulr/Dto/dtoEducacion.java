package com.portfolio.ulr.Dto;

import jakarta.validation.constraints.NotBlank;

public class dtoEducacion {
    
    @NotBlank
    private String nombreE;
    @NotBlank
    private String institucionE;
    @NotBlank
    private String fechaE;
    @NotBlank
    private String descripcionE;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreE, String institucionE, String fechaE, String descripcionE) {
        this.nombreE = nombreE;
        this.institucionE = institucionE;
        this.fechaE = fechaE;
        this.descripcionE = descripcionE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getInstitucionE() {
        return institucionE;
    }

    public void setInstitucionE(String institucionE) {
        this.institucionE = institucionE;
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
