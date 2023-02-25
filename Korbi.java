/*
 * Esta es la clase terciaria que deriva de Nientiendo
 */
public class Korbi implements Nientiendo, Personaje{

	boolean defendiendo;
	
	public void atacar(Personaje p) {
		throw new UnsupportedOperationException("Unimplemented method 'atacar'");
	}

	public void usarObjeto(ObjetoEspecial o) {
		throw new UnsupportedOperationException("Unimplemented method 'usarObjeto'");
	}

	public void recibeDaño(int daño) {

	}

	public void replicaAtaque(Personaje p) {
			
	}

	@Override
	public void recibeDaño() {
		throw new UnsupportedOperationException("Unimplemented method 'recibeDaño'");
	}
	
	
}
