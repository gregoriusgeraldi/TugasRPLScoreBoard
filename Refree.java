/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombol;

/**
 *
 * @author Lenovo Iyoss
 */
public class Refree implements Keypad{
    boolean[] refree;
    int refreeCount;

    public Refree(int count) {
        this.refreeCount = count;
        refree = new boolean[count];
    }
    
    //masih salah gatau fungsinya
     public boolean isRefreeGiveDecision(){
         if (greenButton()) {
             return true;
         }
         else if(redButton()){
             return false;
         }
         return false;
    }
    
    public boolean getCompDecFromRefree(){
        int temp = 0;
        int persen = 100;
        int a = 100 / refree.length;
        
        for (int i = 0; i < refree.length; i++) {
            if (refree[i] == true) {
                temp++;
            }
        }
         int b = refree.length - temp; 
         int c = a * b;
         int res = 100 - c;
         
         if (res>=50) {
            return true;
        }else{
             return false;
         }
    }
    

    @Override
    public boolean greenButton() {
       return true;
    }

    @Override
    public boolean redButton() {
       return false;
    }
    
}
