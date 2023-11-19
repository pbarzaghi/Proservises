package ar.programa.provices.model.repository;

import ar.programa.provices.model.entity.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 @author pBarzaghi
 */
public interface TareaRepository extends JpaRepository<Tarea,Integer> {
}
