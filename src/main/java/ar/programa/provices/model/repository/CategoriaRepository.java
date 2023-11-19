package ar.programa.provices.model.repository;

import ar.programa.provices.model.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
/**
  @author pBarzaghi
 */
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {
}
