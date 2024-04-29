package Models;
public class Aluno {
    private String nome ;
    private String escola ;
    private double presenca;

    public Aluno( String nome , int notas ,  double presenca) {
        this.nome = nome;
        this.escola = escola ;
        this.presenca =presenca;
    }

        public Aluno (){
            // recebendo get set comandos
            //pode parecer simples mas serve como aprendizado
        }

        public String getNome() {
            return nome ;
        }
        public void  setNome(String nome){
            this.nome =nome ;
        }
        public double getPresenca() {
            return presenca;
        }
        public void  setPresenca(double presenca){
            this.presenca = presenca;
        }
        public String getEscola() {
            return escola;
        }
        public void  setEscola(String escola){
            this.escola = escola;
        }
}
