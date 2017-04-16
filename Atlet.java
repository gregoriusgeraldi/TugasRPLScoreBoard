/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Atlet {
    
    private String name;
    private int age;
    private int weight;
    private String nationality;

    public Atlet(String name,int age,int weight,String nationality) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getWeight() {
        return weight;
    }
}
