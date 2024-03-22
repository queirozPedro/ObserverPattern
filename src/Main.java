public class Main {
    public static void main(String[] args) {

        Dados dados = new Dados("", "85 mg/dl", "12.8");

        // Celular e Relógio serão as classes Observer, e a classe Dados será o Subject
        Celular celular = new Celular(dados);
        Relogio relogio = new Relogio(dados);

        System.out.println("Status inicial do celular e do relógio");
        System.out.println(celular.toString());
        System.out.println(relogio.toString() + "\n");

        // Esses dados s-erão obtidos pelos sensores no smartwatch e atualizados
        System.out.println("Relógio mediu a glicose e atualizou o sistema");
        relogio.medeGlicose("78 mg/dl");
        System.out.println();

        System.out.println("Relógio mediu a pressão e atualizou o sistema");
        relogio.medePressao("13.8");
        System.out.println();
        
        // Essas notificacoes serão obtidos pelo celular e atualizados
        System.out.println("Celular recebeu uma mensagem e atualizou a notificação no sistema");
        celular.recebeNotificacao("Nova noticia do Sigaa: Nota da Segunda Unidade de Projeto Detalhado de Software: 10,0\n");

        System.out.println("\nDesconectando o Relógio do Sistema");
        dados.deattach(relogio);

        System.out.println("\nStatus final do celular e do relógio");
        celular.recebeNotificacao(", É um Deix!!");
        
        System.out.println("\n");
    }
}