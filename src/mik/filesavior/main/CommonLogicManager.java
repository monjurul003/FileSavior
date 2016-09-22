/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mik.filesavior.main;

import java.util.List;
import mik.entity.User;
import mik.gui.LogInForm;
import mik.processor.FileProcessor;

/**
 *
 * @author Rasel
 */
public class CommonLogicManager {

//    private List<User> appUserList;

    public void startProgram() {
//        FileProcessor fp = new FileProcessor();
//        appUserList = fp.prepareSystem();
        final LogInForm logInGUI = new LogInForm();

             /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                logInGUI.setVisible(true);
            }
        });
        
    }
}
