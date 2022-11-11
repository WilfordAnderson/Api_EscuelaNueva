
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.ApoderadoEntity;


public interface ApoderadoService {
    //Función que te permita mostrar todos los datos
    List<ApoderadoEntity> findAll();
    
    //Función que permita mostrar todos los datos habilitados
    List<ApoderadoEntity> findAllCustom();
    
    //Función para poder buscar por codigo
    Optional<ApoderadoEntity> findById(Long id);
    
    //Función para registrar datos
    ApoderadoEntity add(ApoderadoEntity d);
    
     //Función para actualizar datos
    ApoderadoEntity update(ApoderadoEntity d);
    
     //Función para eliminar datos
    ApoderadoEntity delete(ApoderadoEntity d);
}
