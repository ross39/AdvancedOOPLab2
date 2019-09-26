package ie.gmit.sw;

import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class AESCypher extends AbstractCypher {

	private Key key;
	public AESCypher() throws Throwable {
		super(Cipher.getInstance("AES/ECB/PKCS5Padding"));
		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		keyGen.init(128);
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
