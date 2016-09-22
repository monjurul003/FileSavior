/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mik.encryption;

import mik.utility.Blowfish;

/**
 *
 * @author Rasel
 */
public class EncryptionManager {
     private  Blowfish bf;

    public EncryptionManager() {
          this.bf = new Blowfish("@&12X3abc#");
    }
    
     
    
}
