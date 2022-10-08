import java.util.Scanner;
class Cal {
	String brandName;
	short price;
	char color;
	String types;
	boolean isSolarpower; 
	
	Cal (String brandName,short price,char color,String types,boolean isSolarpower){
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
		  
		  int div = (a/b)/c;
		  return div;
		  
	  }
	    static int mul(int a, int b, int c){
		  
		  int mul = a * b * c;
		  return mul;
		}
		   static int avg(int a, int b, int c){
		   int avg = (a+b+c)/3;
		   return avg;
	  }
	  
	  public static void main(String []ak){
		  Scanner scanner = new Scanner(System.in);

			System.out.println("enter the first value");
			int a=scanner.nextInt();
			
     		  System.out.println("please select opertion \n 1.add \t 2.sub \n 3.mul \t 4. div \n 5.avg");
			   int op = scanner.nextByte();
			System.out.println("enter 2nd value");
			int b=scanner.nextInt();
			System.out.println("enter 3rd value");
			int c=scanner.nextInt();
			if (op == 1){
		  
		  int result1 = Cal.addition(a , b , c);
		  System.out.println("addition output");
		  System.out.println(result1);
			}else if(op == 2){
			
			  int result2 = Cal.sub(a , b , c);
			  System.out.println("substract output");
		  System.out.println(result2);
			}else if(op == 3){
		  
		    int result3 = Cal.div(a , b , c);
			System.out.println("divtion output");
		  System.out.println(result3);
			}else if(op == 4){
			
		    int result4 = Cal.mul(a , b , c);
			System.out.println("multiplcation output");
		  System.out.println(result4);
			}else if(op == 5){
		   
		    int result5 = Cal.avg(a , b , c);
			System.out.println("avrege output");
		  System.out.println(result5);
		  	
			}
		  
	  }
}