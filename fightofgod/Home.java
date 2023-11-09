/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fightofgod;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Home extends JPanel{
    private ImageIcon field = new ImageIcon(this.getClass().getResource("homescreen.png"));
    private ImageIcon start = new ImageIcon(this.getClass().getResource("start.png"));
    public JButton BStart = new JButton(start);
    
    Home()
    {
        setLayout(null);
        BStart.setBounds(350, 650, 310, 70);
        BStart.setContentAreaFilled(false);
        BStart.setBorderPainted(false);
        add(BStart);
    }
    
    public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(field.getImage(),0,0,1000,800,this);

	}
}
