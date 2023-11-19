package ar.programa.provices.services.impl;

import ar.programa.provices.model.entity.Perfil;
import ar.programa.provices.model.repository.PerfilRepository;
import ar.programa.provices.services.crud.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/***
 *
 * @author pbarzaghi
 */
@Service
public class PerfilServiceImpl implements PerfilService {
    @Autowired
    PerfilRepository perfilRepository;
    @Override
    public List<Perfil> findAll() throws Exception {
        return perfilRepository.findAll();
    }

    @Override
    public Perfil save(Perfil perfil) throws Exception {
        return perfilRepository.save(perfil);
    }

    @Override
    public Perfil update(Perfil perfil) throws Exception {
        return perfilRepository.save(perfil);
    }

    @Override
    public Optional<Perfil> findById(Integer integer) throws Exception {
        return perfilRepository.findById(integer);
    }

    @Override
    public void deleteById(Integer integer) throws Exception {
        perfilRepository.deleteById(integer);
    }

    @Override
    public void deleteAll() throws Exception {
        perfilRepository.deleteAll();
    }
}
