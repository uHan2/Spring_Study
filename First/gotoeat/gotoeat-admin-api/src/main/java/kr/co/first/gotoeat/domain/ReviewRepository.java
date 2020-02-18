package kr.co.first.gotoeat.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepository extends CrudRepository<Review, Long>
{
    List<Review> findAllByRestaurantId(long restaurantId);

    Review save(Review review);
}