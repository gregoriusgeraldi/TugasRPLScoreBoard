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
    
// masih salah kayanya ga paham
     public boolean isRefreeGiveDecision(){
        Boolean[] check = new Boolean[refreeCount];
        for (int i = 0; i < 10; i++) {
            check[i] = refree[i];
        }
        for (int i = 0; i < refree.length; i++) {
            if (check[i] == null) {
                return false;
            }else{
                return true;
            }
        }
        return true;
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
