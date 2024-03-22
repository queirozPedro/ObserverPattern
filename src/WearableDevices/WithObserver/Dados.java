import java.util.ArrayList;

// Classe Subject, que será observada pelo Celular e pelo Relogio
public class Dados {

    // Esses são os Observers, o Subject não conhece eles diretamente, mas sim a
    // interface
    private ArrayList<Observer> observers = new ArrayList<>();

    // Esses serão os dados que serão observados
    private String notificacao;
    private String glicose;
    private String pressao;

    public Dados(String notificacao, String glicose, String pressao) {
        this.notificacao = notificacao;
        this.glicose = glicose;
        this.pressao = pressao;
    }

    // O Set é resposável por atualizar os dados e notificar os Observers

    public void setDados(String glicose, String pressao, String notificacao) {
        this.glicose = glicose != null || glicose == ""? glicose: this.glicose;
        this.pressao = pressao != null || pressao == ""? pressao: this.pressao;
        this.notificacao = notificacao != null || notificacao == ""? notificacao: this.notificacao;
        nofityAllObservers();
    }

    // Os getters estão aqui apenas para que os Observers possam acessar os dados

    public String getGlicose() {
        return glicose;
    }

    public String getNotificacao() {
        return notificacao;
    }

    public String getPressao() {
        return pressao;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * Esse método é responsável por percorrer os observers e passar a atualização
     * dos dados
     */
    public void nofityAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public String toString() {
        return "Notificação: " + notificacao + ", Glicose: " + glicose + ", Pressão: " + pressao;
    }
}