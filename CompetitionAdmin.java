/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Itsuka Kotori
 */
public class CompetitionAdmin {

    //private DistributionBox box;
    //private Athlete[] athlete;
    private int[] weight;
    private int[] score;
    private int scorelength;

    CompetitionAdmin(/*DistributionBox box, */int athlete) {
        //this.athlete = new Athlete[athlete];
        //this.box = box;
        this.weight = new int[6];
    }

    public void setWeigth(int w1, int w2, int w3, String methode) {
        if (methode.equalsIgnoreCase("cleanAndJerk")) {
            this.weight[3] = w1;
            this.weight[4] = w2;
            this.weight[5] = w3;
        } else {
            this.weight[0] = w1;
        }
        this.weight[1] = w2;
        this.weight[2] = w3;
    }

//    private boolean getJuryDecision();
//
//    private boolean getRefreeDecision();

    public void stopMatch() {

    }

    public void sortScoreBoard() {
        sort();
    }

    private void sort() {
        scorelength = score.length;
        quicksort(0, scorelength - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        int pivot = score[low + (high - low) / 2];
        while (i <= j) {
            while (score[i] < pivot) {
                i++;
            }
            while (score[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            quicksort(low, j);
        }
        if (i < high) {
            quicksort(i, high);
        }
    }

    private void swap(int i, int j) {
        int temp = score[i];
        score[i] = score[j];
        score[j] = temp;
    }
    
    public void sortAthlete(){
        
    }
    
    public void getTop5(){
        String[] hasil = new String[5];
        for(int i = 0; i<5 ;i++){
//           hasil[i] = athlete.name....
        }
        for(int i = 0;i<5;i++){
            System.out.println(hasil[i]);
        }
    }
    
    public void getTop3(){
        String[] hasil = new String[3];
        for(int i = 0; i<3 ;i++){
//           hasil[i] = athlete.name....
        }
        for(int i = 0;i<3;i++){
            System.out.println(hasil[i]);
        }
    }
    
    public void calculatePoint(){
        //msh blm paham point kalkulasinya
    }
}
