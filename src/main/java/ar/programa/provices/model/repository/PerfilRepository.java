package ar.programa.provices.model.repository;

import ar.programa.provices.model.entity.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 @author pBarzaghi
 */
public interface PerfilRepository extends JpaRepository<Perfil,Integer> {
}
