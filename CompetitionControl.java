/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class CompetitionControl {

    private Atlet[] athlete;
    private String tournamentClass;
    private int[] snatch;
    private int[] cleanAndJerk;
    private int altetKeBerapa;
    //private Clock clock;
    //private AthleteControl ac;
    //private DesicionControl dc;

    public CompetitionControl(String tournamentClass, int jumlahAtlet) {
        this.athlete = new Atlet[jumlahAtlet];
        this.tournamentClass = tournamentClass;
        this.snatch = new int[3];
        this.cleanAndJerk = new int[3];
        // clock,atlet control, desicion control inisialisasi di sini
    }

    public void setWeight(int w1, int w2, int w3, String methode,int atletKeBerapa) {
        startTime();
        if (methode.equalsIgnoreCase("cleanAndJerk")) {
            this.cleanAndJerk[0] = w1;
            this.cleanAndJerk[1] = w2;
            this.cleanAndJerk[2] = w3;
        } else {
            this.snatch[0] = w1;
            this.snatch[1] = w2;
            this.snatch[2] = w3;
        }
        stopTime();
        calculatePoint(atletKeBerapa);
    }
    private void startTime(){
        
    }
    private void stopTime(){
        
    }
    private void calculatePoint(int atletKeBerapa){
        int score = 0;
        //perhitungan score di sini
        this.athlete[atletKeBerapa].plusScore(score);
    }
    public void match(int num){
        
    }
    private void sortAtlet() {
        int scorelength = athlete.length;
        quicksort(0, scorelength - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        int pivot = athlete[low + (high - low) / 2].getScore();
        while (i <= j) {
            while (athlete[i].getScore() < pivot) {
                i++;
            }
            while (athlete[j].getScore() > pivot) {
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
        int temp = athlete[i].getScore();
        athlete[i].getScore() = athlete[j].getScore();
        athlete[j].getScore() = temp;
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
    public Atlet[] giveAtletOrder(){
        return this.athlete;
    }
}
