package Models;
public class Celular {
    private String modelo;
    private String cor;
    private String processador;
    private String tela;

    public Celular(String modelo , String cor, String processador, String tela ) {
        this.modelo = modelo;
        this.cor = cor;
        this.processador = processador;
        this.tela = tela;
    }
    public Celular(){
        // Recebendo get e set comando...
    }

    public String getModelo(){
        return modelo ;
    }
    public void setModelo(String modelo ){
        this.modelo = modelo ;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getProcessador(){
        return processador;
    }
    public void setProcessador(String processador){
        this.processador = processador ;
    }
    public String getTela(){
        return tela;
    }
    public void setTela(String tela){
        this.tela = tela ;
    }
 }

