
package locadora;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Filme f = new Filme();
        Copia c = new Copia();
        Socio s = new Socio();
        Locacao l = new Locacao();
        
        int numCopia, qtdCopias, qtdLocacoes, qtdCopiasLocadas, opcSocio;
        /* SEÇÃO DE INICIALIZAÇÃO, INFORMANDO DIREÇÃO DO SISTEMA */
        System.out.println("\n -- LOCADORA * SISTEMA DE CONTROLE --: ");
        /* SEÇÃO DE PREENCHIMENTO DOS DADOS DO FILME */
        System.out.println("\n\n -- INFORME ABAIXO OS DADOS DO FILME --: ");
        System.out.println("\nDigite o título do Filme: ");
        f.setTitulo(sc.nextLine());
        System.out.println("\nDuracao hh:mm:ss :");
        f.setDuracao(sc.nextLine());
        System.out.println("\nAno de lancamento : ");
        f.setLancamento(sc.nextLine());
        System.out.println("\nFormato: ");
        f.setFormato(sc.nextLine());
        System.out.println("\nAtores: ");
        f.setAtores(sc.nextLine());
        System.out.println("\nQuantas copias deseja inserir ? :");
        qtdCopias = sc.nextInt();
        for(int i = 1; i <= qtdCopias; i++){
           f.adicionarCopia(c);
        }
        /* SEÇÃO DE PREENCHIMENTO DOS DADOS DA CÓPIA */
        System.out.println("\n\n -- INFORME ABAIXO OS DADOS DA COPIA DO FILME -- ");
        System.out.println("\nInforme o número da copia: ");
        c.setNumero(sc.nextInt());
        c.adicionarFilme(f);
        System.out.println("Informe quantas locações foram realizadas desta cópia: ");
        qtdLocacoes = sc.nextInt();
        for(int i = 1; i <= qtdLocacoes; i++){
            c.adicionarLocacao(l);
        }
         /* SEÇÃO DE PREENCHIMENTO DO SÓCIO DA LOCADORA */
        sc.nextLine();
        System.out.println("\n\n -- INFORME ABAIXO OS DADOS DO SÓCIO -- ");
        System.out.println("\nInforme o nome: ");
        s.setNome(sc.nextLine());
        System.out.println("\nEndereco: ");
        s.setEndereco(sc.nextLine());
        System.out.println("\nTelefone: ");
        s.setTelefone(sc.nextLine());
        System.out.println("\nRG: ");
        s.setRG(sc.nextLine());
        System.out.println("\nCPF: ");
        s.setCPF(sc.nextLine());
        System.out.println("\nData de adesão (dd/mm/yyyy): ");
        s.setDataAdesao(sc.nextLine());
        System.out.println("Sócio informado está associado à locadora ? - DIGITE 1 = SIM, 0 = NÃO");
        opcSocio = sc.nextInt();
        s.adicionarLocacao(l, opcSocio);
        if(opcSocio == 1){
            /* SEÇÃO DE PREENCHIMENTO DA LOCAÇÃO */
            System.out.println("\n\n -- INFORME ABAIXO OS DADOS DA LOCAÇÃO -- ");
            System.out.println("Digite o número da locação: ");
            l.setNumLocacao(sc.nextInt());
            l.adicionarSocio(s);
            System.out.println("Informe quantas cópias foram adquiridas nessa locação: ");
            qtdCopiasLocadas = sc.nextInt();
            for(int i = 1; i <= qtdCopiasLocadas; i++){
                l.adicionarCopia(c);
            }
        }
        /* SEÇÃO DE EXIBIÇÃO DOS DADOS DO FILME */        
        System.out.println("\n\n\n -- DADOS DO FILME * SISTEMA DE CONTROLE --: ");
        System.out.println("Titulo do filme: "+f.getTitulo()+"\nDuração: "+f.getDuracao()
                +"\nAno de lancamento: "+f.getLancamento()+"\nFormato: "+f.getFormato()+
                "\nAtores do filme: "+f.getAtores()+"\nCopias cadastradas: ");
        f.listarCopias();
        /* SEÇÃO DE EXIBIÇÃO DOS DADOS DA CÓPIA */        
        System.out.println("\n\n\n -- DADOS DA COPIA * SISTEMA DE CONTROLE --: ");
        System.out.println("Número da copia: "+c.getNumero()+"\nFilme cadastrado: ");
        c.listarFilmes();
        System.out.println("\nLocações realizadas desta cópia: ");
        c.listarLocacoes();
        /* SEÇÃO DE EXIBIÇÃO DOS DADOS DO SÓCIO */        
        System.out.println("\n\n\n -- DADOS DO SÓCIO * SISTEMA DE CONTROLE --: ");
        System.out.println("Número da copia: "+c.getNumero()+"\nEndereço: "+s.getEndereco()+
                "\nTelefone: "+s.getTelefone()+"\nRG: "+s.getRG()+"\nCPF: "+s.getCPF()
                +"\nData de adesão: "+s.getDataAdesao()+"\nLocações cadastradas: ");
        s.listarLocacoes();
        if(opcSocio == 1){
            /* SEÇÃO DE EXIBIÇÃO DOS DADOS DA LOCAÇÃO */        
            System.out.println("\n\n\n -- DADOS DA LOCAÇÃO * SISTEMA DE CONTROLE --: ");
            System.out.println("Número : "+l.getNumLocacao()+"\nSócio cadastrado: ");
            l.getSocio();
            System.out.println("\nCópias locadas: ");
            l.listarCopias();
        }
        
    }
    
}
