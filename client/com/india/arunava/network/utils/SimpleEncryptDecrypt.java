/*		   
 GNU GENERAL PUBLIC LICENSE
 Version 2, June 1991

 Copyright (C)  2009 Arunava Bhowmick ( http://arunava.in ).
 Kolkata India
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.
 If it is run professionally Powered by India web proxy must be mentioned.


 If any portion of this section is held invalid or unenforceable under
 any particular circumstance, the balance of the section is intended to
 apply and the section as a whole is intended to apply in other
 circumstances.

 It is not the purpose of this section to induce you to infringe any
 patents or other property right claims or to contest validity of any
 such claims; this section has the sole purpose of protecting the
 integrity of the free software distribution system, which is
 implemented by public license practices.  Many people have made
 generous contributions to the wide range of software distributed
 through that system in reliance on consistent application of that
 system; it is up to the author/donor to decide if he or she is willing
 to distribute software through any other system and a licensee cannot
 impose that choice.
 */

package com.india.arunava.network.utils;

/**
 * @author Arunava Bhowmick SIMPLE Enc. dec module. Keeping the output size
 *         same.
 * 
 */
public class SimpleEncryptDecrypt {

	public static byte[] enc(byte[] tmp) {
		for (int y = 0; y < tmp.length; y++) {
			tmp[y] = (byte) (tmp[y] + ProxyConstants.ENCKEY);
		}
		return tmp;
	}

	public static byte[] enc(byte[] tmp, int size) {
		for (int y = 0; y < size; y++) {
			tmp[y] = (byte) (tmp[y] + ProxyConstants.ENCKEY);
		}
		return tmp;
	}

	public static byte[] dec(byte[] tmp) {
		for (int y = 0; y < tmp.length; y++) {
			tmp[y] = (byte) (tmp[y] - ProxyConstants.ENCKEY);
		}
		return tmp;
	}

	public static byte[] dec(byte[] tmp, int size) {
		for (int y = 0; y < size; y++) {
			tmp[y] = (byte) (tmp[y] - ProxyConstants.ENCKEY);
		}
		return tmp;
	}

}
