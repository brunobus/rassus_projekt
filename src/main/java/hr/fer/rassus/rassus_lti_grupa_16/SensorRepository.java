package hr.fer.rassus.rassus_lti_grupa_16;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<SensorReading, Long>{
	// javno sucelje JPaRepository preko kojega dohvcam sva mjerenja iz baze preko ida
	

}
