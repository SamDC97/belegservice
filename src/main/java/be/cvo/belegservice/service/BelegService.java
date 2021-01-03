package be.cvo.belegservice.service;

import be.cvo.belegservice.domain.BelegEntity;
import be.cvo.belegservice.domain.repository.BelegRepository;
import be.cvo.belegservice.service.dto.Beleg;
import be.cvo.belegservice.service.mapper.BelegMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class BelegService {

    @Autowired
    private BelegRepository belegRepository;
    @Autowired
    private BelegMapper belegMapper;

    public void addBeleg(Beleg beleg){belegRepository.save(belegMapper.toEntity(beleg));}

    public List<Beleg> getAll(){
        return StreamSupport
                .stream(belegRepository.findAll().spliterator(), false)
                .map( b -> belegMapper.toDTO(b))
                .collect(Collectors.toList());
    }

    public Beleg getById(Integer id){
        Optional<BelegEntity> belegEntityOptional = belegRepository.findById(id);
        if (belegEntityOptional.isPresent()){
            return belegMapper.toDTO(belegEntityOptional.get());
        }
        return null;
    }
}
