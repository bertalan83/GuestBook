package hu.progmatic.guestbook.repository;

import hu.progmatic.guestbook.model.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {

    List<Review> findByFirstNameContaining(String firstName);
    List<Review> findByLastNameContaining(String lastName);



}
