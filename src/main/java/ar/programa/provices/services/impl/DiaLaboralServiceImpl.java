package ar.programa.provices.services.impl;

import ar.programa.provices.model.entity.DiaLaboral;
import ar.programa.provices.model.repository.DiaLaboralRepository;
import ar.programa.provices.services.crud.DiaLaboralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
* @author pbarzaghi
*/
@Service
public class DiaLaboralServiceImpl implements DiaLaboralService {
    @Autowired
    DiaLaboralRepository diaLaboralRepository;
    @Override
    public List<DiaLaboral> findAll() throws Exception {
        return diaLaboralRepository.findAll();
    }

    @Override
    public DiaLaboral save(DiaLaboral diaLaboral) throws Exception {
        return diaLaboralRepository.save(diaLaboral);
    }

    @Override
    public DiaLaboral update(DiaLaboral diaLaboral) throws Exception {
        return diaLaboralRepository.save(diaLaboral);
    }

    @Override
    public Optional<DiaLaboral> findById(Integer integer) throws Exception {
        return diaLaboralRepository.findById(integer);
    }

    @Override
    public void deleteById(Integer integer) throws Exception {
        diaLaboralRepository.deleteById(integer);
    }

    @Override
    public void deleteAll() throws Exception {
        diaLaboralRepository.deleteAll();
    }
}
