package ar.programa.provices.model.repository;

import ar.programa.provices.model.entity.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 @author pBarzaghi
 */
public interface ContratoRepository extends JpaRepository<Contrato,Integer> {
}
