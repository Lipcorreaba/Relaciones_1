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
public class Faculty extends Employee{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      Aqui se creara un elemento Faculty que la vez creara un
//      elemento Employee y este a su vez creara un elemento
//      Person ya que cada clase descendiente llama al contructor de la clase
//      padre para asi tener sus atributos
        new Faculty();
    }
    public Faculty(){
        System.out.println("Performs Person's tasks ");
    }
    
}
