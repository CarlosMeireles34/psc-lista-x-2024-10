import javax.swing.plaf.synth.SynthSpinnerUI;

import Models.Celular;

public class Celularzinho {
    public static void main(String[] args) throws Exception {
        Celular celular = new Celular();
        celular.setModelo("Nokia");
        celular.setCor("vermelho");
        celular.setProcessador("intel");
        celular.setTela("tamanho grande");

        System.out.println(celular.getModelo());
        System.out.println(celular.getCor());
        System.out.println(celular.getProcessador());
        System.out.println(celular.getTela());
       
    }
    
}
