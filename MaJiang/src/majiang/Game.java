package majiang;


import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import majiang.ShuffleMaJiang;
import majiang.Player;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a0414
 */

public class Game extends javax.swing.JFrame  {
 
    /**
     * Creates new form Game
     */       

    ImageIcon icon; 
    Player player1=new Player(),player2=new Player(),player3=new Player(),player4=new Player();
                  ShuffleMaJiang shm=null;
              ArrayList<ImageIcon> p1=new ArrayList<ImageIcon>();
              ArrayList<ImageIcon> p2=new ArrayList<ImageIcon>();
              ArrayList<ImageIcon> p3=new ArrayList<ImageIcon>();
              ArrayList<ImageIcon> p4=new ArrayList<ImageIcon>();
              
    public Game() throws InterruptedException  {
              initComponents();
       
             // Player player1=new Player(),player2=new Player(),player3=new Player(),player4=new Player();
//              ShuffleMaJiang shm=null;
//              ArrayList<ImageIcon> p1=new ArrayList<ImageIcon>();
//              ArrayList<ImageIcon> p2=new ArrayList<ImageIcon>();
//              ArrayList<ImageIcon> p3=new ArrayList<ImageIcon>();
//              ArrayList<ImageIcon> p4=new ArrayList<ImageIcon>();
        try {
            shm=new ShuffleMaJiang();
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
            int startIndex = 5;            
            ShuffleMaJiang.maindex=startIndex-1;       
            shm.moveMaJiangs();
//==============================================================
       for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 4; j++) {
                player1.getMaJiang(ShuffleMaJiang.maindex);
            }
            for (int j = 0; j < 4; j++) {
                 player2.getMaJiang(ShuffleMaJiang.maindex);
            }
            for (int j = 0; j < 4; j++) {
                player3.getMaJiang(ShuffleMaJiang.maindex);
            }
            for (int j = 0; j < 4; j++) {
               player4.getMaJiang(ShuffleMaJiang.maindex);
            }
        }
        player1.getMaJiang(ShuffleMaJiang.maindex);
        player2.getMaJiang(ShuffleMaJiang.maindex);
        player3.getMaJiang(ShuffleMaJiang.maindex);
        player4.getMaJiang(ShuffleMaJiang.maindex);
//=======================================================
//            initPlayer = new Initplayer();
//            initPlayer.haveFirstBoard();
//            initPlayer.printPlayer();
            p1= player1.printMaJiangs();
            p2= player2.printMaJiangs();
            p3= player3.printMaJiangs();
            p4= player4.printMaJiangs();
            JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
            JLabel[] j2={jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28};
            JLabel[] j3={jLabel29,jLabel30,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,jLabel41,jLabel42};
            JLabel[] j4={jLabel43,jLabel44,jLabel45,jLabel46,jLabel47,jLabel48,jLabel49,jLabel50,jLabel51,jLabel52,jLabel53,jLabel54,jLabel55,jLabel56};
            for (int i = 0; i < 13; i++) {
            j1[i].setIcon(p1.get(i));
            j2[i].setIcon(p2.get(i));
            j3[i].setIcon(p3.get(i));
            j4[i].setIcon(p4.get(i));
        }
//=========================================================================
        //while(true){
            //COMPUTER GET MA
            player2.getMaJiang(ShuffleMaJiang.maindex);
            p2= player2.printMaJiangs();
            for (int i = 0; i < 14; i++) {
            j2[i].setIcon(p2.get(i));
            }
            //NO 14
            jLabel123.setIcon(p2.get(1));
            //OUT MA
            player2.discardMaJiang(1);
            //THROW MA
            //========
            ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
            j2[13].setIcon(no);
            //=========
             p2= player2.printMaJiangs();
            for (int i = 0; i < 13; i++) {
            j2[i].setIcon(p2.get(i));
        }
//PLAYER1
            if (shm.ma.size()==0) {
                System.out.println("【NO ONE WIN】");
                System.out.println("【GAMEOVER】");
                System.exit(0);    
                   }    
    }

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel98.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel98.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel99.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel99.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel100.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel100.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel101.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel101.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel102.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel102.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel103.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel103.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel104.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel104.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel105.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel105.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel106.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel106.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel107.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel107.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel108.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel108.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel109.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel109.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel110.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jLabel110.setText("P1");
        jLabel110.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 63));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 63));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 63));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 63));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel5.setPreferredSize(new java.awt.Dimension(50, 63));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 63));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel7.setPreferredSize(new java.awt.Dimension(50, 63));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel8.setPreferredSize(new java.awt.Dimension(50, 63));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel9.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel9.setPreferredSize(new java.awt.Dimension(50, 63));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel10.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel10.setPreferredSize(new java.awt.Dimension(50, 63));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel11.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel11.setPreferredSize(new java.awt.Dimension(50, 63));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel12.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel12.setPreferredSize(new java.awt.Dimension(50, 63));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel13.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel13.setPreferredSize(new java.awt.Dimension(50, 63));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel14.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel14.setPreferredSize(new java.awt.Dimension(50, 63));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel15.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel15.setPreferredSize(new java.awt.Dimension(50, 63));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel16.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel16.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel17.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel17.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel18.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel18.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel19.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel19.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel20.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel20.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel21.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel21.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel22.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel22.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel23.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel23.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel24.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel24.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel25.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel25.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel26.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel26.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel27.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel27.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel28.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel28.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel29.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel29.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel30.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel30.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel31.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel31.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel32.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel32.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel33.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel33.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel34.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel34.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel35.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel35.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel36.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel36.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel37.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel37.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel38.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel38.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel39.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel39.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel40.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel40.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel41.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel41.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel42.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel42.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel43.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel43.setPreferredSize(new java.awt.Dimension(50, 63));
        jLabel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel43MouseClicked(evt);
            }
        });

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel44.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel44.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel45.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel45.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel46.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel46.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel47.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel47.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel48.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel48.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel49.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel49.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel50.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel50.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel51.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel51.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel52.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel52.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel53.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel53.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel54.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel54.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel55.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel55.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel56.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel56.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel57.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jLabel57.setText("PLAYER ");
        jLabel57.setToolTipText("");

        jLabel58.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jLabel58.setText("COM3");
        jLabel58.setToolTipText("");

        jLabel59.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jLabel59.setText("COM2");
        jLabel59.setToolTipText("");

        jLabel60.setFont(new java.awt.Font("SimSun", 0, 24)); // NOI18N
        jLabel60.setText("COM1");
        jLabel60.setToolTipText("");

        jLabel61.setText("吃碰槓");

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel62.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel62.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel63.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel63.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel64.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel64.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel65.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel65.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel66.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel66.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel67.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel67.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel68.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel68.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel71.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel71.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel72.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel72.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel73.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel73.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel74.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel74.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel75.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel75.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel69.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel69.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel76.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel76.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel77.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel77.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel78.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel78.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel79.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel79.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel80.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel80.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel81.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel81.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel83.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel83.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel84.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel84.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel85.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel85.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel86.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel86.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel87.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel87.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel88.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel88.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel89.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel89.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel90.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel90.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel70.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel70.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel82.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel82.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel91.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel91.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel92.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel92.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel93.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel93.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel94.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel94.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel95.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel95.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel96.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel96.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel97.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel97.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel111.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel111.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel112.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel112.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel113.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel113.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel114.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel114.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel115.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel115.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel116.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel116.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel117.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel117.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel118.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel118.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel119.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel119.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel120.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel120.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel121.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel121.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel122.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel122.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1SUO.png"))); // NOI18N
        jLabel123.setMaximumSize(new java.awt.Dimension(50, 63));
        jLabel123.setPreferredSize(new java.awt.Dimension(50, 63));

        jLabel124.setText("打出的牌");

        jButton1.setText("槓");
        jButton1.setActionCommand("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("碰");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel57))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(2, 2, 2)
                                                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(56, 56, 56))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel123, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel124)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(130, 130, 130))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel120, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel119, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel118, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel117, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel116, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel115, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel114, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel113, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel112, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel122, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel121, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel95, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel94, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel92, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel91, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel89, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel88, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel97, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel96, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel79, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel78, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel87, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel86, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(118, 118, 118)
                                                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    var  a=  player1.ponCards();
        jLabel71.setIcon(a);
        jLabel72.setIcon(a);
         JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
           p1= player1.printMaJiangs();
          
           for (int i = 0; i < 13; i++) {
         try{
               var t= p1.get(i);
                j1[i].setIcon(p1.get(i));
         }
         catch (Exception e){
             ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
                j1[i].setIcon(no);
            }
         }
           
             
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
             JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
             JLabel[] j2={jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28};
              JLabel[] j3={jLabel29,jLabel30,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,jLabel41,jLabel42};
             System.out.println("SAAAAAD");
            
            player1.getMaJiang(0); 
               System.out.println("SAAAAAc");
            player1.discardMaJiang(0);
  
 
            
            jLabel123.setIcon(p1.get(0));
            p1= player1.printMaJiangs();

            for (int i = 0; i < 13; i++) {
             j1[i].setIcon(p1.get(i));
            }
            //========
            ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
            j1[13].setIcon(no);
            //=========
 
            
           
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel43MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel43MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
          JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
             JLabel[] j2={jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28};
              JLabel[] j3={jLabel29,jLabel30,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,jLabel41,jLabel42};
             System.out.println("SAAAAAD");
            
            player1.getMaJiang(0); 
               System.out.println("SAAAAAc");
            player1.discardMaJiang(1);
  
 
            
            jLabel123.setIcon(p1.get(1));
            p1= player1.printMaJiangs();

            for (int i = 0; i < 13; i++) {
             j1[i].setIcon(p1.get(i));
            }
            //========
            ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
            j1[13].setIcon(no);
            //=========
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
                    JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
             JLabel[] j2={jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28};
              JLabel[] j3={jLabel29,jLabel30,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,jLabel41,jLabel42};
             System.out.println("SAAAAAD");
            
            player1.getMaJiang(0); 
               System.out.println("SAAAAAc");
            player1.discardMaJiang(2);
  
 
            
            jLabel123.setIcon(p1.get(2));
            p1= player1.printMaJiangs();

            for (int i = 0; i < 13; i++) {
             j1[i].setIcon(p1.get(i));
            }
            //========
            ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
            j1[13].setIcon(no);
            //=========
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
                    JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
             JLabel[] j2={jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28};
              JLabel[] j3={jLabel29,jLabel30,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,jLabel41,jLabel42};
             System.out.println("SAAAAAD");
            
            player1.getMaJiang(0); 
               System.out.println("SAAAAAc");
            player1.discardMaJiang(3);
  
 
            
            jLabel123.setIcon(p1.get(3));
            p1= player1.printMaJiangs();

            for (int i = 0; i < 13; i++) {
             j1[i].setIcon(p1.get(i));
            }
            //========
            ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
            j1[13].setIcon(no);
            //=========
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
                    JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
             JLabel[] j2={jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28};
              JLabel[] j3={jLabel29,jLabel30,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,jLabel41,jLabel42};
             System.out.println("SAAAAAD");
            
            player1.getMaJiang(0); 
               System.out.println("SAAAAAc");
            player1.discardMaJiang(4);
  
 
            
            jLabel123.setIcon(p1.get(4));
            p1= player1.printMaJiangs();

            for (int i = 0; i < 13; i++) {
             j1[i].setIcon(p1.get(i));
            }
            //========
            ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
            j1[13].setIcon(no);
            //=========
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
                    JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
             JLabel[] j2={jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28};
              JLabel[] j3={jLabel29,jLabel30,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,jLabel41,jLabel42};
             System.out.println("SAAAAAD");
            
            player1.getMaJiang(0); 
               System.out.println("SAAAAAc");
            player1.discardMaJiang(5);
  
 
            
            jLabel123.setIcon(p1.get(5));
            p1= player1.printMaJiangs();

            for (int i = 0; i < 13; i++) {
             j1[i].setIcon(p1.get(i));
            }
            //========
            ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
            j1[13].setIcon(no);
            //=========
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
                    JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
             JLabel[] j2={jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28};
              JLabel[] j3={jLabel29,jLabel30,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,jLabel41,jLabel42};
             System.out.println("SAAAAAD");
            
            player1.getMaJiang(0); 
               System.out.println("SAAAAAc");
            player1.discardMaJiang(6);
  
 
            
            jLabel123.setIcon(p1.get(6));
            p1= player1.printMaJiangs();

            for (int i = 0; i < 13; i++) {
             j1[i].setIcon(p1.get(i));
            }
            //========
            ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
            j1[13].setIcon(no);
            //=========
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
                    JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
             JLabel[] j2={jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28};
              JLabel[] j3={jLabel29,jLabel30,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,jLabel41,jLabel42};
             System.out.println("SAAAAAD");
            
            player1.getMaJiang(0); 
               System.out.println("SAAAAAc");
            player1.discardMaJiang(7);
  
 
            
            jLabel123.setIcon(p1.get(7));
            p1= player1.printMaJiangs();

            for (int i = 0; i < 13; i++) {
             j1[i].setIcon(p1.get(i));
            }
            //========
            ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
            j1[13].setIcon(no);
            //=========
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
                    JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
             JLabel[] j2={jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28};
              JLabel[] j3={jLabel29,jLabel30,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,jLabel41,jLabel42};
             System.out.println("SAAAAAD");
            
            player1.getMaJiang(0); 
               System.out.println("SAAAAAc");
            player1.discardMaJiang(8);
  
 
            
            jLabel123.setIcon(p1.get(8));
            p1= player1.printMaJiangs();

            for (int i = 0; i < 13; i++) {
             j1[i].setIcon(p1.get(i));
            }
            //========
            ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
            j1[13].setIcon(no);
            //=========
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
                    JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
             JLabel[] j2={jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28};
              JLabel[] j3={jLabel29,jLabel30,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,jLabel41,jLabel42};
             System.out.println("SAAAAAD");
            
            player1.getMaJiang(0); 
               System.out.println("SAAAAAc");
            player1.discardMaJiang(9);      
            jLabel123.setIcon(p1.get(9));
            p1= player1.printMaJiangs();

            for (int i = 0; i < 13; i++) {
             j1[i].setIcon(p1.get(i));
            }
            //========
            ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
            j1[13].setIcon(no);
            //=========
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
                    JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
             JLabel[] j2={jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28};
              JLabel[] j3={jLabel29,jLabel30,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,jLabel41,jLabel42};
             System.out.println("SAAAAAD");
            
            player1.getMaJiang(0); 
               System.out.println("SAAAAAc");
            player1.discardMaJiang(10);
  
 
            
            jLabel123.setIcon(p1.get(10));
            p1= player1.printMaJiangs();

            for (int i = 0; i < 13; i++) {
             j1[i].setIcon(p1.get(i));
            }
            //========
            ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
            j1[13].setIcon(no);
            //=========
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
                    JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
             JLabel[] j2={jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28};
              JLabel[] j3={jLabel29,jLabel30,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,jLabel41,jLabel42};
             System.out.println("SAAAAAD");
            
            player1.getMaJiang(0); 
               System.out.println("SAAAAAc");
            player1.discardMaJiang(11);
  
 
            
            jLabel123.setIcon(p1.get(11));
            p1= player1.printMaJiangs();

            for (int i = 0; i < 13; i++) {
             j1[i].setIcon(p1.get(i));
            }
            //========
            ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
            j1[13].setIcon(no);
            //=========
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
             JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
             JLabel[] j2={jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28};
              JLabel[] j3={jLabel29,jLabel30,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,jLabel41,jLabel42};
             System.out.println("SAAAAAD");
            
            player1.getMaJiang(0); 
               System.out.println("SAAAAAc");
            player1.discardMaJiang(12);
  
 
            
            jLabel123.setIcon(p1.get(12));
            p1= player1.printMaJiangs();

            for (int i = 0; i < 13; i++) {
             j1[i].setIcon(p1.get(i));
            }
            //========
            ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
            j1[13].setIcon(no);
            //=========
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
                    JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
             JLabel[] j2={jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28};
              JLabel[] j3={jLabel29,jLabel30,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,jLabel41,jLabel42};
             System.out.println("SAAAAAD");
            
            player1.getMaJiang(0); 
               System.out.println("SAAAAAc");
            player1.discardMaJiang(0);
  
 
            
            jLabel123.setIcon(p1.get(0));
            p1= player1.printMaJiangs();

            for (int i = 0; i < 13; i++) {
             j1[i].setIcon(p1.get(i));
            }
            //========
            ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
            j1[13].setIcon(no);
            //=========
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
                            JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
             JLabel[] j2={jLabel15,jLabel16,jLabel17,jLabel18,jLabel19,jLabel20,jLabel21,jLabel22,jLabel23,jLabel24,jLabel25,jLabel26,jLabel27,jLabel28};
              JLabel[] j3={jLabel29,jLabel30,jLabel31,jLabel32,jLabel33,jLabel34,jLabel35,jLabel36,jLabel37,jLabel38,jLabel39,jLabel40,jLabel41,jLabel42};
             System.out.println("SAAAAAD");
            
            player2.getMaJiang(0); 
               System.out.println("SAAAAAc");
            player2.discardMaJiang(0);
  
 
            
            jLabel123.setIcon(p2.get(0));
            p2= player2.printMaJiangs();

            for (int i = 0; i < 13; i++) {
             j2[i].setIcon(p2.get(i));
            }
            //========
            ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
            j2[13].setIcon(no);
            //=========
    }//GEN-LAST:event_jLabel15MouseClicked

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Game().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
                }
 
          
               
          
            
            
            
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    // End of variables declaration//GEN-END:variables

   
  
}
// class sa  extends Game implements ActionListener  {
//    public void actionPerformed(ActionEvent e){
//          int count=0;
//             JLabel[] j1={jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9,jLabel10,jLabel11,jLabel12,jLabel13,jLabel14};
//             for (JLabel jb : j1) {
//            if(e.getSource()==jb){
//            System.out.println("SAAAAAD");
//            player1.discardMaJiang(count);
//            break;
//            }
//            count++;
//        }
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//   }