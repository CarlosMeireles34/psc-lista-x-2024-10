import Models.Predio;

public class Arranhaceu {
    public static void main(String[] args) throws Exception {
        Predio predio = new Predio();

       predio.setApartamentos("moradia");
       predio.setSacadas("comercial");
       predio.setLojas("deposito");

        System.out.println( predio.getApartamentos());
        System.out.println( predio.getSacadas());
        System.out.println( predio.getLojas());
    }
}
