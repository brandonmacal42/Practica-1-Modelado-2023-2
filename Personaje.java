/*
* ESTA ES LA CLASE PRINCIPAL DE DONDE DERIVAN TODOS LOS PERSONAJES
 */
public abstract class Personaje {
	
	String nombre;
	String tipo;


	public Personaje(String nombre, String tipo){
		this.nombre = nombre;
		this.tipo = tipo;
	}	
	boolean defendiendo = false;
	int poderAtaque = 10;
	int poderDefensa = 5;
	int vida = 100;
	
	public String atacar(Personaje enemigo){
		return "Korbi ha atacado a " + enemigo.getNombre() + "con un ataque de " + poderAtaque + "puntos.";
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getTipo(){
		return this.tipo;
	}
	public void usarObjeto(ObjetoEspecial o){
		poderAtaque += o.getAtaque();
		poderDefensa += o.getDefensa();
	}
	
}