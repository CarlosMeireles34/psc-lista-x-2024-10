package Models;
public class CartaoBanco {
    private String chips;
    private String cor;
    private String targeta;

    public CartaoBanco(String chip, String cor, String targeta) {
        this.chips = chips;
        this.cor = cor;
        this.targeta = targeta;
    }

        public CartaoBanco(){
            // recebendo get set comandos
            //pode parecer simples mas serve como aprendizado
        }

        public String getChips() {
            return chips ;
        }
        public void  setChips(String chips ){
            this.chips= chips;
        }
        public String getCor(){
            return cor;
        }
        public void  setCor(String cor){
            this.cor = cor;
        }
        public String getTargeta(){
            return targeta ;
        }
        public void  setTargeta(String targeta){
            this.targeta =targeta ;
    }
}

