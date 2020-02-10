package kr.co.first.gotoeat.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MenuItem
{
    @Id
    @GeneratedValue
    private long id;

    private long restaurantId;

    private String name;
}
