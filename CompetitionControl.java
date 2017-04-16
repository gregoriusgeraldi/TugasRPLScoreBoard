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

    //private DistributionBox box
    private boolean stage;
    private int[][] weight;

    public CompetitionControl() {
        this.weight = new int[3][3];
        // diisi distributionBox
    }

    public void connectToOperatorAdmin() {
        // connect ke admin
    }

    public void setWeight(int w1, int w2, int w3) {
        if (stage == false) {
            weight[0][0] = w1;
            weight[0][1] = w2;
            weight[0][2] = w3;
            stage = true;
        } else {
            weight[1][0] = w1;
            weight[1][1] = w2;
            weight[1][2] = w3;
            stage = false;
        }
    }
//        public boolean verifyJuriDecision(){
//            return juri.getDecision();
//        }
//        public boolean verifyRefereeDecision(){
//            return referee.getDecision();
//        }
    public void stopMatch(){
        // stop match
    }
}
