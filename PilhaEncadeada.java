
package pilhaencadeada.PilhaEncadeada;

/**
 *
 * @author Danielle
 */

public class PilhaEncadeada 
{

   
    public static void main(String[] args) 
    {
        pilha x = new pilha();
        x.criarPilha(10);
        x.pop();
        System.out.println(x.tamanho());
        System.out.println(x.eVazia());
        x.push(10);
        x.pop();
        
        
    }
    
}
