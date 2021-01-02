package hr.fer.rassus.rassus_lti_grupa_16;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class SensorReading {

	//svi atributi iz baze
	@Id
	private Long Id;
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	private String temperature, humidity, pressure, co, no2, so2;

	public SensorReading() {
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public String getCo() {
		return co;
	}

	public void setCo(String co) {
		this.co = co;
	}

	public String getNo2() {
		return no2;
	}

	public void setNo2(String no2) {
		this.no2 = no2;
	}

	public String getSo2() {
		return so2;
	}

	public void setSo2(String so2) {
		this.so2 = so2;
	}

	@Override
	public String toString() {
		return "SensorReading [Id=" + Id + ", temperature=" + temperature + ", humidity=" + humidity + ", pressure="
				+ pressure + ", co=" + co + ", no2=" + no2 + ", so2=" + so2 + "]";
	}


	
	
	
}
