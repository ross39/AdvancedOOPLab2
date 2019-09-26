package ie.gmit.sw;

public class Runner {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		CypherFactory cf = CypherFactory.getInstance();
		Cypherable c = cf.getCypher(CypherMode.Asymmetric);
		String s = "Attack the castle wall after lunch";
		
		byte[] t = c.encrypt(s.getBytes());
		
		System.out.println(new String(t));
		System.out.println(new String(c.decrypt(t)));

	}

}
