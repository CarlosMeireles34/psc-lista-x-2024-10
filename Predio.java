package Models;
public class Predio {
    private String  apartamentos;
    private String sacadas;
    private String lojas;

    public Predio(String apartamentos , String sacadas, String lojas) {
        this.apartamentos = apartamentos;
        this.sacadas =sacadas ;
        this.lojas =lojas;
    }

        public Predio(){
            // recebendo get set comandos
            //pode parecer simples mas serve como aprendizado
        }

        public String getApartamentos() {
            return apartamentos ;
        }
        public void  setApartamentos(String apartamentos ){
            this.apartamentos =apartamentos ;
        }
        public String getSacadas() {
            return sacadas;
        }
        public void  setSacadas(String sacadas ){
            this.sacadas = sacadas;
        }
        public String getLojas() {
            return lojas;
        }
        public void  setLojas(String lojas ){
            this.lojas = lojas;
        }
}
