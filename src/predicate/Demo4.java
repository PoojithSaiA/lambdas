package predicate;

import java.util.function.Predicate;

public class Demo4 {
	public static void main(String[] args) {
		int a[]= {2,3,5,7,8,10,20,30,35,55};
		
		Predicate<Integer> pr=i->i%2==0;
		Predicate<Integer> pr2=i->i>10;
		for(int res:a) {
			if(pr.and(pr2).test(res)) {
				System.out.println(res);
			}
		}
	}

}
