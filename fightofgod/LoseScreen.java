/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fightofgod;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class LoseScreen extends JPanel{
    private ImageIcon fieldlose = new ImageIcon("losescene.png");
    
    LoseScreen(){}
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(fieldlose.getImage(),0,0,1000,800,this);
    }
}

