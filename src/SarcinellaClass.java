
/**
 * 
 * @author Manuel <b>Sarcinella</b> - <u>4AI</u> - <i>13/05/2020</i>
 *
 */

public class SarcinellaClass {

	/**
	 * @author Manuel Sarcinella
	 */
	public SarcinellaClass() {
		
	}
	
	
	/**
	 * @param b primo numero
	 * @param e secondo numero
	 * 
	 * @return valore
	 */
	public float cognomeMet (int b, int e) {
		int val1=b; //val deve essere uguale a b
		
			for (int i=1; i<e; i++){ //i deve essere < di e
				val1 = val1 * b;
			}
			return val1;
			
		}
	
	
	/**
	 * @author Manuel Sarcinella
	 * 
	 */
	public static void main(String[] args) {
		SarcinellaClass s=new SarcinellaClass();
		
		System.out.println(s.cognomeMet(3, 10));

	}

}
