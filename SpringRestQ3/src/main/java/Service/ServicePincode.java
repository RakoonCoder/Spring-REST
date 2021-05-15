package Service;

import java.util.ArrayList;
import java.util.List;

import Entity.Pincode;

public class ServicePincode implements ServicePin {
		
		List<Pincode> pin;

		public ServicePincode() {
			pin = new ArrayList<Pincode>();
			pin.add(new Pincode(263149,"UK","Jawahar Nagar","India"));
			pin.add(new Pincode(263145,"UK","Pantnagar","India"));
			pin.add(new Pincode(263139,"UK","Haldwani","India"));
			pin.add(new Pincode(263666,"UK","Haridwar","India"));
			pin.add(new Pincode(263108,"UK","Dehradun","India"));
			pin.add(new Pincode(110049,"Delhi","Karol Bagh","India"));
			pin.add(new Pincode(110069,"Delhi","Patel Nagar","India"));
			pin.add(new Pincode(113149,"MH","Pune","India"));
			pin.add(new Pincode(269949,"RJ","Jaipur","India"));
			pin.add(new Pincode(999149,"MP","Bhopal","India"));
			pin.add(new Pincode(163149,"PB","Ludhiyana","India"));		
		}
		
		public Pincode getDetails(int pincode) {
			for(Pincode p : pin)
				{
				if(p.getPin()==pincode)
					{
					System.out.println(p);
				    return p;
				    }
				}
			return null;
			
		}

}
