/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author yahya
 */
import java.io.Serializable;

public class Salle implements Serializable{

    private int id;
    private String code;
 

    public Salle() {
    }

    public Salle(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCod() {
        return code;
    }

    public void setCod(String code) {
        this.code = code;
    }

   
    @Override
    public String toString() {
        return  code ;
    }

}
