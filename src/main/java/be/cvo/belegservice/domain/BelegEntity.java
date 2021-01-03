package be.cvo.belegservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class BelegEntity {

    @Id
    private Integer id;
    private String name;
    private Double price;
    private String description;
}
