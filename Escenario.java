import java.util.ArrayList;
import java.util.Random;

public class Escenario implements Simulacion{



	Personaje korbi = new Korbi();
	Personaje meganMan = new MeganMan();
	Personaje dittuu = new Dittuu();
	Personaje ganador;
	Boolean terminada = false;
	ArrayList<Observador> observers = new ArrayList<>();
	Random random = new Random();
	String evento;
	int operador;
	String historial;
	
	public void simula() {
		while (terminada == false) {
			operador = random.nextInt(3);
			
			switch (operador) {
				case 0:
				// ataque Korbi
				operador = random.nextInt(2);
				switch (operador) {
					case 0:
					if (meganMan.getVida() > 0) {
						korbi.atacar(meganMan);
					}
					break;

					case 1:
					if (dittuu.getVida() > 0) {
						korbi.atacar(dittuu);
					}
					break;
				}
				evento = korbi.notifica();
				break;

				case 1:
				// ataque MeganMan
				operador = random.nextInt(2);
				switch (operador) {
					case 0:
					if (korbi.getVida() > 0) {
						meganMan.atacar(korbi);
					}
					break;

					case 1:
					if (dittuu.getVida() > 0) {
						meganMan.atacar(dittuu);
					}
					break;
				}
				evento = meganMan.notifica();
				break;

				case 2:
				// ataque Dittu
				operador = random.nextInt(2);
				switch (operador) {
					case 0:
					if (korbi.getVida() > 0) {
						dittuu.atacar(korbi);
					}
					break;

					case 1:
					if (meganMan.getVida() > 0) {
						dittuu.atacar(meganMan);
					}
					break;
				}
				evento = dittuu.notifica();
				break;

				default: 
				System.out.println("Error.");
				break;
			}

			generaHistoria(evento);

			if ((dittuu.getVida() < 0 && korbi.getVida() < 0)) {
				terminada = true;
				ganador = meganMan;
			} else if (meganMan.getVida() < 0 && dittuu.getVida() < 0) {
				terminada = true;
				ganador = korbi;
			} else if (korbi.getVida() < 0 && meganMan.getVida() < 0) {
				terminada = true;
				ganador = dittuu;
			}
		}
	}	
	
	public void registraObservador(Observador observador) {
		observers.add(observador);
	}

	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observador o = (Observador) observers.get(i);
			o.update(evento);
		}
	}

	public void setStatus(String status) {

	}

	public String getStatus() {
		return evento;
	}

	public String generaHistoria(String evento){
		historial += (evento + "\n");
		return historial;
	}

	public Personaje getWinner(){
		if (ganador != null) {
			return ganador;
		} else {
			throw new UnsupportedOperationException();
		}
	}
	

}