package ar.programa.provices.services.impl;

import ar.programa.provices.model.entity.Contrato;
import ar.programa.provices.model.repository.ContratoRepository;
import ar.programa.provices.services.crud.ContratoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/***
 *
 * @author pbarzaghi
 */
@Service
public class ContratoServiceImpl implements ContratoService {
    @Autowired
    ContratoRepository contratoRepository;
    @Override
    public List<Contrato> findAll() throws Exception {
        return contratoRepository.findAll();
    }

    @Override
    public Contrato save(Contrato contrato) throws Exception {
        return contratoRepository.save(contrato);
    }

    @Override
    public Contrato update(Contrato contrato) throws Exception {
        return update(contrato);
    }

    @Override
    public Optional<Contrato> findById(Integer integer) throws Exception {
        return contratoRepository.findById(integer);
    }

    @Override
    public void deleteById(Integer integer) throws Exception {
        contratoRepository.deleteById(integer);
    }

    @Override
    public void deleteAll() throws Exception {
        contratoRepository.deleteAll();
    }
}
