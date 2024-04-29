package Models;
public class Computador {
    private String tela ;
    private String cpu ;
    private String teclado;

    public Computador(String tela , String cpu, String teclado) {
        this.tela = tela;
        this.cpu =cpu ;
        this.teclado =teclado;
    }

        public Computador(){
            // recebendo get set comandos
            //pode parecer simples mas serve como aprendizado pequeno gafonhoto
        }

        public String getTela() {
            return tela;
        }
        public void  setTela(String tela){
            this.tela =tela ;
        }
        public String getCpu() {
            return cpu;
        }
        public void  setCpu(String cpu ){
            this.cpu = cpu;
        }
        public String getTeclado() {
            return teclado;
        }
        public void  setTeclado(String teclado ){
            this.teclado = teclado;
        }
}
