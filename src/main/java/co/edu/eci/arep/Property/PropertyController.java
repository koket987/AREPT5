package co.edu.eci.arep.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/properties")
public class PropertyController {
    @Autowired
    private PropertyRepository repository;

    @GetMapping
    public List<Property> getAllProperties() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Property getPropertyById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Property not found"));
    }

    @PostMapping
    public Property createProperty(@RequestBody Property property) {
        return repository.save(property);
    }

    @PutMapping("/{id}")
    public Property updateProperty(@PathVariable Long id, @RequestBody Property propertyDetails) {
        Property property = repository.findById(id).orElseThrow(() -> new RuntimeException("Property not found"));
        property.setAddress(propertyDetails.getAddress());
        property.setPrice(propertyDetails.getPrice());
        property.setSize(propertyDetails.getSize());
        property.setDescription(propertyDetails.getDescription());
        return repository.save(property);
    }

    @DeleteMapping("/{id}")
    public void deleteProperty(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
