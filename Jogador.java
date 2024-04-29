package Models;
public class Jogador {
    private String craque ;
    private String juiz;
    private String estadio;
    private String time;
    
    public Jogador(){
        // recebendo get set comandos
        //pode parecer simples mas serve como aprendizado
    }

    public Jogador(String craque, String juiz, String estadio, String time){

 
    this.craque=craque;
    this.juiz=juiz;
    this.estadio=estadio;
    this.time=time;
}
    public String getCraque() {
        return craque;
    }
    public void  setCraque(String craque){
        this.craque=craque;
    }
    public String getJuiz() {
        return juiz;
    }
    public void  setJuiz(String juiz){
        this.juiz=juiz;
    }
    public String getEstadio() {
        return estadio;
    }
    public void  setEstadio(String estadio){
        this.estadio=estadio;
    }
    public String getTime() {
        return time;
    }
    public void  setTime(String time){
        this.time=time;
    }
}
