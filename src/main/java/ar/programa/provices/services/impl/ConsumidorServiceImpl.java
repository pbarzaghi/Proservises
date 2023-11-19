package ar.programa.provices.services.impl;

import ar.programa.provices.model.entity.Consumidor;
import ar.programa.provices.model.repository.ConsumidorRepository;
import ar.programa.provices.services.crud.ConsumidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/***
 *
 * @author pbarzaghi
 */
@Service
public class ConsumidorServiceImpl implements ConsumidorService {
    @Autowired
    ConsumidorRepository consumidorRepository;
    @Override
    public List<Consumidor> findAll() throws Exception {
        return consumidorRepository.findAll();
    }

    @Override
    public Consumidor save(Consumidor consumidor) throws Exception {
        return consumidorRepository.save(consumidor);
    }

    @Override
    public Consumidor update(Consumidor consumidor) throws Exception {
        return consumidorRepository.save(consumidor);
    }

    @Override
    public Optional<Consumidor> findById(Integer integer) throws Exception {
        return consumidorRepository.findById(integer);
    }

    @Override
    public void deleteById(Integer integer) throws Exception {
        consumidorRepository.deleteById(integer);
    }

    @Override
    public void deleteAll() throws Exception {
        consumidorRepository.deleteAll();
    }
}
