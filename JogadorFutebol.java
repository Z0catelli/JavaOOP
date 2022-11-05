package ex04;

import javax.swing.JOptionPane;

public class JogadorFutebol {
    private String nome;
    private Double peso;
    private String posicao;
    
    //construtor
    public JogadorFutebol(String nome,Double peso, String posicao){
        this.nome = nome;
        this.peso = peso;
        this.posicao = posicao;
    }
    
    //getters
    public String getNome(){
        return nome;    
    }
    public Double getPeso(){
        return peso;
    }    
    public String getPos(){
        return posicao;
    }
    
    //setters
    public void setNome(String novo_nome){
        this.nome = novo_nome;
    }
    public void setPeso(Double novo_peso){
        this.peso = novo_peso;
    }
    public void setPos(String nova_posicao){
        this.posicao = nova_posicao;
    }
    
    //métodos
    public void chute(){
        if (posicao.equals("atacante")){
          JOptionPane.showMessageDialog(null,"GOOOOOOOOOOOOOL!");  
        }
        else {
          JOptionPane.showMessageDialog(null,"EROOOOU!"); 
        }
    }
    public void defesa (){
        if (posicao.equals("goleiro")){
            JOptionPane.showMessageDialog(null,"DEFEEEEEEEESA!");  
        }
        else{
            JOptionPane.showMessageDialog(null,"PERDEEEEU!");  

        }
    }
}
    
