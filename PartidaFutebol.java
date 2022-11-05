package ex04;

public class PartidaFutebol {
    private Time timeCasa;
    private Time timeVisitante;
    private int pontoCasa;
    private int pontoVisitante;
    private String campeao;


    public PartidaFutebol (Time casa,Time visitante){
        this.timeCasa  = casa;
        this.timeVisitante = visitante;
        this.pontoCasa = 0;
        this.pontoVisitante = 0;
        this.campeao = "Partida em andamento";
    }
    
    public Time getCasa() {
        return timeCasa;
    }

    public void setCasa(Time novoTimeCasa) {
        this.timeCasa = novoTimeCasa;
    }

    public Time getVisitante() {
        return timeVisitante;
    }

    public void setVisitante(Time novoTimeVisitante) {
        this.timeVisitante = novoTimeVisitante;
    }

    public int getPontoCasa() {
        return pontoCasa;
    }

    public void setPontoCasa() {
        this.pontoCasa = pontoCasa++; //definindo que sempre que chamar o metodo setPontoCasa irá se acrescente +1 ao placar
    }

    public int getPontoVisitante() {
        return pontoVisitante;
    }

    public void setPontoVisitante() {     
        this.pontoVisitante = pontoVisitante++; //definindo que sempre que chamar o metodo setPontoVisitante irá se acrescente +1 ao placar
    }

    public String getCampeao() {
        return campeao;
    }
   
    public void setCampeao() {
        if (pontoCasa > pontoVisitante){
            this.campeao = timeCasa.getNome();           
        }
        else if (pontoCasa < pontoVisitante){
            this.campeao = timeVisitante.getNome();           
        }
        else {
           this.campeao = "Empate";     
        }
    }
    public String torcidaCasa(){
        return ("VAAAAAAIIIIII " + timeCasa.getMascote());
        }
     public String torcidaVisitante(){
        return ("VAAAAAAIIIIII " + timeVisitante.getMascote());
        }
    }
    
   

