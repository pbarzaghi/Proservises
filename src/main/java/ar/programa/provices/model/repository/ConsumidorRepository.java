package ar.programa.provices.model.repository;

import ar.programa.provices.model.entity.Consumidor;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 @author pBarzaghi
 */
public interface ConsumidorRepository extends JpaRepository<Consumidor,Integer > {
}
