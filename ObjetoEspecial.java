public abstract class ObjetoEspecial {
		
		private int ataque;
		private int defensa; 

		public ObjetoEspecial(String nombre, int ataque , int defensa) {
			this.ataque = ataque;
			this.defensa = defensa;
		}
		public int getAtaque() {
			return this.ataque;
		}
		public int getDefensa() {
			return this.defensa;
		}
	}