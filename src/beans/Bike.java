package beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Bike {
	private String bikeProperty = "default";

	public String getBikeProperty() {
		return bikeProperty;
	}

	public void setBikeProperty(String bikeProperty) {
		this.bikeProperty = bikeProperty;
	}
	
}
