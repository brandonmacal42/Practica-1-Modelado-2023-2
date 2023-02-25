import java.util.Random;
/*
 * Esta es la clase terciaria que deriva de Nientiendo
 */
public class Korbi implements Personaje, HabilidadKorbi, PoderesNientendo {

	public String nombre = "Korbi";
	public int vida = 100;
	public int danio = 10;
	public Boolean defensa = false;
	public String empresa;
	public String ultimaAccion;
	// public Habilidad habilidadKorbi;

	Random random = new Random();
	public void atacar(Personaje personaje) {
		String enemigo = personaje.getNombre();
		int vidaEnemigo = personaje.getVida();

		if (personaje.setDefensa() == false) {
			// Generamos valor random de ataque
			int ataque = random.nextInt(danio);
			personaje.setVida((vidaEnemigo - ataque));
			ultimaAccion = ("Korbi ha hecho " + ataque + " de danio a " + enemigo + ". ");
		} else {
			// reducimos la probabilidad del danio de ataque al 50%
			int ataque = (int)(danio * .5);
			ataque = random.nextInt(danio);
			ultimaAccion = ("Korbi ha intentado atacar a " + enemigo + " mientras se defendia, " + enemigo + "Recibe " + ataque + " de danio. ");
			personaje.setVida((vidaEnemigo - ataque));
			// throw new UnsupportedOperationException("Unimplemented method 'atacar'");
		}
	}

	// uso de objetos
	public void consumeCocoExplosivo() {
		if (vida < 70) {
			vida += 30; 
			ultimaAccion = ("Korbi ha consumido Coco Explosivo, la vida actual de Korbi ha aumentado a " + vida);
		} else {
			ultimaAccion = ("Korbi ha consumido Coco Explosivo (sin efecto), la vida actual de Korbi es " + vida);
		}
	}

	public void consumePizzaGigante() {
		if (danio < 50) {
			danio += 20; 
			ultimaAccion = ("Korbi ha consumido Pizza Gigante, el danio actual de Korbi ha aumentado a " + danio);
		} else {
			ultimaAccion = ("Korbi ha consumido Pizza Gigante (sin efecto), el danio actual de Korbi es " + danio);
		}
	}

	public void consumeSombreroMagico() {
		if (danio < 50 && vida < 70) {
			danio += 20; 
			vida += 30;
			ultimaAccion = ("Korbi ha consumido Sombrero Gigante, el danio actual de Korbi ha aumentado a " + danio + ", la vida ha aumentado a " + vida);
		} else {
			ultimaAccion = ("Korbi ha consumido Sombrero Gigante (sin efecto), el danio actual de Korbi es " + danio + ", la vida actual es " + vida);
		}
	}

	// Habilidad especial por empresa
	public void replicaAtaque(Personaje personaje) {
		if (this.empresa.equals(personaje.getEmpresa())) {
			// Pertenecen a la misma empresa
			this.danio = personaje.getDanio();
			ultimaAccion = ("Korbi ha replciado el ataque de " + personaje.getNombre());
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