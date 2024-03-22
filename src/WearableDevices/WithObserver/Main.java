public class Main {
    public static void main(String[] args) {
        Dados dados = new Dados(null, null, null);

        Celular celular = new Celular(dados);
        Relogio relogio = new Relogio(dados);

        // Mudança de estado
        dados.setGlicose("Teste");
        dados.setNotificacao("Teste");
        dados.setPressao("Teste");
        System.out.println("\n");
    }
}