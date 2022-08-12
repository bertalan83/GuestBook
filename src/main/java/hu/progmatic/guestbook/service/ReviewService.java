package hu.progmatic.guestbook.service;

import hu.progmatic.guestbook.model.Review;
import hu.progmatic.guestbook.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ReviewService {

    private ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> getAll() {
        return new ArrayList<>((Collection) reviewRepository.findAll());
    }
}
