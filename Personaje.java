/*
* ESTA ES LA CLASE PRINCIPAL DE DONDE DERIVAN TODOS LOS PERSONAJES
 */
public interface Personaje {

	public void atacar(Personaje personaje);
	public void setVida (int vida);
	public Boolean setDefensa();
	public void setDanio(int danio);
	public int getDanio();
	public int getVida();
	public void getDefensa(Boolean defensa);
	public String getNombre();
	public String getEmpresa();
	public String notifica();
}