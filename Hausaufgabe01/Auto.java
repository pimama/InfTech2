public class Auto implements Transportmittel{
	
	private double geschwindigkeit;
	
	public Auto(double geschwindigkeit){
		if (geschwindigkeit>=50 || geschwindigkeit<=-50){
			this.geschwindigkeit=0;
			
		}
		
		else{
			this.geschwindigkeit=geschwindigkeit;
		}
	}
	
	public double getGeschwindigkeit(){
		return this.geschwindigkeit;
	}
	
	 void beschleunigen (double geschwindigkeit){
		if (-50<=(this.geschwindigkeit)+geschwindigkeit)<=50){
			this.geschwindigkeit= this.geschwindigkeit + geschwindigkeit;
		}
		else{
			println "Das Auto darf nicht schneller als 50 km/h fahren.";
		}
	}
}