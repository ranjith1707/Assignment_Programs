import java.util.*;
class First{
	
	public First(){
		System.out.println("first");
	} 
	public First(int i){
		System.out.println("First Parameter passed");
	}
}

class Second extends First{
	Second(int i){
		//super(i);
		this(1,2);
		System.out.println("Second");
	}
	Second (int j, int i){
		System.out.println("Second Constructor is called in Using This Keyword");
	}
}



class FuctionOfConstructor{
	public static void main(String[] args){
    
      Second s=new Second(12);
   
	}
}