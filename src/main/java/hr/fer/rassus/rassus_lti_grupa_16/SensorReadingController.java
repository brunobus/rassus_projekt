package hr.fer.rassus.rassus_lti_grupa_16;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorReadingController {
	private SensorRepository repo;
	
	public SensorReadingController(SensorRepository repo)
	{
		this.repo=repo;
	}
	@GetMapping("/current-reading")
	public SensorReading getCurrentReading()
	{
		LocalTime time=LocalTime.now();
		long id=time.getHour()*4 + time.getMinute()/15;
		return repo.findById(id).get();
	}
}
