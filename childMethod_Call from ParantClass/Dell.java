interface Laptop{
	 void processorType();

	default void findProcessor(){
       processorType();
	}
}

class Dell implements Laptop{
	public static void main(String[] args){
       Dell dell=new Dell();
       dell.version();
	}
   void version(){
   	  findProcessor();
   }
	public void processorType(){
		System.out.println("intel  i7 12 gen  ");
	}
}