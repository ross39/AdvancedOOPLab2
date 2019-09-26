package ie.gmit.sw;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

import javax.crypto.Cipher;

public class RSACypher extends AbstractCypher {

	private KeyPair keyRing;

	public RSACypher() throws Throwable {
		super(Cipher.getInstance("RSA/ECB/PKCS1Padding"));
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(2048);
		keyRing = keyGen.generateKeyPair();
	}

	public byte[] encrypt(byte[] plainText) throws Throwable {
		return encrypt(plainText, keyRing.getPublic());
	}

	public byte[] decrypt(byte[] cypherText) throws Throwable {

		return decrypt(cypherText, keyRing.getPrivate());
	}

}
