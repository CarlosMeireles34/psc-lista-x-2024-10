package Models;
public class Arvore {
    private String tronco;
    private String raizes;
    private String frutos;

public Arvore ( String tronco,String raizes, String frutos){
    this.tronco = tronco;
    this.raizes = raizes;
    this.frutos = frutos;
}
public Arvore(){
     // Recebendo get e set comando...
}
public String getTronco(){
    return tronco;
}
public void  setTronco(String tronco){
    this.tronco = tronco;
}
public String getRaizes(){
    return raizes;
}
public void setRaizes(String raizes){
    this.raizes=raizes;
}
public String getFrutos(){
    return frutos;
}
public void setFrutos(String frutos){
    this.frutos=frutos;
}
}