class Testrestaurent {
	public static void main(String []ak){
	System.out.println(Restaurent.name);
	System.out.println(Restaurent.noofitems);
	
	Restaurent annapuranna = new Restaurent();
	System.out.println(annapuranna.location);
	System.out.println(annapuranna.noofemployee);
	System.out.println(annapuranna.reviews);
	System.out.println(annapuranna.cost);
	System.out.println(annapuranna.isPuerVEG);
	System.out.println(annapuranna.owner);
	
	for (int i = 0; i < annapuranna.partenrs.length; i++ ){
		
		System.out.println(annapuranna.partenrs[i]);
	}
	
	
	}
}