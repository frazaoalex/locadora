
package locadora;
import java.util.ArrayList;

public class Locacao {
    private int numLocacao;
    private ArrayList<Socio> listSocios = new ArrayList<>();
    private ArrayList<Copia> listCopias = new ArrayList<>();
    
    public Locacao() {}

    public Locacao(int numLocacao, Socio s) {
        this.numLocacao = numLocacao;
        this.listSocios.add(s);
    }

    public int getNumLocacao() {
        return numLocacao;
    }

    public void setNumLocacao(int numLocacao) {
        this.numLocacao = numLocacao;
    }

    public ArrayList<Socio> getSocio() {
        return listSocios;
    }

    public void adicionarSocio(Socio s) {
        this.listSocios.add(s);
    }
    public void listarSocios(){
        for(Socio s : listSocios){
            System.out.println(s);
        }
    }
    public ArrayList<Copia> getCopia(){
        return listCopias;
    }    
    public void adicionarCopia(Copia c){
        this.listCopias.add(c);
    }
    public void listarCopias(){
        for(Copia c : listCopias){
            System.out.println(c);
        }
    }
}
