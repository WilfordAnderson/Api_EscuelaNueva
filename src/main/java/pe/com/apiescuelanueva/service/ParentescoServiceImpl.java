
 
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.ParentescoEntity;
import pe.com.apiescuelanueva.repository.ParentescoRepository;

@Service
public class ParentescoServiceImpl implements ParentescoService {

    @Autowired
    private ParentescoRepository parentescorepository;
    @Override
    public List<ParentescoEntity> findAll() {
        return parentescorepository.findAll();
    }

    @Override
    public List<ParentescoEntity> findAllCustom() {
        return parentescorepository.findAllCustom();
    }

    @Override
    public Optional<ParentescoEntity> findById(Long id) {
        return parentescorepository.findById(id);
    }

    @Override
    public ParentescoEntity add(ParentescoEntity d) {
        return parentescorepository.save(d);
    }

    @Override
    public ParentescoEntity update(ParentescoEntity d) {
        ParentescoEntity objparentesco =parentescorepository.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objparentesco);
        return parentescorepository.save(objparentesco);
        
      
    }

    @Override
    public ParentescoEntity delete(ParentescoEntity d) {
        ParentescoEntity objparentesco=parentescorepository.getById(d.getCodigo());
        objparentesco.setEstado(false);
        return parentescorepository.save(objparentesco);
        
      }
    
}
