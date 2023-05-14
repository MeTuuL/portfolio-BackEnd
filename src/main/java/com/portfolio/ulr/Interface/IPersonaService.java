/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.ulr.Interface;

import com.portfolio.ulr.Entity.Persona;
import java.util.List;


public interface IPersonaService {
   
   //Trear una lista de Personas 
   public List<Persona> getPersona();
   
   //Guardar un objeto de tipo persona
   public void savePersona(Persona persona);
   
   //Eliminar un objeto pero lo buscamos por ID
   public void deletePersona(Long id);
   
   //Buscar una persona por ID
   public Persona findPersona(Long id);
    
}
