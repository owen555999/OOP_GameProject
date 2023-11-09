/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fightofgod;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class PlayGames extends JFrame implements ActionListener{
    Home home = new Home();
    PlayState state = new PlayState();
    LoseScreen lose = new LoseScreen();
    WinScreen win = new WinScreen();
    
    public PlayGames()
    {
        this.setSize(1000,800);
        this.add(home);
        home.BStart.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == home.BStart)
        {
            this.setLocationRelativeTo(null);
            this.remove(home);
            this.setSize(1000, 800);
            this.add(state);
            state.requestFocusInWindow();
            state.PlayerHP = 10;
            state.EnemyHP = 10;
        }
        this.validate();
        this.repaint();
    }
    
    public static void main(String[] args) {
        JFrame jf = new PlayGames();
        jf.setSize(1000, 800);
        jf.setTitle("Fight Of God");
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
    }
}
