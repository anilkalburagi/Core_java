class Calender{

	 String type;
	 int hight;
	 int width;
	 String brandName;
		Calender(){
		System.out.println("inside the constructor");
		
		}
		void representDateAndDay(){
			System.out.println("SAT 1 oct");
			
			String msg ="hi10hello10how10are10you";
		    String msgs[] = msg.split("10");
		 
		 for(int i = 0;i<msgs.length;i++){
			 System.out.println(msgs[i]);
			}
		}
		
		public static void main(String []ak){
			Calender calender = new Calender();
		 calender.representDateAndDay();
		 
		 
		 
		}
}