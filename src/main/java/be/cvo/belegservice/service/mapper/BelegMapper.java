package be.cvo.belegservice.service.mapper;

import be.cvo.belegservice.domain.BelegEntity;
import be.cvo.belegservice.service.dto.Beleg;
import org.springframework.stereotype.Component;

@Component
public class BelegMapper {

    public BelegEntity toEntity(Beleg beleg){
        return new BelegEntity(beleg.getId(), beleg.getName(), beleg.getPrice(), beleg.getDescription());
    }

    public Beleg toDTO(BelegEntity belegEntity){
        return new Beleg(belegEntity.getId(), belegEntity.getName(), belegEntity.getPrice(), belegEntity.getDescription());
    }
}
