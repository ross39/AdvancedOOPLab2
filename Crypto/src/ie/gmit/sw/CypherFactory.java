package ie.gmit.sw;

public class CypherFactory {

	private static CypherFactory f = new CypherFactory();

	private CypherFactory() {
	}

	public static CypherFactory getInstance() {
		return f;
	}

	//factory method
	 public Cypherable getCypher(CypherMode mode) throws Throwable {
		 if (mode == CypherMode.Symmetric) {
			 return (Cypherable) Class.forName("ie.gmit.sw.DESCypher").newInstance();
		 }else {
			 return new RSACypher();
		 }
	 }
}
