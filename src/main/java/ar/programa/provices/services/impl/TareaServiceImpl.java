package ar.programa.provices.services.impl;

import ar.programa.provices.model.entity.Tarea;
import ar.programa.provices.model.repository.TareaRepository;
import ar.programa.provices.services.crud.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**
 *
 * @author pbarzaghi
 */
@Service
public  class TareaServiceImpl implements TareaService {
    @Autowired
    private TareaRepository tareaRepository;
    @Override
    public List<Tarea> findAll() throws Exception {
        return tareaRepository.findAll();
    }

    @Override
    public Tarea save(Tarea tarea) throws Exception {
        return tareaRepository.save(tarea);
    }

    @Override
    public Tarea update(Tarea tarea) throws Exception {
        return tareaRepository.save(tarea);
    }

    @Override
    public Optional<Tarea> findById(Integer integer) throws Exception {
        return tareaRepository.findById(integer);
    }

    @Override
    public void deleteById(Integer integer) throws Exception {
        tareaRepository.deleteById(integer);
    }

    @Override
    public void deleteAll() throws Exception {
        tareaRepository.deleteAll();
    }
}
