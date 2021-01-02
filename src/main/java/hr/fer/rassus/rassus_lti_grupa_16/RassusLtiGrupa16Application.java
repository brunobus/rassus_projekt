package hr.fer.rassus.rassus_lti_grupa_16;

import java.io.FileReader;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.beans.factory.annotation.Autowired;



@SpringBootApplication
public class RassusLtiGrupa16Application implements CommandLineRunner{
	
	@Autowired
	private SensorRepository repo;
	
	
	public static void main(String[] args) {
		SpringApplication.run(RassusLtiGrupa16Application.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		List<SensorReading> readings =new CsvToBeanBuilder<SensorReading>
		(new FileReader("mjerenja.csv")).withType(SensorReading.class).
		build().parse();
		
		long l=0;
		for(SensorReading reading : readings)
		{
			reading.setId(l++);
		}
		//ovdje sva mjerenja iz csv datoteke spremim u h2 bazu koja se nalazi na localhost:8080/h2-console
		repo.saveAll(readings);
		
		//ovdje samo ispisem u konzolu sva mjerenja
		readings.stream().forEach(System.out::println);
}
}
