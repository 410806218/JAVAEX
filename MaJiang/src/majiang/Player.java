/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majiang;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;

/**
 *
 * @author a0414
 */
public class Player {
     private String name;
     private ArrayList<MaJiang> playerma=new ArrayList<MaJiang>();
     private int playermaindex=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MaJiang> getPlayerma() {
        return playerma;
    }

    public void setPlayerma(ArrayList<MaJiang> playerma) {
        this.playerma = playerma;
    }

    public int getPlayermaindex() {
        return playermaindex;
    }

    public void setPlayermaindex(int playermaindex) {
        this.playermaindex = playermaindex;
    }
       public void getMaJiang(int index){ 
        playerma.add(playermaindex, ShuffleMaJiang.ma.get(index));
        playermaindex++;
       
        ShuffleMaJiang.ma.remove(index); 
        
    }
    public MaJiang discardMaJiang(int index){
        if ((index>playerma.size()) || (index<0)) {
            System.out.println("NO");
            return null;
        }
        //GET MA FROM SELF TO RIVER
        ShuffleMaJiang.river.add(ShuffleMaJiang.rvindex, playerma.get(index));
        ShuffleMaJiang.rvindex++;
        //自己的-1
        playerma.remove(index);
        playermaindex--;
       return playerma.get(index);
    }
       public ImageIcon ponCards(){
        //得到 River的最後一張(剛剛打的)
        MaJiang riverLastJiang = ShuffleMaJiang.river.get(ShuffleMaJiang.rvindex-1);
        //檢查兩張
        int freq = 0;
    
        int d1=99;
        int d2=99;
        int count=0;
           for (MaJiang maJiang : playerma) {
              
               if(maJiang.getNumber()== riverLastJiang.getNumber()&&maJiang.getType()==riverLastJiang.getType()){
                   System.out.println("aaa");
                   if(d1==99){
                       d1=count;
                   }
                 else  if(d1!=99&&d2==99){
                       d2=count;
                   }
                   freq++;
               }
               count++;
           }
           System.out.println(freq);
           System.out.println(riverLastJiang);
           System.out.println(playerma);
        if (freq>=2) {
            System.out.println("【碰】");
            //把碰的牌移除
            System.out.println("d1:"+d1);
            System.out.println("d2:"+d2);
             this.discardMaJiang(d1);
             this.discardMaJiang(d2-1);
            ShuffleMaJiang.rvindex--;
            ShuffleMaJiang.river.remove(ShuffleMaJiang.rvindex-1);
            if(riverLastJiang.getType()<4){
            return riverLastJiang.toStringnumber();
            }
            else{
                 return riverLastJiang.toStringwind();
                }
            
        }else {
            System.out.println("【NO】");
        }
         ImageIcon no=new ImageIcon("U+1F02B_MJback.png");
            return no;
       }
        public void barCards(){
            //get river
        MaJiang riverLastJiang = ShuffleMaJiang.river.get(ShuffleMaJiang.rvindex-1);
   
       int freq =0;
        for (MaJiang maJiang : playerma) {
               if(maJiang.getNumber()== riverLastJiang.getNumber()&&maJiang.getType()==riverLastJiang.getType()){
                   System.out.println("aaa");
                   freq++;
               }
           }
        if (freq>=3) {
            System.out.println("【杠】");
            //把杠的牌移除
            playerma.remove(riverLastJiang);
            playerma.remove(riverLastJiang);
            playerma.remove(riverLastJiang);
            playermaindex--;
            playermaindex--; 
            playermaindex--;
            
            return;
        }else {
            System.out.println("【NO】");
        }
    } 

    


  public ArrayList<ImageIcon> printMaJiangs(){
       ArrayList<ImageIcon> p=new ArrayList<ImageIcon>();
      int count=0;
        for (MaJiang maJiang : playerma) {
            
            int type = maJiang.getType();
            
         
            if (type<=3) {
                MaJiang maJiangNumber=maJiang;
                p.add(maJiangNumber.toStringnumber());
                
            
            }else {
                MaJiang maJiangWind=maJiang;
                 p.add(maJiangWind.toStringwind());
            }
        }
        return p;
    }
  

}
