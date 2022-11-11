
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.ApoderadoEntity;
import pe.com.apiescuelanueva.repository.ApoderadoRepository;


@Service
public class ApoderadoServiceImpl implements ApoderadoService{
    
    @Autowired
    private ApoderadoRepository apoderadorepository;
    
    @Override
    public List<ApoderadoEntity> findAll() {
        return apoderadorepository.findAll();
    }

    @Override
    public List<ApoderadoEntity> findAllCustom() {
        return apoderadorepository.findAllCustom();
    }

    @Override
    public Optional<ApoderadoEntity> findById(Long id) {
        return apoderadorepository.findById(id);
    }

    @Override
    public ApoderadoEntity add(ApoderadoEntity d) {
        return apoderadorepository.save(d);
     }

    @Override
    public ApoderadoEntity update(ApoderadoEntity d) {
        ApoderadoEntity objapoderado = apoderadorepository.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objapoderado);
        return apoderadorepository.save(objapoderado);
    }

    @Override
    public ApoderadoEntity delete(ApoderadoEntity d) {
        ApoderadoEntity objapoderado = apoderadorepository.getById(d.getCodigo());
        objapoderado.setEstado(false);
        return apoderadorepository.save(objapoderado);
    }
    
}
