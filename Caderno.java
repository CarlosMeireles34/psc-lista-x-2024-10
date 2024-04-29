package Models;
public class Caderno {
    private String folhas ;
    private String pautas;
    private String capas;

    public Caderno(String folhas, String pautas, String capas) {
        this.folhas = folhas;
        this.pautas =pautas ;
        this.capas =capas;
    }

        public Caderno(){
            // recebendo get set comandos
            //pode parecer simples mas serve como aprendizado
        }

        public String getFolhas() {
            return folhas;
        }
        public void  setFolhas(String  folhas){
            this.folhas =folhas ;
        }
        public String getPautas() {
            return pautas;
        }
        public void  setPautas(String  pautas){
            this.pautas = pautas;
        }
        public String getCapas() {
            return capas;
        }
        public void  setCapas(String capas){
            this.capas = capas;
        }
}
