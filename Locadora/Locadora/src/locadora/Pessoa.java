
package locadora;


public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String RG;
    private String CPF;
    private String dataAdesao;

    Pessoa() {
        
    }
    Pessoa(String nome, String endereco, String telefone, 
            String RG, String CPF, String dataAdesao) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.RG = RG;
        this.CPF = CPF;
        this.dataAdesao = dataAdesao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDataAdesao() {
        return dataAdesao;
    }

    public void setDataAdesao(String dataAdesao) {
        this.dataAdesao = dataAdesao;
    }
    
    
}
