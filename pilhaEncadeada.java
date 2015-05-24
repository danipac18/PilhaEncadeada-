
package PilhaEncadeda ;

/**
 *
 * @author Danielle
 */

public class pilhaEncadeada

{

   
    public static void main(String[] args) 
    {
        PilhaEncadeda pilha = new PilhaEncadeada();
        
        pilha.criarPilha();
        pilha.push(10);
        pilha.listar();
        pilha.push(20);
        pilha.listar();
        pilha.pop();
        pilha.listar();
        pilha.pop();
        pilha.listar();
        
        
        
    }
    
}
