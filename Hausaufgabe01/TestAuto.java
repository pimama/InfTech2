public class TestAuto{
	public static void main (String[] args){
		Auto auto = new Auto(0);
		
		for (int i=0; i<14;i++){
			auto.beschleunige(5);
			println auto.geschwindigkeit;
		}
		}
}