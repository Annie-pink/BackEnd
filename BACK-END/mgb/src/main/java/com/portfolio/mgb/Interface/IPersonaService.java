
package com.portfolio.mgb.Interface;

import com.portfolio.mgb.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer persona
    public List<Persona> getPersona();
    
    //guardar objeto tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto que se busca por id
    public void deletePersona(Long id);
    
    //Buscar persona por id
    public Persona findPersona(Long id);
}
