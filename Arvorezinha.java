import Models.Arvore;

public class Arvorezinha {
    public static void main(String[] args) throws Exception {
    Arvore arvore =new Arvore();
        arvore.setTronco("abrigo");
        arvore.setRaizes("lenha");
        arvore.setFrutos("alimento");

        System.out.println( arvore.getTronco());
        System.out.println(arvore.getRaizes());
        System.out.println(arvore.getFrutos());

        System.out.println("As arvores com seu tronco fornece "+arvore.getTronco()+" as suas raizes "+arvore.getRaizes()+" e seus frutos "+arvore.getFrutos());
    }
}
