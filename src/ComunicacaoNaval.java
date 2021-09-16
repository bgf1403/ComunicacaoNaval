import java.util.ArrayList;
import java.util.List;

public class ComunicacaoNaval {

    // Exercício 02 (Exercise 02) - Agora é com vocês, Mestres.

// Para comunicação dos soldados na base naval, alguns comandos ainda estão faltando.
// Crie uma lista de comunicação do tipo arrayList e adicione mais 15 itens a esta lista para completar a fase 01 de comunicação.
// Sugestões de itens a serem adicionados:
//A – ALPHA        J – JULIET     S – SIERRA
//B – BRAVO        K – KILO       T – TANGO
//C – CHARLIE  L – LIMA       U – UNIFORM
//D – DELTA        M – MIKE       V – VICTOR
//E – ECO      N – NOVEMBER   W – WHISKEY
//F – FOXTROT  O – OSCAR      X – X-RAY
//G – GOLF     P – PAPA       Y – YANKEE
//H – HOTEL        Q – QUEBEC     Z – ZULU
//I – INDIA        R – ROMEU

// Observação: Não podemos adicionar comandos repetidos.
// Para completar o nível 02 de comunicação, crie uma forma de apresentar
// todos os itens enviados ao vetor de comunicação (ArrayList).

// Por final, para chegarmos a conclusão da comunicação,
// remova 05 comandos do vetor de comunicação e reapresente o vetor
// com estes itens removidos.

// Se tudo ocorrer como planejado, a missão estará cumprida em 100%.

    public static void main(String[] args) {

        List<String> listaDeComunicacao = new ArrayList<>();

        listaDeComunicacao.add("A - ALPHA");
        listaDeComunicacao.add("B - BRAVO");
        listaDeComunicacao.add("C - CHARLIE");
        listaDeComunicacao.add("D - DELTA");
        listaDeComunicacao.add("E - ECO");
        listaDeComunicacao.add("F - FOXTROT");
        listaDeComunicacao.add("G - GOLF");
        listaDeComunicacao.add("H - HOTEL");
        listaDeComunicacao.add("I - INDIA");
        listaDeComunicacao.add("J - JULIET");
        listaDeComunicacao.add("K - KILO");
        listaDeComunicacao.add("L - LIMA");
        listaDeComunicacao.add("M - MIKE");
        listaDeComunicacao.add("N - NOVEMBER");
        listaDeComunicacao.add("O - OSCAR");
        listaDeComunicacao.add("P - PAPA");
        listaDeComunicacao.add("Q - QUEBEC");
        listaDeComunicacao.add("R - ROMEU");
        listaDeComunicacao.add("S - SIERRA");
        listaDeComunicacao.add("T - TANGO");
        listaDeComunicacao.add("U - UNIFORM");
        listaDeComunicacao.add("V - VICTOR");
        listaDeComunicacao.add("W - WHISKEY");
        listaDeComunicacao.add("X - X-RAY");
        listaDeComunicacao.add("Y - YANKEE");
        listaDeComunicacao.add("Z - ZULU");

        System.out.println(listaDeComunicacao);

        listaDeComunicacao.remove(1);
        listaDeComunicacao.remove(1);
        listaDeComunicacao.remove(1);
        listaDeComunicacao.remove(1);
        listaDeComunicacao.remove(1);


        for(String listaBuscada:listaDeComunicacao) {
            System.out.println(listaBuscada);
        }
    }
}
