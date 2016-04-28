public class Integer{
	private int[] werte;
	private int groesstes;
	
	public Integer(int[] werte, int groesstes){
		this.werte = werte;
		this.groesstes = groesstes;
	}
	
	private int groessere (int x, int y){
		if (int Math.abs(x) < Math.abs(y)){
			return y;
		}
		else{
			return x;
		}
	}
	
	public void setGroesstes (){
		int max = this.werte[0];
		
		for(int i=0; i<this.werte.length; i++;){
			if (max<this.werte[i]){
				max=this.werte[i];
			}
			
			else{}
		}
		
		public void ausgabeRekursiv(int start){
			if (start=this.werte.length){
				println this.werte[start];
			}
			else{
				println this.werte[start] + " " + this.ausgabeRekursiv(start+1);
			}
		}
	}
}