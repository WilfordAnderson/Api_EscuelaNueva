
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.ParentescoEntity;


public interface ParentescoService {
    //Función que te permita mostrar todos los datos
    List<ParentescoEntity> findAll();
    
    //Función que permita mostrar todos los datos habilitados
    List<ParentescoEntity> findAllCustom();
    
    //Función para poder buscar por codigo
    Optional<ParentescoEntity> findById(Long id);
    
    //Función para registrar datos
    ParentescoEntity add(ParentescoEntity d);
    
     //Función para actualizar datos
    ParentescoEntity update(ParentescoEntity d);
    
     //Función para eliminar datos
    ParentescoEntity delete(ParentescoEntity d);
}
