
package projetopessoas;

public class Funcionario extends Pessoas {
    //Atributos
    private String setor;
    private boolean trabalhando; 
    //Metodo personalizado
    public void mudarTrabalho(){
       this.trabalhando = ! this.trabalhando;
    }
    //Metodos especiais 

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
