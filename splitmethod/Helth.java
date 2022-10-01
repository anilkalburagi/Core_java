class Helth{
	String docter;
	String problem;
	byte fee;
	void takesolution(){
	System.out.println("helth issue");
	
	String msg = "docter25helth25is25notgood";
	String msgs[] = msg.split("25");
	
	for(int i = 0;i<msgs.length;i++){
		System.out.println(msgs[i]);
	}
	}
	
	public static void main(String []ak){
	Helth helth = new Helth();
	helth.takesolution();
	}
}