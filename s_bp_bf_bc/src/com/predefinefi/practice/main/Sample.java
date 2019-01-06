package com.predefinefi.practice.main;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

import com.predefinefi.practice.entity.Employee;

public interface Sample {
	public static void main(String[] args) {
		
		
		/*Supplier<Date> s=()->new Date();
		System.out.println("The Today's Date is  = "+s.get());*/
		
		/*below logic is for generating the otp*/
		/*Supplier<String> s=()->{
			String otp="";
			for(int i=0;i<6;i++) {
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		for(int i=0;i<15;i++) {
			System.out.println(s.get());
		}*/
		
		/*Consumer<String> c1=s->System.out.println(s+" hi");
		Consumer<String> c2=s->System.out.println(s+" bi");
		Consumer<String> c3=c1.andThen(c2);
		
		c3.accept("rahul");*/
		
		/*Function<Integer,Integer> f1=i->i*2;
		Function<Integer,Integer> f2=i->i*i*i;
		
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));
		*/
		
		/*BiPredicate<Integer,Integer> bp1=(a,b)->(a+b)%2==0;
		BiPredicate<Integer,Integer> bp2=(a,b)->(a*b)%2==0;
		
		if(bp1.or(bp2).test(15, 20)) {
			System.out.println("for both numbers sum or product is even");
		}
		else {
			System.out.println("not even");
		}*/
		
		ArrayList<Employee> eList = new ArrayList<>();
		BiFunction<String, Double,Employee> f = (name,salary)->new Employee(name, salary);
		eList.add(f.apply("sunny",1000.0));
		eList.add(f.apply("bunny",2000.0));
		eList.add(f.apply("cunny",3000.0));
		eList.add(f.apply("munny",4000.0));
		eList.add(f.apply("runny",5000.0));
		
		eList.stream().forEach(e->System.err.println("name = "+e.getName()+" salary = "+e.getSalary()));
		
		BiConsumer<Employee, Double> bc = (e,d)->{
			e.setSalary(e.getSalary()+d);
		};
		
		for(Employee e: eList) {
			bc.accept(e,500.0);
		}
		
		System.out.println("After increasing the salary");
		eList.stream().forEach(e->System.out.println("name  = "+e.getName()+" salary = "+e.getSalary()));
	}
}
