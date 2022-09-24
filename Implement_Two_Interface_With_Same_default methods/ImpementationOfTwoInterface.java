	interface InterfaceOne{
	 
	default void  run(){
		System.out.println("Interface One Is Execute");
	}
	
}


interface InterfaceTwo{
	
	public default void run() {
		System.out.println("Second  Interface  is Excicute");
	}
}



class ImpementationOfTwoInterface implements InterfaceOne,InterfaceTwo{
   public static void main(String[] args) {
			ImpementationOfTwoInterface object=new ImpementationOfTwoInterface();
			object.myMethod();
		 }
		void myMethod() {
			run();
		}
		
		
		public void run() {
			System.out.println("Override The Default Method");
		}
}
