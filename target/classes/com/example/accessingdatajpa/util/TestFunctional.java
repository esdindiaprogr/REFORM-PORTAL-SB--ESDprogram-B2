package com.example.accessingdatajpa.util;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

@FunctionalInterface
interface MyFunction {
	public Integer show(int x,int y);
}


class MyClass implements MyFunction {

	@Override
	public Integer show(int x, int y) {
		return x+y;
	}
	
}

public class TestFunctional {
	
	
      public static void main(String [] arg) {
      MyClass abc = new MyClass();
      System.out.println(  abc.show(10, 20) );
      
      
    	MyFunction xy = (x,y)-> { 
    		 System.out.println ("addition");
    	     return x+y; 
    	  };
				
     //Annoymous object
	    MyFunction xyz = (a,b) ->   a+b;
	    
	  System.out.println(xyz.show(10,20));
	  
	  
	  System.out.println(xy.show(20,30));
	  //----------------
	    
	//Consumer con;
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	numbers.add(5);
	numbers.add(15);
	numbers.add(25);
	numbers.add(35);
	
	
	
	
	
	for (int i=0; i< numbers.size();i++) 
	  {
		System.out.println(" index at " + numbers.get(i));
	  }
	
//advance forloop 
	  for (Integer x: numbers) {
		  System.out.println("advance " +  x );
	  }

  // Consumer con;
     
	  numbers.forEach (new Consumer<Integer>()  {
		@Override
		public void accept(Integer t) {
			System.out.println(" Consumer " + t);
		}
     });
	                    
	  numbers.forEach( x ->  System.out.println(x));
     }
      
      
}