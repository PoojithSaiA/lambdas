package predicate;

import java.util.function.Predicate;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> pr=i->i>10;
		System.out.println(pr.test(11));
		System.out.println(pr.test(9));

	}

}
