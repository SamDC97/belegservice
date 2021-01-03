package be.cvo.belegservice.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Beleg {

    private Integer id;
    private String name;
    private Double price;
    private String description;
}
