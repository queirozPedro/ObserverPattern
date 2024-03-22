// A classe Relogio implementa a interface Observer
public class Relogio implements Observer{
    private Dados dados;

    // Quando o Relógio é criado ele já se atacha aos Dados
    public Relogio(Dados dados) {
        this.dados = dados;
        this.dados.attach(this);
    }    
    
    public void medeGlicose(String glicose){
        dados.setDados(glicose, null, null);
    } 
    public void medePressao(String pressao){
        dados.setDados(null, pressao, null);
    }
    
    /**
     * Quando o Subject atualiza os dados, ele chama esse método
     */
    @Override
    public void update() {
        System.out.println("Dados atualizados do Relogio: " + dados.toString());
    }

    @Override
    public String toString() {
        return "Status do Relógio: " + dados.toString();
    }
}
