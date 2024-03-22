// A classe Celular implenta a interface Observer
public class Celular implements Observer{
    private Dados dados;

    // Quando o celular é criado, ele já se atacha nos Dados
    public Celular(Dados dados) {
        this.dados = dados;
        this.dados.attach(this);
    }

    public void recebeNotificacao(String notificacao){
        dados.setDados(null, null, notificacao);
    }

    /**
     * Quando o Subject atualiza os dados, ele chama esse método
     */
    @Override
    public void update() {
        System.out.println("Dados atualizados do Celular: " + dados.toString());
    }

    @Override
    public String toString() {
        return "Status do Celular: " + dados.toString();
    }
}
