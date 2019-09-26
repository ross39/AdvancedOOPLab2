package ie.gmit.sw;

import java.security.Key;

import javax.crypto.Cipher;

public abstract class AbstractCypher implements Cypherable {

	private Cipher cypher;

	public AbstractCypher(Cipher cypher) {
		this.cypher = cypher;
	}

	
	/* (non-Javadoc)
	 * @see ie.gmit.sw.Cypherable#encrypt(byte[])
	 */
	@Override
	public abstract byte[] encrypt(byte[] plainText) throws Throwable;
	/* (non-Javadoc)
	 * @see ie.gmit.sw.Cypherable#decrypt(byte[])
	 */
	@Override
	public abstract byte[] decrypt(byte[] cypherText) throws Throwable;
	
	public byte[] encrypt(byte[] plainText, Key key) throws Throwable {
		getCypher().init(Cipher.ENCRYPT_MODE, key);
		return getCypher().doFinal(plainText);
	}

	public byte[] decrypt(byte[] cypherText, Key key) throws Throwable {
		getCypher().init(Cipher.DECRYPT_MODE, key);
		return getCypher().doFinal(cypherText);
	}

	protected Cipher getCypher() {
		return cypher;
	}

	

}