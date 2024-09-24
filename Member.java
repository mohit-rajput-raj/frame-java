/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atsystem;

/**
 *
 * @author 91992
 */
public class Member{
    int id;
    String name;
    Member(int id, String name){
        this.name = name;
        this.id = id;

    }
    void setName(String n){
        name = n;
    }
    void setId(int i){
        id = i;
    }
}
