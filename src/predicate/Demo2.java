package predicate;

import java.util.function.Predicate;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> pr=s->(s.length()>5);
		System.out.println(pr.test("sai1"));
	}

}
