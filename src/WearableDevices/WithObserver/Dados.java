import java.util.ArrayList;

public class Dados {
    
    private ArrayList<Observer> observers = new ArrayList<>();

    private String notificacao;
    private String glicose;
    private String pressao;

    public Dados(String notificacao, String glicose, String pressao) {
        this.notificacao = notificacao;
        this.glicose = glicose;
        this.pressao = pressao;
    }

    public void setGlicose(String glicose) {
        this.glicose = glicose;
        nofityAllObservers();
    }
    public void setNotificacao(String notificacao) {
        this.notificacao = notificacao;
        nofityAllObservers();
    }
    public void setPressao(String pressao) {
        this.pressao = pressao;
        nofityAllObservers();
    }
    
    public String getGlicose() {
        return glicose;
    }
    public String getNotificacao() {
        return notificacao;
    }
    public String getPressao() {
        return pressao;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void nofityAllObservers(){
        for(Observer observer : observers){
            observer.update(glicose);
            observer.update(pressao);
            observer.update(notificacao);
        }
    }

    @Override
    public String toString() {
        return "Dados{" +
                "notificacao='" + notificacao + '\'' +
                ", glicose='" + glicose + '\'' +
                ", pressao='" + pressao + '\'' +
                '}';
    }
}
