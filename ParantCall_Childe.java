class FirstClass{
	void paranMethod(){
		System.out.println("Parant class method is excicute Called by Childe class Method");
   
	    childMethod();
	}

	void childMethod(){
         
	}

}
class ParantCall_Childe extends FirstClass{
	public static void main(String[] args){
       ParantCall_Childe parant=new ParantCall_Childe();
       parant.myMethod();  
	}
	void myMethod(){
		 paranMethod();
	}
	
	void childMethod(){
      System.out.println("Childe method is Excicute called by ParantClass Method");
	}
}
   

 