class num{
	public static void main ( String []ak){
		byte []data={10,2,40,20,50,29};
		System.out.println("size of the array" + data.length);
		for(byte  num=0; num < data.length; num++){
			if( data [num] %2 ==0){
				System.out.println( data [num]  + "is even number");
			}else{
				System.out.println( data [num] + "is odd number");
			}
			
		}
		
	}
}