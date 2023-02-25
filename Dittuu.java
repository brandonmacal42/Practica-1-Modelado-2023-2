import java.util.Random;
/*
 * Esta es la clase terciaria que deriva de chinpokomon
 */
public class Dittuu implements Personaje {

	public String nombre = "Dittuu";
	public int vida = 100;
	public int danio = 10;
	public Boolean defensa = false;
	public String empresa = "Nientiendo";
	public String ultimaAccion = "";
	// public Habilidad habilidadDittuu;

	Random random = new Random();
	public void atacar(Personaje personaje) {
		String enemigo = personaje.nombre;
		int vidaEnemigo = personaje.getVida();
		
		if (personaje.defendiendo == false) {
			// Generamos valor random de ataque
			int ataque = random.nextInt(danio);
			personaje.setVida((vidaEnemigo - ataque));
			ultimaAccion = ("Dittuu ha hecho " + ataque + " de danio a " + enemigo + ". ");
		} else {
			// reducimos la probabilidad del danio de ataque al 50%
			int ataque = ataque * .5;
			ataque = random.nextInt(danio);
			personaje.setVida((vidaEnemigo - ataque));
			ultimaAccion = ("Dittuu ha intentado atacar a " + enemigo + " mientras se defendia, " + enemigo + "Recibe " + ataque + " de danio. ");
			// throw new UnsupportedOperationException("Unimplemented method 'atacar'");
		}
	}

	// uso de objetos
	public void consumeBayasSilvestres() {
		if (vida < 70) {
			vida += 30; 
			ultimaAccion = ("Dittuu ha consumido Bayas Silvestres, la vida actual de Dittuu ha aumentado a " + vida);
		} else {
			ultimaAccion = ("Dittuu ha consumido Bayas Silvestres (sin efecto), la vida actual de Dittuu es " + vida);
		}
	}

	public void consumeBurritoFrijoles() {
		if (danio < 50) {
			danio += 20; 
			ultimaAccion = ("Dittuu ha consumido Burrito de Frijoles, el danio actual de Dittuu ha aumentado a " + danio);
		} else {
			ultimaAccion = ("Dittuu ha consumido Burrito de Frijoles (sin efecto), el danio actual de Dittuu es " + danio);
		}
	}

	public void consumeHierbaSospechosa() {
		if (danio < 50 && vida < 70) {
			danio += 20; 
			vida += 30;
			ultimaAccion = ("Dittuu ha consumido una Hierba Sospechosa, el danio actual de Dittuu ha aumentado a " + danio + ", la vida ha aumentado a " + vida);
		} else {
			ultimaAccion = ("Dittuu ha consumido una Hierba Sospechosa (sin efecto), el danio actual de Dittuu es " + danio + ", la vida actual es " + vida);
		}
	}

	// Habilidad especial por empresa
	public void trasnformarse(Personaje personaje) {
		if (this.empresa.equals(personaje.empresa)) {
			// Pertenecen a la misma empresa
			ultimaAccion = ("Dittu ha copiado la apariencia de  " + personaje.nombre);
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

}