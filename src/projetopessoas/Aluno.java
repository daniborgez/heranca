
package projetopessoas;

public class Aluno extends Pessoas {
   //Atributos
   private int matr;
   private String curso;
   
   //Metodos personalizados
    public void CancelarMatr(){
        System.out.println("Matricula sera cancelada");
        this.matr = 0;
    }
    //Metodos Especiais 

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
