import java.util.ArrayList;

public class Escenario implements Simulacion{



	Personaje korbi = new Korbi() ;

		ArrayList<Observador> observers = new ArrayList<>();

	
	public static void simula() {
		
	}	
	
	public Personaje registraObservador(Observador o) {
		observers.add(o);
		return o.;
	}

	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observador o = (Observador) observers.get(i);
			o.update(null);
		}

	}
	public void setStatus(String status) {
		
	}

	public String getStatus() {

	}

	public String generaHistoria(){

	}

	public Personaje getWinner(){
		
	}
	public static void main(String[] args) {
		simula();
	}

}