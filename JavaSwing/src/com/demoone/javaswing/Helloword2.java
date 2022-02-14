/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demoone.javaswing;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Acer
 */
public class Helloword2 extends JFrame{

    public Helloword2() throws HeadlessException {
        setSize(400, 400);
    }
    public static void main(String[] args) {
        new Helloword2().setVisible(true);
    }
    
}
