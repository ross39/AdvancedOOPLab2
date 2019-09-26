package ie.gmit.sw;

public interface Cypherable {

	byte[] encrypt(byte[] plainText) throws Throwable;

	byte[] decrypt(byte[] cypherText) throws Throwable;

}