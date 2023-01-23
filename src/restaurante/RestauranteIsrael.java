package restaurante;
/**
 * La clase RestauranteIsrael gestiona los comensales del restaurante Israel
 * 
 * @author DAW108
 * @version 1.0
 */

public class RestauranteIsrael {
		private int patatas;
		private int calamares;
		private static RestauranteIsrael r1;

		/**
		 * Contructor de la clase RestauranteIsrael
		 * 
		 * @param a Indica el número de patatas que hay en el stock
		 * @param b Indica el número de calamares que hay en el stock
		 */
		public RestauranteIsrael(int a, int b) {
			this.setPatatas(a);
			this.setCalamares(b);
		}
		
	
		int cantP() {
			int a = this.getPatatas() * 3;
			return a;
		}

	
		int cantC() {
			int ch = this.getCalamares() * 6;
			return ch;
		}

		/**
		 * Contructor de la clase RestauranteIsrael
		 * 
		 * @param a Indica el número de patatas que hay en el stock
		 * @param b Indica el número de calamares que hay en el stock
		 */
		public void addCalamares(int c) {
			this.setCalamares(this.getCalamares() + c);
		}
		
		/**
		 * Método por el que se añade la cantidad de patatas recibidos en un pedido
		 * 
		 * @param d cantidad de patatas a añadir al stock
		 */
		public void addPatatas(int d) {
			this.setPatatas(this.getPatatas() + d);
		}

		/** @hidden */
		public static void main(String[] args) {
			r1 = new RestauranteIsrael(50, 60);
			System.out.println("Cantidad de calamares: " + r1.getCalamares());
			System.out.println("Cantidad de patatas: " + r1.getPatatas());
			calculaComensales(r1);
			r1.addCalamares(1);
			r1.addPatatas(80);
			System.out.println("\nPedido Recibido!! Stock actual: ");
			System.out.println(r1.getPatatas() + " patatas.\n" + r1.getCalamares() + " calamares");
			calculaComensales(r1);
		}

		private static void calculaComensales(RestauranteIsrael r1) {
			if (r1.cantP() <= r1.cantC()) {
				System.out.println(
						"\nIsrael puede dar de comer a " + r1.cantP() + " personas con raciones de patatas máximo");
			} else {
				System.out.println(
						"\nIsrael puede dar de comer a " + r1.cantC() + " personas con raciones de calamares máximo");
			}
		}

		
		/**
		 * Getter: Devuelve el numero de patatas existentes actuales en el restaurante.
		 * @return
		 * 		Numero de patatas en el restaurante
		 */
		public int getPatatas() {
			return patatas;
		}

		/**
		 * Setter: Cambia el numero de patatas existentes actuales en el restaurante al valor indicado
		 * @param patatas
		 * 		Valor por el cual cambia el numero de patatas
		 */
		public void setPatatas(int patatas) {
			this.patatas = patatas;
		}
		/**
		 * Getter: Devuelve el numero de calamares existentes actuales en el restaurante.
		 * @return
		 * 		Numero de calamares en el restaurante
		 */
		public int getCalamares() {
			return calamares;
		}
		/**
		 * Setter: Cambia el numero de calamares existentes actuales en el restaurante al valor indicado
		 * @param calamares
		 * 		Valor por el cual cambia el numero de calamares
		 */
		public void setCalamares(int calamares) {
			this.calamares = calamares;
		}
}
