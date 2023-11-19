package ar.programa.provices.services.impl;

import ar.programa.provices.model.entity.FotoTrabajoRealizado;
import ar.programa.provices.model.repository.FotoTrabajoRealizadoRepository;
import ar.programa.provices.services.crud.FotoTrabajoRealizadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/***
 *
 * @author pbarzaghi
 */
@Service
public class FotoTrabajoRealizadoServiceImpl implements FotoTrabajoRealizadoService {
    @Autowired
    FotoTrabajoRealizadoRepository fotoTrabajoRealizadoRepository;
    @Override
    public List<FotoTrabajoRealizado> findAll() throws Exception {
        return null;
    }

    @Override
    public FotoTrabajoRealizado save(FotoTrabajoRealizado fotoTrabajoRealizado) throws Exception {
        return null;
    }

    @Override
    public FotoTrabajoRealizado update(FotoTrabajoRealizado fotoTrabajoRealizado) throws Exception {
        return null;
    }

    @Override
    public Optional<FotoTrabajoRealizado> findById(Integer integer) throws Exception {
        return Optional.empty();
    }

    @Override
    public void deleteById(Integer integer) throws Exception {

    }

    @Override
    public void deleteAll() throws Exception {

    }
}
