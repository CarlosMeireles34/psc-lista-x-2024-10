import Models.Computador;

public class Pczinho {
    public static void main(String[] args) throws Exception {
        Computador computador = new Computador();
        computador.setTela("Album fotografico");
        computador.setCpu("banco");
        computador.setTeclado("trabalho");
 
         System.out.println( computador.getTela());
         System.out.println( computador.getCpu());
         System.out.println( computador.getTeclado());
 
}
}