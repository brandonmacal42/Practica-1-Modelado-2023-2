public class Observador implements Observer{

	String userId;
	String mensaje;

	public void generaBitacora(){
		
	}

	public void update(String mensaje) {
		this.mensaje = mensaje;
		display();
	}
	public void display() {
		System.out.println(mensaje);
	}
	
}
