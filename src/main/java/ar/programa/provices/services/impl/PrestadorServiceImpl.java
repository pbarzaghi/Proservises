package ar.programa.provices.services.impl;

import ar.programa.provices.model.entity.Prestador;
import ar.programa.provices.model.repository.PrestadorRepository;
import ar.programa.provices.services.crud.PrestadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author pbarzaghi
 */
@Service
public class PrestadorServiceImpl implements PrestadorService {
    @Autowired
    PrestadorRepository prestadorRepository;
    @Override
    public List<Prestador> findAll() throws Exception {
        return prestadorRepository.findAll();
    }

    @Override
    public Prestador save(Prestador prestador) throws Exception {
        return prestadorRepository.save(prestador);
    }

    @Override
    public Prestador update(Prestador prestador) throws Exception {
        return prestadorRepository.save(prestador);
    }

    @Override
    public Optional<Prestador> findById(Integer integer) throws Exception {
        return prestadorRepository.findById(integer);
    }

    @Override
    public void deleteById(Integer integer) throws Exception {
        prestadorRepository.deleteById(integer);
    }

    @Override
    public void deleteAll() throws Exception {
        prestadorRepository.deleteAll();
    }
}
