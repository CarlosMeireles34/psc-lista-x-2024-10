import Models.Caderno;

public class Agenda {
    public static void main(String[] args) throws Exception {
        Caderno caderno = new Caderno();

        caderno.setFolhas("desenho");
        caderno.setPautas("anotacoes");
        caderno.setCapas("escrita");
 
         System.out.println( caderno.getFolhas());
         System.out.println( caderno.getPautas());
         System.out.println( caderno.getCapas());
 
    
}
}