package ie.gmit.sw;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class DESCypher extends AbstractCypher {

	private Key key;
	public DESCypher() throws Throwable {
		super(Cipher.getInstance("DES/ECB/PKCS5Padding"));
		KeyGenerator keyGen = KeyGenerator.getInstance("DES");
		keyGen.init(56);
	    key = keyGen.generateKey();
	}

	@Override
	public byte[] encrypt(byte[] plainText) throws Throwable {
		// TODO Auto-generated method stub
		return super.encrypt(plainText, key);
	}

	@Override
	public byte[] decrypt(byte[] cypherText) throws Throwable {
		// TODO Auto-generated method stub
		return super.decrypt(cypherText, key);
	}

}
 


