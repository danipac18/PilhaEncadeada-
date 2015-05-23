
package ;

/**
 *
 * @author Danielle
 */
public interface interfacePilhaEncadeada 
{    
    void criarPilha (int tamanho);
    boolean eVazia ();
    int tamanho();
    void limpar();
    No push (int valor);
    No pop ();
    int pegarTopo();
    void listar ();
    
}
