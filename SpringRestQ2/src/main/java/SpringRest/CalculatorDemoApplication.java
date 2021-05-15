package SpringRest;

import java.util.List;

@SpringBootApplication
public class CalculatorDemoApplication {
	public static void main(String[] args) {
		  SpringApplication.run(CalculatorDemoApplication.class, args);

		 }

		 //@Bean("cal")
		 @Bean
		 public Calculator calculator(List operations) {

		  return new Calculator(operations);
		 }

		 @Bean
		 public ApplicationRunner applicationRunner(Calculator calculator) {

		  return args -> {

		   calculator.calculate(10, 20, '+');
		   calculator.calculate(100, 20, '/');
		   calculator.calculate(10, 3, '*');
		   //calculator.calculate(10, 3, '-');
		  };

		 }

}
