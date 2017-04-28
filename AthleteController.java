
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class AthleteController {

    private LinkedList<Atlet> m56kg, m62kg, m69kg, m77kg, m85kg, m94kg, m105kg, m105kgOver,
            f48kg, f53kg, f58kg, f63kg, f69kg, f75kg, f90kg, f90kgOver;

    public void addAthlete(Atlet atlet) {
        int berat = atlet.getWeight();
        if (atlet.getGender()) {
            if (berat <= 56) {
                m56kg.add(atlet);
            } else if (berat <= 62) {
                m62kg.add(atlet);
            } else if (berat <= 69) {
                m69kg.add(atlet);
            } else if (berat <= 77) {
                m77kg.add(atlet);
            } else if (berat <= 85) {
                m85kg.add(atlet);
            } else if (berat <= 94) {
                m94kg.add(atlet);
            } else if (berat <= 105) {
                m105kg.add(atlet);
            } else {
                m105kgOver.add(atlet);
            }
        } else if (berat <= 48) {
            f48kg.add(atlet);
        } else if (berat <= 53) {
            f53kg.add(atlet);
        } else if (berat <= 58) {
            f58kg.add(atlet);
        } else if (berat <= 63) {
            f63kg.add(atlet);
        } else if (berat <= 69) {
            f69kg.add(atlet);
        } else if (berat <= 75) {
            f75kg.add(atlet);
        } else if (berat <= 90) {
            f90kg.add(atlet);
        } else {
            f90kgOver.add(atlet);
        }
    }

    public void deleteAthlete(Atlet atlet) {
        if (atlet.getGender()) {
            if (m56kg.contains(atlet)) {
                m56kg.remove(atlet);
            } else if (m62kg.contains(atlet)) {
                m62kg.remove(atlet);
            } else if (m69kg.contains(atlet)) {
                m69kg.remove(atlet);
            } else if (m77kg.contains(atlet)) {
                m77kg.remove(atlet);
            } else if (m85kg.contains(atlet)) {
                m85kg.remove(atlet);
            } else if (m94kg.contains(atlet)) {
                m94kg.remove(atlet);
            } else if (m105kg.contains(atlet)) {
                m105kg.remove(atlet);
            } else if (m105kgOver.contains(atlet)) {
                m105kgOver.remove(atlet);
            }
        } else if (f48kg.contains(atlet)) {
            f48kg.remove(atlet);
        } else if (f53kg.contains(atlet)) {
            f53kg.remove(atlet);
        } else if (f58kg.contains(atlet)) {
            f58kg.remove(atlet);
        } else if (f63kg.contains(atlet)) {
            f63kg.remove(atlet);
        } else if (f69kg.contains(atlet)) {
            f69kg.remove(atlet);
        } else if (f75kg.contains(atlet)) {
            f75kg.remove(atlet);
        } else if (f90kg.contains(atlet)) {
            f90kg.remove(atlet);
        } else if (f90kgOver.contains(atlet)) {
            f90kgOver.remove(atlet);
        }
    }
}
