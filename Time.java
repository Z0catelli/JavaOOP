package ex04;

public class Time {
    private String nome;
    private String mascote;

    public Time(String nomeTime, String nomeMascote){
        this.nome = nomeTime;
        this.mascote = nomeMascote;
    }
    
    
    public String getNome(){
        return nome;
    }
    public String getMascote(){
        return mascote;
    }

    public void setNome(String novoNomeTime){
        this.nome = novoNomeTime;
    }
    
    public void setMascote(String novoMascote){
        this.mascote = novoMascote;
    }
}