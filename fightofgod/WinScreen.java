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
public class WinScreen extends JPanel{
    private ImageIcon fieldwin = new ImageIcon("winscene.png");
    
    WinScreen(){}
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(fieldwin.getImage(),0,0,1000,800,this);
    }
}
