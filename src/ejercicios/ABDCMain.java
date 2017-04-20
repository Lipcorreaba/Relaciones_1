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
public class ABDCMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        G[] elements = {new G(),new F(),new H(),new E()};
//        Cuando i=0 el elemento que lee es de clase G
//        y lo que muestra es G, G 1 y G 2
//        Cuando i=1 el elemento que lee es de clase F
//        el metodo 1 fue sobreescrito por lo que es el unico cambio
//        en compracion con el elemento G
//        Con i=2 el elemento que lee es de clase H el cual extiende la clase E
//        que a su vez extiende la clase F, ademas sobreescribe el metodo 2 por
//        lo que mostrara: F, H 1, E 2 y H 1
//        Con i=3 el elemento que lee es de clase E y como se dijo antes extiende
//        la clase F y sobreescribe el metodo 2 y mostrara: F, G 1, E 2 y G 1  
        for(int i=0; i<elements.length;i++){
            System.out.println(elements[i]);
            elements[i].method1();
            elements[i].method2();
            System.out.println();
        }
    }
    
}
