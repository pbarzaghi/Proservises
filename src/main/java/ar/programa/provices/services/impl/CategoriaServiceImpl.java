package ar.programa.provices.services.impl;

import ar.programa.provices.model.entity.Categoria;
import ar.programa.provices.model.repository.CategoriaRepository;
import ar.programa.provices.services.crud.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/***
 *
 * @author pbarzaghi
 */
@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    CategoriaRepository categoriaRepository;
    @Override
    public List<Categoria> findAll() throws Exception {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria save(Categoria categoria) throws Exception {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria update(Categoria categoria) throws Exception {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Optional<Categoria> findById(Integer integer) throws Exception {
        return categoriaRepository.findById(integer);
    }

    @Override
    public void deleteById(Integer integer) throws Exception {
        categoriaRepository.deleteById(integer);
    }

    @Override
    public void deleteAll() throws Exception {
        categoriaRepository.deleteAll();
    }
}
