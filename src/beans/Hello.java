package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class Hello {

	@Autowired
	private Bike bike;
	
	private String helloProperty = "default";

	@Lookup
	public Bike getBike() {
		return null;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	public String getHelloProperty() {
		return helloProperty;
	}

	public void setHelloProperty(String helloProperty) {
		this.helloProperty = helloProperty;
	}

}
