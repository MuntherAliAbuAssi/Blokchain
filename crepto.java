/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central.bloackchain;

import java.security.MessageDigest;

/**
 *
 * @author Munther
 */
class crypt {
    
public static String sha256(String input)
    {
        try {
            MessageDigest sha
                = MessageDigest
                      .getInstance(
                          "SHA-256");
            int i = 0;
 
            byte[] hash
                = sha.digest(
                    input.getBytes("UTF-8"));
 
            // hexHash will contain
            // the Hexadecimal hash
            StringBuffer hexHash
                = new StringBuffer();
 
            while (i < hash.length) {
                String hex
                    = Integer.toHexString(
                        0xff & hash[i]);
                if (hex.length() == 1)
                    hexHash.append('0');
                hexHash.append(hex);
                i++;
            }
 
            return hexHash.toString();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
