class Calculater {
	String brandName;
	short price;
	char color;
	String types;
	boolean isSolarpower; 
	
	Calculater (String brandName,short price,char color,String types,boolean isSolarpower){
			this.brandName = brandName;
			this.price = price;
			this.color = color;
			this.types = types;
			this.isSolarpower = isSolarpower;
	  }
	  static int addition(int a, int b, int c){
		  
		  int sum = a+b+c;
		  return sum;
		  
	  }
	    static int sub(int a, int b,int c){
		  
		  int sub = a-b-c;
		  return sub;
		  
	  }
	    static int div(int a, int b, int c){
		  
		  int div = a/b/c;
		  return div;
		  
	  }
	    static int mul(int a, int b, int c){
		  
		  int mul = a+b;
		  return mul;
		  
	  }
	  
	  public static void main(String []ak){
		  int a = 22;
		  int b = 22;
		  int c = 30;
		  int result1 = Calculater.addition(a , b , c);
		  System.out.println(result1);
			
			  int result2 = Calculater.sub(a , b , c);
		  System.out.println(result2);
		  
		    int result3 = Calculater.div(a , b , c);
		  System.out.println(result3);
		  
		    int result4 = Calculater.mul(a , b , c);
		  System.out.println(result4);
		  
		   
		  
	  }

}