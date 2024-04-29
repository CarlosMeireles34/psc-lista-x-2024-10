package Models;
public class Poste {
    private String concreto ;
    private String madeira;
    private String ferro;

    public Poste(String concreto , String madeira, String ferro) {
        this.concreto = concreto;
        this.madeira = madeira;
        this.ferro = ferro;
    }

        public Poste(){
            // recebendo get set comandos
            //pode parecer simples mas serve como aprendizado
        }

        public String getConcreto() {
            return concreto;
        }
        public void  setConcreto(String  concreto){
            this.concreto= concreto;
        }
        public String getMadeira() {
            return madeira;
        }
        public void  setMadeira(String  madeira){
            this.madeira= madeira;
        }
        public String getFerro() {
            return ferro;
        }
        public void  setFerro(String ferro){
            this.ferro= ferro;
        }
    }
