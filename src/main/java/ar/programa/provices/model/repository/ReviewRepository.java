package ar.programa.provices.model.repository;

import ar.programa.provices.model.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 @author pBarzaghi
 */
public interface ReviewRepository  extends JpaRepository<Review,Integer>{
}
