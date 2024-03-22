public class Relogio implements Observer{
    private Dados dados;

    public Relogio(Dados dados) {
        this.dados = dados;
        this.dados.attach(this);
    }

    @Override
    public void update(String data) {
        System.out.println("Estado Aualizado do Relogio: " + dados.toString());
    }

}
