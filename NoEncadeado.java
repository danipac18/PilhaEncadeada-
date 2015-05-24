
package PilhaEncadeda;

/**
 *
 * @author Danielle
 */
public class NoEncadeado 
{
   int valor;
    NoEncadeado ponteiro;

    public NoEncadeado(int valor, NoEncadeado ponteiro) {
        this.valor = valor;
        this.ponteiro = ponteiro;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NoEncadeado getPonteiro() {
        return ponteiro;
    }

    public void setPonteiro(NoEncadeado ponteiro) {
        this.ponteiro = ponteiro;
    }
    
}
