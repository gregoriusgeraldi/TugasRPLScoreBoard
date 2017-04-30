
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * TESTER BUAT CLOCK
 * @author user
 */
public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thread t = new Thread(new Clock());
        String s = sc.next();
        if(s.equals("start")){
            t.start();
        }
        String st = sc.next();
        if(st.equals("stop")){
            t.stop();
        }
    }
}
