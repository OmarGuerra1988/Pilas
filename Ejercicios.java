/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Stack;
/**
 *
 * @author daniel
 */
public class Ejercicios {
     Stack pila = new Stack();
    public void pilas()
    {
        
        pila.push(24);
        pila.push(333);
        pila.push("hola");
        pila.push("bye bye");
        
        System.out.println("tamaño de pila "+pila.size());
        System.out.println("cima = ultimo ingresado "+pila.peek());
        System.out.println("posicion de elemento "+pila.search("hola"));
        System.out.println("quitar elemento "+pila.pop());
        System.out.println("muestra verd si esta vacia f si no"+pila.empty());
        
    }
    void ej_1()
    {
       
        pila.push("cultura chupistica");
        pila.push("sudoku");
        pila.push("puzzle");
        pila.push("syphon filter");
        pila.push("metal slug");
        System.out.println("tamaño de pila "+pila.size());
        System.out.println("cima = ultimo ingresado "+pila.peek());
        System.out.println("posicion de elemento "+pila.search("hola"));
        System.out.println("quitar elemento "+pila.pop());
        System.out.println("vacia o no"+pila.empty());
    }
    
    public void ej_2()
    {
       pila.push(5.5F);
        pila.push(7);
        pila.push(6.3F);
        pila.push(4.5);
        pila.push(5);
        System.out.println("la pila es");
        for(int a=0;a<pila.size();a++)
        {
            System.out.println(pila.get(a));
        }
    }
    void ej_3()
    {
        pila.push(5.5F);
        pila.push(7);
        pila.push(6.3F);
        pila.push(4.5);
        pila.push(5);
        
        for(Object a : pila)
        {
            System.out.println(a);
        }
    }
    void ej_4()
    {
        pila.push("diario de ana frank");
        pila.push("perico trepa por chile");
        pila.push("lobo blanco");
        pila.push("biblia negra");
        pila.push("50 sombras de gray");
        
        while(!pila.empty())
        {
            System.out.println(pila.pop());
        }
            
    }
}
