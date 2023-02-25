import java.util.Random;
/*
 * Esta es la clase terciaria derivada de Copcam
 */
public class MeganMan implements Personaje {

	public String nombre = "MeganMan";
	public int vida = 100;
	public int danio = 10;
	public Boolean defensa = false;
	public String empresa = "CopCam";
	public String ultimaAccion = "";
	// public Habilidad habilidadMeganMan;

	Random random = new Random();
	public void atacar(Personaje personaje) {
		String enemigo = personaje.getNombre();
		int vidaEnemigo = personaje.getVida();

		if (personaje.setDefensa() == false) {
			// Generamos valor random de ataque
			int ataque = random.nextInt(danio);
			personaje.setVida((vidaEnemigo - ataque));
			ultimaAccion = ("MeganMan ha hecho " + ataque + " de danio a " + enemigo + ". ");
		} else {
			// reducimos la probabilidad del danio de ataque al 50%
			int ataque = (int) (danio * .5);
			ataque = random.nextInt(danio);
			ultimaAccion = ("MeganMan ha intentado atacar a " + enemigo + " mientras se defendia, " + enemigo + "Recibe " + ataque + " de danio. ");
			personaje.setVida((vidaEnemigo - ataque));
			// throw new UnsupportedOperationException("Unimplemented method 'atacar'");
		}
	}

	// uso de objetos
	public void consumeTanqueGasolina() {
		if (vida < 70) {
			vida += 30; 
			ultimaAccion = ("MeganMan ha consumido Tanque de Gasolina, la vida actual de Korbi ha aumentado a " + vida);
		} else {
			ultimaAccion = ("MeganMan ha consumido Tanque de Gasolina (sin efecto), la vida actual de MeganMan es " + vida);
		}
	}

	public void consumeAceiteMotor() {
		if (danio < 50) {
			danio += 20; 
			ultimaAccion = ("MeganMan ha consumido Aceite de Motor, el danio actual de MeganMan ha aumentado a " + danio);
		} else {
			ultimaAccion = ("MeganMan ha consumido Aceite de Motor (sin efecto), el danio actual de MeganMan es " + danio);
		}
	}

	public void consumeQuesadillaPicante() {
		if (danio < 50 && vida < 70) {
			danio += 20; 
			vida += 30;
			ultimaAccion = ("MeganMan ha consumido Quesadilla Picante, el danio actual de MeganMan ha aumentado a " + danio + ", la vida actual ha aumentado a " + vida);
		} else {
			ultimaAccion = ("MeganMan ha consumido Quesadilla Picante (sin efecto), el danio actual de MeganMan es " + danio + ", la vida actual es " + vida);
		}
	}

	// Habilidad especial por empresa
	public void replicaHabilidades(Personaje personaje) {
		if (this.empresa.equals(personaje.getEmpresa())) {
			// Pertenecen a la misma empresa
			this.danio = personaje.getDanio();
			ultimaAccion = ("MeganMan ha replciado las habilidades de " + personaje.getNombre());
		}
	}

	public int getVida () {
		return vida;
	}

	public void setVida (int vida) {
		this.vida = vida;
	}

	public int getDanio () {
		return danio;
	}

	public void setDanio (int danio) {
		this.danio = danio;
	}

	public Boolean setDefensa () {
		return defensa;
	}

	public void getDefensa (Boolean defensa) {
		this.defensa = defensa;
	}

	public String notifica () {
		return ultimaAccion;
	}
	
	public String getNombre () {
		return this.nombre;
	}
	public String getEmpresa () {
		return this.empresa;
	}

	public void modificaStadisticas() {
		throw new UnsupportedOperationException("Unimplemented method 'modificaStadisticas'");
	}
}