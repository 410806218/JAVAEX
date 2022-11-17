/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majiang;

/**
 *
 * @author a0414
 */

    public class MaJiangbuilder extends MaJiang {
//制造單張麻將
    public MaJiang createsingalMaJiang(int type){
           if(type<3){
               //數字牌
                 MaJiang a=new MaJiang();
                 a.toStringnumber();
                 a.setType(type);
                 return a;
           }
           else{
               //字牌
                 MaJiang a=new MaJiang();
                 a.toStringwind();
                 a.setType(type);
                  return a;
           }
       
          
       }
}
