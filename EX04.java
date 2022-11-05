package ex04;

import javax.swing.JOptionPane;

public class EX04 {

    public static void main(String[] args) {
      
        Time Time1 = new Time("Corinthians", "Gaviao");
        Time Time2 = new Time ("Palmeiras", "Porcao");
        
        //Instanciando Partida de Futebol chamada Brasileirao, que recebe como atributos o Time 1 e o Time 2
        PartidaFutebol Brasileirao = new PartidaFutebol (Time1,Time2);
        
        
        Brasileirao.setPontoCasa (); //setando um ponto para o Time da casa na partida Brasileirao
        JOptionPane.showMessageDialog (null, "GOOOOOOOOOOOLLLL DO " + Brasileirao.getCasa().getNome().toUpperCase()+ "!!!");
        
        JOptionPane.showMessageDialog (null, Brasileirao.torcidaCasa ().toUpperCase());
        
        Brasileirao.setPontoVisitante ();
        JOptionPane.showMessageDialog (null, "GOOOOOOOOOOOLLLL DO " + Brasileirao.getVisitante().getNome().toUpperCase()+ "!!!");
        
        JOptionPane.showMessageDialog (null, Brasileirao.torcidaVisitante ().toUpperCase());
        
        Brasileirao.setCampeao();
        JOptionPane.showMessageDialog (null, Brasileirao.getCampeao ());
        
    }
    }

 
