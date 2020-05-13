/**
 * 
 * @author Matthias
 *
 */
public class LannoccaClass {
/**
 * 
 */
	public LannoccaClass() {
		
	}
	/**
	 * 
	 * @param b
	 * @param e
	 * @return
	 */
	public float LannoccaMet (int b, int e) {
		int val1=1;
		for(int i=1;i<=e;i++) {    //bisogna mettere <= a e in quanto l'operazione si deve ripetere per e volte
			val1=val1*b;
		}
		return val1;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		LannoccaClass lc= new LannoccaClass();
		System.out.println(lc.LannoccaMet(3, 7));
	}
	//versione2
}
