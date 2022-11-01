
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


 

@RestController

public class AngleController              {
	
	private static final Logger log = LoggerFactory.getLogger(AngleController.class);

	

	@GetMapping("/getAngleById/{id}")
	public Optional<Angle> getAngleById(@PathVariable("id") Long id) {
		return service.getAngleById(id);
	}

	
	@GetMapping("/allAngleRecord")
	public Iterable<Angle> getAllAngle() {
		return service.getAllAngle();
	}

	
	@PostMapping("/addAngle")
	public @ResponseBody String addAngle(@RequestBody Angle angle) {
		service.addAngle(angle);
		return " saved ";

	}

	

	@DeleteMapping("/deleteAngleById/{id}")
	public void deleteAngle(@PathVariable("id") Long id) {
		service.deleteAngleByid(id);

	}

	

	@PutMapping("/updateAngle/{id}")
	public Angle updateAngle(@RequestBody Angle newAngle, @PathVariable("id") Long id) {
		log.info("Updating the  record " + newAngle);
		try {
		return service.updateAngle(newAngle, id);
		
		 }catch (Exception ex) {
			log.error("new Angle not saved " + newAngle );
		}
        return null;
	}

}
