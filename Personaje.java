/*
* ESTA ES LA CLASE PRINCIPAL DE DONDE DERIVAN TODOS LOS PERSONAJES
 */
public interface Personaje {

	public void atacar(Personaje personaje);
	public void setVida (int vida);
	public void setDefensa(Boolean defensa);
	public void setDanio(int danio);
	public int getDanio();
	public int getVida();
	public Boolean getDefensa();
		
	
}