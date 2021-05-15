package Service;

import org.springframework.stereotype.Service;

import Entity.Pincode;

@Service
public interface ServicePin {

	public Pincode getDetails(int pincode);

}