public class Celular implements Observer{
    private Dados dados;

    public Celular(Dados dados) {
        this.dados = dados;
        this.dados.attach(this);
    }

    @Override
    public void update(String data) {
        System.out.println("Estado Aualizado do Celular: " + dados.toString());
    }

}
