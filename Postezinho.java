import Models.Poste;

public class Postezinho {
    public static void main(String[] args) throws Exception {
        Poste poste = new Poste(); 
        poste.setConcreto("localizacao");  
        poste.setMadeira("iluminacao");  
        poste.setFerro("sinalizacao"); 

        System.out.println(poste.getConcreto());
        System.out.println(poste.getMadeira());
        System.out.println(poste.getFerro());


    }
}
