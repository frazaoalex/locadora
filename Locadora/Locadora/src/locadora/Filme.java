
package locadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Filme {
    private String titulo;
    private String duracao;
    private String lancamento;
    private String formato;
    private String atores;
    private ArrayList<Copia> listCopias = new ArrayList<>();
            
    Filme(String titulo, String duracao, String lancamento, String formato, String atores, Copia c){
        this.titulo = titulo;
        this.duracao = duracao;
        this.lancamento = lancamento;
        this.formato = formato;
        this.atores = atores;
        this.listCopias.add(c);
    }
    Filme(){
        
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getDuracao(){
        return duracao;
    }
    public void setDuracao(String duracao){
        this.duracao = duracao;
    }
    public String getLancamento(){
        return lancamento;
    }
    public void setLancamento(String lancamento){
        this.lancamento = lancamento;
    }
    public String getFormato(){
        return formato;
    }
    public void setFormato(String formato){
        this.formato = formato;
    }
    public String getAtores(){
        return atores;
    }
    public void setAtores(String atores){
        this.atores = atores;
    }
    public ArrayList<Copia> getCopia(){
        return this.listCopias;
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
