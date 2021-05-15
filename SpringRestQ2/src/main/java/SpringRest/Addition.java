package SpringRest;

import org.springframework.stereotype.Component;

@Component
public class Addition implements Application {

		 public long apply(long a, long b) {

		  return a + b;
		 }

		 public boolean valid(char operator) {

		  return '+' == operator;
		 }


}
