
package ;

/**
 *
 * @author Danielle
 */
public class PilhaEncadeada implements interfacePilhaEncadeada 
{

    private int tamanho = 0;
    private NoEncadeado topo;

    @Override
    public void criarPilha() {
       topo = new NoEncadeado(-1, null);
    }

    @Override
    public boolean eVazia() {
        return tamanho > 0;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public void limpar() {
        topo.setPonteiro(null);
    }

    @Override
    public NoEncadeado push(int valor) {
        NoEncadeado elemento = new NoEncadeado(valor, null);
        elemento.setPonteiro(topo.getPonteiro());
       topo.setPonteiro(elemento);
        tamanho++;
        return elemento;
    }

    @Override
    public NoEncadeado pop() {
        NoEncadeado aux = topo.getPonteiro().getPonteiro();
        topo.setPonteiro(topo.getPonteiro().getPonteiro());
        tamanho--;
        return aux;
    }

    @Override
    public int pegarTopo() {
        if (topo.getPonteiro() != null) {
            return topo.getPonteiro().getValor();
        } else {
            return -1;
        }
    }

    @Override
    public void listar() {
        if (eVazia()) {
            NoEncadeado aux = topo.getPonteiro();
            while (aux != null) {
                System.out.println(aux.getValor());
                aux = aux.getPonteiro();
            }
        } else {
            System.out.println("Vazia");
        }
    }

}