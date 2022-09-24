interface Laptop{
   default void operatingSystem(){
   	  System.out.println("Windows  Operating System Is Installed");
   }
}


interface Mobile{
  default void operatingSystem(){
  	System.out.println("Android os  is Installed");
  }
}


 class Tab implements Laptop,Mobile{
 	public static void main(String[] args){
       Tab tab=new Tab();
       tab.myMethod();
 	}

 	void myMethod(){
 		operatingSystem();
 	}

	public void operatingSystem(){
		Mobile.super.operatingSystem();
	}
}