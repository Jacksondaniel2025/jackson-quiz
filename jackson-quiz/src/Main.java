import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cabecalho.mostrarCabecalho();

        ArrayList<Questao> questoes = new ArrayList<>();

        questoes.add(criarQuestao("Qual é a capital do estado de São Paulo?",
                "São Paulo", "Campinas", "Santos", "Ribeirão Preto", "Sorocaba", "A"));

        questoes.add(criarQuestao("Qual é a capital do estado de Minas Gerais?",
                "Juiz de Fora", "Uberlândia", "Belo Horizonte", "Contagem", "Betim", "C"));

        questoes.add(criarQuestao("Qual é a capital do estado do Rio de Janeiro?",
                "Niterói", "Rio de Janeiro", "Nova Iguaçu", "Campos", "Petrópolis", "B"));

        questoes.add(criarQuestao("Qual é a capital do estado da Bahia?",
                "Feira de Santana", "Ilhéus", "Vitória da Conquista", "Salvador", "Camaçari", "D"));

        questoes.add(criarQuestao("Qual é a capital do estado do Paraná?",
                "Maringá", "Londrina", "Curitiba", "Cascavel", "Foz do Iguaçu", "C"));

        questoes.add(criarQuestao("Qual é a capital do estado de Pernambuco?",
                "Olinda", "Jaboatão", "Caruaru", "Recife", "Petrolina", "D"));

        questoes.add(criarQuestao("Qual é a capital do estado do Ceará?",
                "Sobral", "Fortaleza", "Juazeiro do Norte", "Crato", "Iguatu", "B"));

        questoes.add(criarQuestao("Qual é a capital do estado do Rio Grande do Sul?",
                "Pelotas", "Caxias do Sul", "Santa Maria", "Porto Alegre", "Novo Hamburgo", "D"));

        questoes.add(criarQuestao("Qual é a capital do estado de Goiás?",
                "Anápolis", "Rio Verde", "Catalão", "Goiânia", "Luziânia", "D"));

        questoes.add(criarQuestao("Qual é a capital do estado do Pará?",
                "Santarém", "Belém", "Marabá", "Ananindeua", "Castanhal", "B"));

        questoes.add(criarQuestao("Qual é a capital do estado do Maranhão?",
                "Imperatriz", "Caxias", "São Luís", "Bacabal", "Timon", "C"));

        questoes.add(criarQuestao("Qual é a capital do estado de Santa Catarina?",
                "Joinville", "Blumenau", "Criciúma", "Itajaí", "Florianópolis", "E"));

        questoes.add(criarQuestao("Qual é a capital do estado de Mato Grosso?",
                "Rondonópolis", "Várzea Grande", "Sinop", "Cuiabá", "Tangará da Serra", "D"));

        questoes.add(criarQuestao("Qual é a capital do estado do Amazonas?",
                "Parintins", "Itacoatiara", "Manaus", "Tefé", "Coari", "C"));

        questoes.add(criarQuestao("Qual é a capital do estado do Tocantins?",
                "Gurupi", "Araguaína", "Palmas", "Porto Nacional", "Paraíso do Tocantins", "C"));

        int acertos = 0;
        for (Questao q : questoes) {
            q.escrevaQuestao();
            String resposta = q.leiaResposta();
            if (q.isCorreta(resposta)) {
                acertos++;
            }
        }

        System.out.println("Você acertou " + acertos + " de " + questoes.size() + " questões!");
    }

    public static Questao criarQuestao(String pergunta, String a, String b, String c, String d, String e, String correta) {
        Questao q = new Questao();
        q.pergunta = pergunta;
        q.opcaoA = a;
        q.opcaoB = b;
        q.opcaoC = c;
        q.opcaoD = d;
        q.opcaoE = e;
        q.correta = correta;
        return q;
    }
}
