import Models.CartaoBanco;

public class CartaoBank {
    public static void main(String[] args) throws Exception {
        CartaoBanco cartaobanco = new CartaoBanco();

        cartaobanco.setChips("sacar");
        cartaobanco.setCor("logotipodobanco");
        cartaobanco.setTargeta("compras");

        System.out.println( cartaobanco.getChips());
        System.out.println( cartaobanco.getCor());
        System.out.println( cartaobanco.getTargeta());

        System.out.println( "Tenha o cartao para "+cartaobanco.getTargeta()+" e "+cartaobanco.getChips() + " basta sabeer a "+ cartaobanco.getCor());
    }
}
