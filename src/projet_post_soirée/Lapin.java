/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_post_soirée;

/**
 *
 * @author Marc
 */
public class Lapin {
    
    private String name;
    private int age;

    public Lapin(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void Scream(){
        System.out.println("WAZAAAAAAAAAAAAAAA");
    }
    
    
}
