package ar.programa.provices.model.repository;

import ar.programa.provices.model.entity.Prestador;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 @author pBarzaghi
 */
public interface PrestadorRepository extends JpaRepository<Prestador,Integer> {
}
