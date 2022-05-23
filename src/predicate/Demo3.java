package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	String name;
	int sal;
	int exp;
	
	Employee(String name,int sal,int exp){
		this.name=name;
		this.sal=sal;
		this.exp=exp;
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + ", exp=" + exp + "]";
	}
	
	
	
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee("sai",10000,10);
		System.out.println(e);
		
		Predicate<Employee> pr=e1->(e1.sal>4000);
		System.out.println(pr.test(e));
		
		List<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("jay",11000,6));
		al.add(new Employee("say",12000,7));
		al.add(new Employee("iay",13000,8));
		
		Predicate<Employee> pr2=e2->e2.sal>10000;
		
		for(Employee e2:al) {
			if(pr.test(e2)) {
				System.out.println(e2);
			}
		}
		

	}

}













