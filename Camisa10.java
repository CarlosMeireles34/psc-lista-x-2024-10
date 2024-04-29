import Models.Jogador;

public class Camisa10 {
    public static void main(String[] args) throws Exception {
        Jogador jogador = new Jogador();
        jogador.setCraque("Carlão");
        jogador.setJuiz("Daniel");
        jogador.setEstadio("Stadium Una");
        jogador.setTime("Unidos da programacao fc");

        System.out.println(jogador.getCraque());
        System.out.println(jogador.getJuiz());
        System.out.println(jogador.getEstadio());
        System.out.println(jogador.getTime());

    }
    
}
