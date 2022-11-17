/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majiang;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



/**
 *
 * @author a0414
 */
public class ShuffleMaJiang  {
    //所有的牌
    public static ArrayList<MaJiang> ma=new ArrayList<MaJiang>();
    public static int maindex=0;
    //棄牌的牌
    public static ArrayList<MaJiang> river=new ArrayList<MaJiang>();
    public static int rvindex=0;
       public ShuffleMaJiang() throws InterruptedException {
        //創建所有麻將
        createma();
        //洗牌
        swapMaJiangs();
        rvindex=0;
        maindex=135;
    }
     private void createma()  {
         //製造一顆麻將
         MaJiangbuilder mab=new MaJiangbuilder();
         //把製造出來的麻將塞入 所有的牌
         //type 10類
          for (int i = 1; i <= 10 ; i++ ) {
            //type 1 2 3 數字牌
            if (i<=3) {
                for (int j = 1; j <= 9; j++) {
                    //9*4*3
                    for (int k = 1; k <= 4; k++) {
                        MaJiang majiangnumber=new MaJiang();
                        majiangnumber=mab.createsingalMaJiang(i);
                        majiangnumber.setNumber(j);
                        ma.add(maindex, majiangnumber);
                        maindex++;
                    }
                }
            }else {
                for (int k = 1; k <= 4; k++) {
                    MaJiang maJiangword= mab.createsingalMaJiang(i);
                    ma.add(maindex, maJiangword);
                    maindex++;
                }
            }
        }    
          System.out.println();
     }

      
   
        private void swapMaJiangs(){
        Collections.shuffle(ma);
    }
        //開始位置移動
       public void moveMaJiangs(){
         //將起始牌前的排複製到後面
        for (int i = 0; i < maindex; i++) {
            ma.add(ma.size(),ma.get(i));
        }
        //將起始牌前的排移除
        for (int i = 0; i < maindex; i++) {
            ma.remove(i);
        }
        //起始位置移動為0,index歸正
        maindex=0;
    }



}
