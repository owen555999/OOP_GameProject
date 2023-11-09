/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fightofgod;

import java.awt.Graphics;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.util.Random;

/**
 *
 * @author User
 */
public class PlayState extends JPanel implements ActionListener{
    private final ImageIcon imgstate1 = new ImageIcon(this.getClass().getResource("fightscene.png"));
    private final ImageIcon imgstate2 = new ImageIcon(this.getClass().getResource("thor.png"));
    private final ImageIcon imgstate3 = new ImageIcon(this.getClass().getResource("demon.png"));
    private final ImageIcon rock = new ImageIcon(this.getClass().getResource("rock.png"));
    private final ImageIcon scissor = new ImageIcon(this.getClass().getResource("scissor.png"));
    private final ImageIcon paper = new ImageIcon(this.getClass().getResource("paper.png"));
    private final ImageIcon heart1 = new ImageIcon(this.getClass().getResource("1heart.png"));
    private final ImageIcon heart2 = new ImageIcon(this.getClass().getResource("2heart.png"));
    private final ImageIcon heart3 = new ImageIcon(this.getClass().getResource("3heart.png"));
    private final ImageIcon heart4 = new ImageIcon(this.getClass().getResource("4heart.png"));
    private final ImageIcon heart5 = new ImageIcon(this.getClass().getResource("5heart.png"));
    private final ImageIcon heart6 = new ImageIcon(this.getClass().getResource("6heart.png"));
    private final ImageIcon heart7 = new ImageIcon(this.getClass().getResource("7heart.png"));
    private final ImageIcon heart8 = new ImageIcon(this.getClass().getResource("8heart.png"));
    private final ImageIcon heart9 = new ImageIcon(this.getClass().getResource("9heart.png"));
    private final ImageIcon heart10 = new ImageIcon(this.getClass().getResource("10heart.png"));
    JButton jbtrock = new JButton(rock);
    JButton jbtscissor = new JButton(scissor);
    JButton jbtpaper = new JButton(paper);
    
    ImageIcon fieldlose = new ImageIcon(this.getClass().getResource("losescene.png"));
    ImageIcon fieldwin = new ImageIcon(this.getClass().getResource("winscene.png"));
    
    Random random = new Random();
    public int PlayerHP = 10;
    public int EnemyHP = 10;
    public int playerselect = 0;
    public int enemyselect = 0;
    
       
    PlayState(){
        this.setFocusable(true);
        this.setLayout(null);
        jbtrock.setBounds(370, 300, 120, 120);
        jbtrock.setContentAreaFilled(false);
        jbtrock.setBorderPainted(false);
        jbtscissor.setBounds(540, 300, 120, 120);
        jbtscissor.setContentAreaFilled(false);
        jbtscissor.setBorderPainted(false);
        jbtpaper.setBounds(454, 170, 120, 120);
        jbtpaper.setContentAreaFilled(false);
        jbtpaper.setBorderPainted(false);
        jbtrock.addActionListener(this);
        jbtscissor.addActionListener(this);
        jbtpaper.addActionListener(this);
        this.add(jbtrock);
        this.add(jbtscissor);
        this.add(jbtpaper);
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(PlayerHP <= 0)
        {
            this.remove(jbtrock);
            this.remove(jbtscissor);
            this.remove(jbtpaper);
            this.setLayout(null);
            g.drawImage(fieldlose.getImage(), 0, 0, 1000, 800, this);
        }
        else if(EnemyHP<= 0)
        {
            this.remove(jbtrock);
            this.remove(jbtscissor);
            this.remove(jbtpaper);
            this.setLayout(null);
            g.drawImage(fieldwin.getImage(), 0, 0, 1000, 800, this);
        }
        else if(PlayerHP >= 1 && EnemyHP >= 1)
        {
           g.drawImage(imgstate1.getImage(), 0, 0, 1000, 800, this);
           g.drawImage(imgstate2.getImage(), 50, 365, 275, 400, this);
           g.drawImage(imgstate3.getImage(), 650, 365, 275, 400, this);
           if(playerselect == 1 && enemyselect == 2)
           {
               g.drawImage(rock.getImage(), 50, 450, 120, 120, this);
               g.drawImage(scissor.getImage(), 650, 450, 120, 120, this);
               //EnemyHP = EnemyHP - 1;
           }
           else if(playerselect == 1 && enemyselect == 3)
           {
               g.drawImage(rock.getImage(), 50, 450, 120, 120, this);
               g.drawImage(paper.getImage(), 650, 450, 120, 120, this);
               //PlayerHP = PlayerHP - 1;
           }
           else if(playerselect == 1 && enemyselect == 1)
           {
               g.drawImage(rock.getImage(), 50, 450, 120, 120, this);
               g.drawImage(rock.getImage(), 650, 450, 120, 120, this);
           }
           else if(playerselect == 2 && enemyselect == 1)
           {
               g.drawImage(scissor.getImage(), 50, 450, 120, 120, this);
               g.drawImage(rock.getImage(), 650, 450, 120, 120, this);
               //PlayerHP = PlayerHP - 1;
           }
           else if(playerselect == 2 && enemyselect == 3)
           {
               g.drawImage(scissor.getImage(), 50, 450, 120, 120, this);
               g.drawImage(paper.getImage(), 650, 450, 120, 120, this);
               //EnemyHP = EnemyHP - 1;
           }
           else if(playerselect == 2 && enemyselect == 2)
           {
               g.drawImage(scissor.getImage(), 50, 450, 120, 120, this);
               g.drawImage(scissor.getImage(), 650, 450, 120, 120, this);
           }
           else if(playerselect == 3 && enemyselect == 1)
           {
               g.drawImage(paper.getImage(), 50, 450, 120, 120, this);
               g.drawImage(rock.getImage(), 650, 450, 120, 120, this);
               //EnemyHP = EnemyHP - 1;
           }
           else if(playerselect == 3 && enemyselect == 2)
           {
               g.drawImage(paper.getImage(), 50, 450, 120, 120, this);
               g.drawImage(scissor.getImage(), 650, 450, 120, 120, this);
               //PlayerHP = PlayerHP - 1;
           }
           else if(playerselect == 3 && enemyselect == 3)
           {
               g.drawImage(paper.getImage(), 50, 450, 120, 120, this);
               g.drawImage(paper.getImage(), 650, 450, 120, 120, this);
           }
           
           if(PlayerHP == 10)
           {
               g.drawImage(heart10.getImage(), 0, 0, 400, 150, this);
           }
           if(PlayerHP == 9)
           {
               g.drawImage(heart9.getImage(), 0, 0, 400, 150, this);
           }
           if(PlayerHP == 8)
           {
               g.drawImage(heart8.getImage(), 0, 0, 400, 150, this);
           }
           if(PlayerHP == 7)
           {
               g.drawImage(heart7.getImage(), 0, 0, 400, 150, this);
           }
           if(PlayerHP == 6)
           {
               g.drawImage(heart6.getImage(), 0, 0, 400, 150, this);
           }
           if(PlayerHP == 5)
           {
               g.drawImage(heart5.getImage(), 0, 0, 400, 150, this);
           }
           if(PlayerHP == 4)
           {
               g.drawImage(heart4.getImage(), 0, 0, 400, 150, this);
           }
           if(PlayerHP == 3)
           {
               g.drawImage(heart3.getImage(), 0, 0, 400, 150, this);
           }
           if(PlayerHP == 2)
           {
               g.drawImage(heart2.getImage(), 0, 0, 400, 150, this);
           }
           if(PlayerHP == 1)
           {
               g.drawImage(heart1.getImage(), 0, 0, 400, 150, this);
           }

           if(EnemyHP == 10)
           {
               g.drawImage(heart10.getImage(), 584, 0, 400, 150, this);
           }
           else if(EnemyHP == 9)
           {
               g.drawImage(heart9.getImage(), 584, 0, 400, 150, this);
           }
           else if(EnemyHP == 8)
           {
               g.drawImage(heart8.getImage(), 584, 0, 400, 150, this);
           }
           else if(EnemyHP == 7)
           {
               g.drawImage(heart7.getImage(), 584, 0, 400, 150, this);
           }
           else if(EnemyHP == 6)
           {
               g.drawImage(heart6.getImage(), 584, 0, 400, 150, this);
           }
           else if(EnemyHP == 5)
           {
               g.drawImage(heart5.getImage(), 584, 0, 400, 150, this);
           }
           else if(EnemyHP == 4)
           {
               g.drawImage(heart4.getImage(), 584, 0, 400, 150, this);
           }
           else if(EnemyHP == 3)
           {
               g.drawImage(heart3.getImage(), 584, 0, 400, 150, this);
           }
           else if(EnemyHP == 2)
           {
               g.drawImage(heart2.getImage(), 584, 0, 400, 150, this);
           }
           else if(EnemyHP == 1)
           {
               g.drawImage(heart1.getImage(), 584, 0, 400, 150, this);
           }            
        }
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jbtrock)
        {
            playerselect = 1;
            enemyselect = random.nextInt(3)+1;
            compareResults();
            repaint();
        }
        else if(e.getSource() == jbtscissor)
        {
            playerselect = 2;
            enemyselect = random.nextInt(3)+1;
            compareResults();
            repaint();
        }
        else if(e.getSource() == jbtpaper)
        {
            playerselect = 3;
            enemyselect = random.nextInt(3)+1;
            compareResults();
            repaint();
        }
    }
    public void compareResults() {
        if (playerselect == 1 && enemyselect == 2) {
            EnemyHP--;
        } else if (playerselect == 1 && enemyselect == 3) {
            PlayerHP--;
        } else if (playerselect == 2 && enemyselect == 1) {
            PlayerHP--;
        } else if (playerselect == 2 && enemyselect == 3) {
            EnemyHP--;
        } else if (playerselect == 3 && enemyselect == 1) {
            EnemyHP--;
        } else if (playerselect == 3 && enemyselect == 2) {
            PlayerHP--;
        }
    }
    public void enemyRandomSelection() {
        int randomChoice = random.nextInt(3) + 1; // สุ่มตัวเลข 1, 2 หรือ 3
        switch (randomChoice) {
            case 1:
                enemyselect = 1;
                break;
            case 2:
                enemyselect = 2;
                break;
            case 3:
                enemyselect = 3;
                break;
            default:
                break;
        }
    }
}
