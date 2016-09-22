/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mik.encryption;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import mik.processor.FileProcessor;

/*  Mode = CipherMode.CBC,-( Cipher-block chaining)
 Padding = PaddingMode.PKCS7 or PKCS5,
 KeySize = 128,
 BlockSize = 128,
 Key = keyBytes - password,
 IV = keyBytes  - password*/
public class ImageEncryptDecrypt {

    static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(FileProcessor.class);
    Cipher cipher;
    // password for encryption
    String strPassword; //= "Monjuru1!$1@mKh@"; //password length must be 16 charater long
    // put this as key in AES
    SecretKeySpec key = new SecretKeySpec(strPassword.getBytes(), "AES");

    public ImageEncryptDecrypt() {
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }
    
    public ImageEncryptDecrypt(String strPassword) {
        this.strPassword = strPassword;
    }
    

    public void emni(String args[]) throws Exception {
        FileProcessor fp = new FileProcessor();

        String fileName = "a.jpg";
        String fileLoc = "D;";
//        input = fp.readImageAsByteStream(fileLoc, fileName);

        // encode data using standard encoder
//        String output = new BASE64Encoder().encode(encrypted);
        // Base64Encoder is replaced by printBase64Binary()
//        String output = DatatypeConverter.printBase64Binary(encrypted);
    }

    public byte[] getDecryptedByteStream(byte[] input) {
        try {
            // Parameter specific algorithm
            AlgorithmParameterSpec paramSpec = new IvParameterSpec(strPassword.getBytes());
            //Whatever you want to encrypt/decrypt
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            // You can use ENCRYPT_MODE (ENCRYPTunderscoreMODE)  or DECRYPT_MODE (DECRYPT underscore MODE)
            cipher.init(Cipher.DECRYPT_MODE, key, paramSpec);

            // encrypt data
            byte[] decrypted = cipher.doFinal(input);
            return decrypted;
        } catch (NoSuchAlgorithmException ex) {
            logger.fatal(ex);
        } catch (NoSuchPaddingException ex) {
            logger.fatal(ex);
        } catch (InvalidKeyException ex) {
            logger.fatal(ex);
        } catch (InvalidAlgorithmParameterException ex) {
            logger.fatal(ex);
        } catch (IllegalBlockSizeException ex) {
            logger.fatal(ex);
        } catch (BadPaddingException ex) {
            logger.fatal(ex);
        }
        return null;
    }

    public byte[] getEncryptedByteStream(byte[] input) {
        byte[] encrypted;
        try {
            // Parameter specific algorithm
            AlgorithmParameterSpec paramSpec = new IvParameterSpec(strPassword.getBytes());
            //Whatever you want to encrypt/decrypt
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");

            // You can use ENCRYPT_MODE (ENCRYPTunderscoreMODE)  or DECRYPT_MODE (DECRYPT underscore MODE)
            cipher.init(Cipher.ENCRYPT_MODE, key, paramSpec);
            // encrypt data
            encrypted = cipher.doFinal(input);
            return encrypted;
        } catch (NoSuchAlgorithmException ex) {
            logger.fatal(ex);
        } catch (NoSuchPaddingException ex) {
            logger.fatal(ex);
        } catch (IllegalBlockSizeException ex) {
            logger.fatal(ex);
        } catch (BadPaddingException ex) {
            logger.fatal(ex);
        } catch (InvalidKeyException ex) {
            logger.fatal(ex);
        } catch (InvalidAlgorithmParameterException ex) {
            logger.fatal(ex);
        }
        return null;
    }

}
