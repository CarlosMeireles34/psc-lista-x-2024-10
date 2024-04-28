import Models.Cachorro;

public class App {
    public static void main(String[] args) throws Exception {
        Cachorro cachorro = new Cachorro();
        cachorro.setPelos("marron");
        cachorro.setFocinho("rosnam");
        cachorro.setPatas("correrm");
        cachorro.setRabo("abanam");

        System.out.println( cachorro.getPelos());
        System.out.println(cachorro.getFocinho());
        System.out.println(cachorro.getPatas());
        System.out.println(cachorro.getRabo());


      
    }
}
