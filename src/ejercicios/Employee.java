/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Usuario
 */
public class Employee extends Person{
    public Employee(){
        this("Invoke Employee's ");
        System.out.println("Performs Person's tasks ");
    }
    public Employee(String s){
        System.out.println(s);
    }
}
