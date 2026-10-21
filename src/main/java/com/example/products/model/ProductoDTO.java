package com.example.products.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class ProductoDTO {
    @Min(1)
    @Max(100)
    @NotNull 
    Double porcentage;

    public Double getPorcentage() {
        return porcentage;
    }
    
    public ProductoDTO() {
    }

    public void setPorcentage(Double porcentage) {
        this.porcentage = porcentage;
    }

    
}
