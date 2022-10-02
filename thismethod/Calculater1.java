class Calculater1 {
	String brandName;
	short price;
	char color;
	String types;
	boolean isSolarpower; 
	
	Calculater1 (String brandName,short price,char color,String types,boolean isSolarpower){
			this.brandName = brandName;
			this.price = price;
			this.color = color;
			this.types = types;
			this.isSolarpower = isSolarpower;
	  }
	  static int addition(int a, int b){
		  
		  int sum = a+b;
		  return sum;
		  
	  }
	  static int addition(int a, int b, int c){
		  
		  int sum = a+b+c;
		  return sum;
	  }
	  public static void main(String []ak){
		  int a = 22;
		  int b = 22;
	
		  int result = Calculater1.addition(a , b );
		  System.out.println(result);
			
			 	  int c = 30;
				  result = Calculater1.addition(result , c);
				  System.out.println(result);
		  
		   
		  
	  }

}