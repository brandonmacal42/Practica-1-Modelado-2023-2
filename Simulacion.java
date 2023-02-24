	public interface Simulacion {
	
		Nientiendo korbi = new Korbi();
		Copcam MeganMan = new MeganMan();
		Chinpokomon Dituu = new Dittuu();

		String historial="";

		public void simulacion();

		public String generaHistoria();

		public Personaje getWinner();

		public void notifyObserver();	


	}

