/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majiang;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import majiang.MaJiang;
import majiang.MaJiangbuilder;


 /*
 * @author a0414
 */
public class MaJiang {
    //type 萬條索123
    //type 東南西北中發白4 5 6 7 8 9 10
    private int type;
    private int number;
    private ImageIcon icon; 
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
      
      public ImageIcon toStringwind(){
        //字牌
        switch (this.getType()) {
        case 4:
            icon = new ImageIcon("EAST.png");
            break;
            
        case 5:
            icon = new ImageIcon("SOUTH.png");
            break;
        case 6:
             icon = new ImageIcon("WEST.png");
             break;
        case 7:
             icon = new ImageIcon("NORTH.png");         
             break;
        case 8:
            icon = new ImageIcon("REDMID.png");
            break;
        case 9:
             icon = new ImageIcon("Fortune.png");       
             break;
        case 10:
            icon = new ImageIcon("WHITE.png"); 
            break;
        }
        return icon;
    }
    
    public ImageIcon toStringnumber() {
        //數字牌  
        switch (this.getType()) {
        case 1:
            icon = new ImageIcon(String.valueOf(this.getNumber())+"WAN.png");
            break;
        case 2:
            icon = new ImageIcon(String.valueOf(this.getNumber())+"SUO.png");
            break;
        case 3:
            icon = new ImageIcon(String.valueOf(this.getNumber())+"TONG.png");
            break;
        }
        return icon;
        
    }
 

    @Override
    public String toString() {
        return "MaJiang{" + "type=" + type + ", number=" + number + ", icon=" + icon + '}';
    }
   

   

    
    
}
