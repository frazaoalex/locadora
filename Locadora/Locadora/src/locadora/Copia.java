
package locadora;

import java.util.ArrayList;

public class Copia {
    private int numero;
    private ArrayList<Filme> listFilme = new ArrayList<>();  
    private ArrayList<Locacao> listLocacoes = new ArrayList<>();  
    
    Copia(int numero, Filme f, Locacao l){
        this.numero = numero;
        this.listFilme.add(f);
        this.listLocacoes.add(l);
    }
    Copia(){
        
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public ArrayList<Filme> getFilme() {
	return this.listFilme;
    }

    public void adicionarFilme(Filme f) {
	this.listFilme.add(f);
    }
	
    public void listarFilmes(){
	for (Filme f : listFilme) {
	    System.out.println(f);
        }
    }
    public ArrayList<Locacao> getLocacao(){
        return listLocacoes;
    }
    public void adicionarLocacao(Locacao l){
        this.listLocacoes.add(l);
    }
    public void listarLocacoes(){
        for(Locacao l : listLocacoes){
            System.out.println(l);
        }
    }
    //public void cadastraCopia(Copia c){ }
}
