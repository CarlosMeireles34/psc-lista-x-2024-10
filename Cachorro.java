package Models;

public class Cachorro{
    private String pelos ;
    private String rabo ;
    private String patas ;
    private String focinho ;

    public Cachorro(String pelos, String rabo, String patas, String focinho){
        this.pelos = pelos;
        this.rabo = rabo;
        this.patas = patas;
        this.focinho = focinho;
    }
    public Cachorro() {
        //TODO Auto-generated constructor stub
    }
    public String getPelos(){
        return pelos;
    }
    public void setPelos(String pelos){
        this.pelos = pelos;
    }
    public String getRabo(){
        return rabo;
    }
    public void setRabo(String rabo){
        this.rabo = rabo;
    }
    public String getPatas(){
        return patas;
    }
    public void setPatas(String patas){
        this.patas = patas;
    }
    public String getFocinho(){
        return focinho;
    }
    public void setFocinho(String focinho){
        this.focinho = focinho;
    }
}