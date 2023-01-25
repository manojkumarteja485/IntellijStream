

import java.util.Arrays;
import java.util.List;

public class PraticeStreamOperations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi manoj");
		List<Employee> empList=Arrays.asList(new Employee(20, 1234L, Arrays.asList("manoj@gmail.com","kumar@gmail.com"), "dev"),
				new Employee(45, 345L, Arrays.asList("manoj12@gmail.com","kumar12@gmail.com"), "dev"),
				new Employee(60, 456L, Arrays.asList("manoj23@gmail.com","kumar23@gmail.com"), "qa"));
		empList.forEach(System.out :: println);

	}

}
