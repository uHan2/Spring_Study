package kr.co.first.gotoeat.domain;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class RestaurantRepositoryImplTest
{
    @Test
    public void save()
    {
        RestaurantRepository repository = new RestaurantRepositoryImpl();

        int oldCount = repository.findAll().size();

        Restaurant restaurant = new Restaurant("BeRyong", "Busan");
        repository.save(restaurant);

        assertThat(restaurant.getId(), is(1234));

        int newCount = repository.findAll().size();

        assertThat(newCount - oldCount, is(1));

    }
}