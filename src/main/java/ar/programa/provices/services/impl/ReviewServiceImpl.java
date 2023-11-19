package ar.programa.provices.services.impl;

import ar.programa.provices.model.entity.Review;
import ar.programa.provices.model.repository.ReviewRepository;
import ar.programa.provices.services.crud.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author pbarzaghi
  */
@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
    @Override
    public List<Review> findAll() throws Exception {
        return reviewRepository.findAll();
    }

    @Override
    public Review save(Review review) throws Exception {
        return reviewRepository.save(review);
    }

    @Override
    public Review update(Review review) throws Exception {
        return reviewRepository.save(review);
    }

    @Override
    public Optional<Review> findById(Integer integer) throws Exception {
        return reviewRepository.findById(integer);
    }

    @Override
    public void deleteById(Integer integer) throws Exception {
        reviewRepository.deleteById(integer);
    }

    @Override
    public void deleteAll() throws Exception {
        reviewRepository.deleteAll();
    }
}
