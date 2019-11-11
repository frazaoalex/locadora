
package locadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Socio extends Pessoa{
    Scanner sc = new Scanner(System.in);
    private ArrayList<Locacao> listLocacoes = new ArrayList<>();
    private boolean associado = false;
    public int qtdLocacoes;
            
    public ArrayList<Locacao> getLocacao(){
        return listLocacoes;
    }
    public void adicionarLocacao(Locacao l, int opcao){
        switch(opcao){
            case 1:
                System.out.println("\nQuantas locações deseja inserir? :");
                qtdLocacoes = sc.nextInt();
                for(int i = 1; i <= qtdLocacoes; i++){
                   this.listLocacoes.add(l);
                }
            break;
            case 0:
                System.out.println("NÃO FOI POSSÍVEL REALIZAR A LOCAÇÃO!!\nSócio não está associado à locadodora!");
            break;
            default:System.out.println("OPÇÃO INSERIDA É INVÁLIDA!");
        }   
    }
    public void listarLocacoes(){
        for(Locacao l : listLocacoes){
            System.out.println(l);
        }
    }
    public boolean getAssociado(){
        return associado;
    }
    public void setAssociado(boolean associado){
        this.associado = associado;
    }
}
