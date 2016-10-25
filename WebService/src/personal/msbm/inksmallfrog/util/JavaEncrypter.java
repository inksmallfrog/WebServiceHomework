package personal.msbm.inksmallfrog.util;

import java.security.MessageDigest;

/**
 * Created by inksmallfrog on 2016/10/26.
 */
public class JavaEncrypter {
    public static String encryptSHA(String data){
        byte[] stringBytes = data.getBytes();
        MessageDigest sha = null;
        try {
            sha = MessageDigest.getInstance("SHA-256");
        }catch (Exception e){
            e.printStackTrace();
        }
        sha.update(stringBytes);
        byte[] hashResult = sha.digest();

        StringBuffer hexString = new StringBuffer();
        for (int i=0;i<hashResult.length;i++) {
            hexString.append(Integer.toHexString(0xFF & hashResult[i]));
        }
        return hexString.toString();
    }
}
