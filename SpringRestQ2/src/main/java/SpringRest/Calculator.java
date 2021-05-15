package SpringRest;

import java.util.List;

@Component
public class Calculator {
	Logger logger = LoggerFactory.getLogger(getClass());

	 private List<Application> operations;

	 public Calculator(List<Application> operations) {
	  super();
	  this.operations = operations;
	 }

	 public void calculate(long a, long b, char operator) {

	  for (Application o : operations) {
	   if (o.valid(operator)) {

	    long output = o.apply(a, b);
	    logger.info(a + " " + operator + " " + b + " = " + output);
	    return;
	   }
	  }
	  throw new IllegalArgumentException("Illegal operation for operator : " + operator);
	 }

}
