/*
* ESTA ES LA CLASE PRINCIPAL DE DONDE DERIVAN TODOS LOS PERSONAJES
 */
public interface Personaje {
	
	String nombre = null;
	boolean defendiendo = false;

	public void atacar(Personaje personaje);

	public int getVida();
		
	
}