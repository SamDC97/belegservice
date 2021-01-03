package be.cvo.belegservice.web;

import be.cvo.belegservice.service.BelegService;
import be.cvo.belegservice.service.dto.Beleg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BelegResource {

    @Autowired
    private BelegService belegService;

    @PostMapping("/add-beleg")
    private void addBeleg(@RequestBody Beleg beleg){belegService.addBeleg(beleg);}

    @GetMapping("/beleg")
    public ResponseEntity<List<Beleg>> getAll(){
        List<Beleg> belegList = belegService.getAll();
        return new ResponseEntity<>(belegList, HttpStatus.OK);
    }

    @GetMapping("/beleg/{id}")
    public ResponseEntity<Beleg> getById(@PathVariable Integer id) {
        Beleg beleg = belegService.getById(id);
        return new ResponseEntity<>(beleg, HttpStatus.OK);
    }

}
