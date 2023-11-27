package P2;
import java.util.Scanner;

public class quiz {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int acertos = 0;

        cabecalho cabecalho1 = new cabecalho();

        cabecalho1.Faculdade = "Faculdade: Faculdade Alfredo Nasser";
        cabecalho1.Aluno = "Aluno: Felipe do Couto e Silva";
        cabecalho1.Professor = "Professor: Brenno Pimenta";
        cabecalho1.Disciplina = "Disciplina: Algoritmo e Programaçao II";
        cabecalho1.Inicio = "Bem Vindo ao Quiz!";
        cabecalho1.escrevaCabecalho();


        questoes questoes1 = new questoes();
        questoes1.questoes = "1- Qual carro mais rapido do mundo?";
        questoes1.A = "A) Bugatti Chiron Super Sport";
        questoes1.B = "B) McLaren Speedtail";
        questoes1.C = "C) Lamborghini Aventador";
        questoes1.D = "D) SSC Tuatara ";
        questoes1.E = "E) Ferrari 812 Superfast";
        questoes1.escrevaquestao();
        questoes1.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        String resposta = (String) sc.nextLine();
        if (questoes1.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("====================================================================== ");
        questoes questoes2 = new questoes();
        questoes2.questoes = "2- Qual ultimo placar do jogo do Brasil?";
        questoes2.A = "A) Brasil 0x0 Argentina";
        questoes2.B = "B) Brasil 7x1 Argentina";
        questoes2.C = "C) Brasil 0x1 Argentina";
        questoes2.D = "D) Brasil 0x7 Argentina";
        questoes2.E = "E) Nenhuma das Anteriores";
        questoes2.escrevaquestao();
        questoes2.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes2.iscorreta(resposta)){
            acertos = acertos+1;
        }
        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes3 = new questoes();
        questoes3.questoes = "3- Qual carro que indica que vai chover?";
        questoes3.A = "A) Corolla branco";
        questoes3.B = "B) Celta Preto";
        questoes3.C = "C) Creta Roxo";
        questoes3.D = "D) Fusca Azul";
        questoes3.E = "E) Brasilia Verde";
        questoes3.escrevaquestao();
        questoes3.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes3.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes4 = new questoes();
        questoes4.questoes = "4- Qual nome do cantor GUSTTAVO LIMA?";
        questoes4.A = "A) Gustavo";
        questoes4.B = "B) Nielson";
        questoes4.C = "C) Antonio";
        questoes4.D = "D) João";
        questoes4.E = "E) Nivaldo";
        questoes4.escrevaquestao();
        questoes4.correta = "E";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes4.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes5 = new questoes();
        questoes5.questoes = "5- De quem é a famosa frase “Penso, logo existo“?";
        questoes5.A = "A) Platão";
        questoes5.B = "B) Galileu Galilei";
        questoes5.C = "C) Descartes";
        questoes5.D = "D) Sócrates";
        questoes5.E = "E) Francis Bacon";
        questoes5.escrevaquestao();
        questoes5.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes5.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes6 = new questoes();
        questoes6.questoes = "6- Quem foi a primeira pessoa a viajar no Espaço??";
        questoes6.A = "A) A cadela Laika";
        questoes6.B = "B) Yuri Gagarin";
        questoes6.C = "C) Neil Armstrong";
        questoes6.D = "D) Marcos Pontes";
        questoes6.E = "E) Buzz Aldrin";
        questoes6.escrevaquestao();
        questoes6.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes6.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes7 = new questoes();
        questoes7.questoes = "7- Qual a montanha mais alta do mundo?";
        questoes7.A = "A) Mauna Kea";
        questoes7.B = "B) Dhaulagiri";
        questoes7.C = "C) Monte Chimborazo";
        questoes7.D = "D) Monte Everest";
        questoes7.E = "E) Pico da Neblina";
        questoes7.escrevaquestao();
        questoes7.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes7.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes8 = new questoes();
        questoes8.questoes = "8- Que país tem o formato de uma bota?";
        questoes8.A = "A) Butão";
        questoes8.B = "B) Portugal";
        questoes8.C = "C) Itália";
        questoes8.D = "D) México";
        questoes8.E = "E) Brasil";
        questoes8.escrevaquestao();
        questoes8.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes8.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes9 = new questoes();
        questoes9.questoes = "9- A que temperatura a água ferve?";
        questoes9.A = "A) 100 ºC";
        questoes9.B = "B) 200 ºC";
        questoes9.C = "C) -10 ºC";
        questoes9.D = "D) 180 ºC";
        questoes9.E = "E) 0 ºC";
        questoes9.escrevaquestao();
        questoes9.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes9.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes10 = new questoes();
        questoes10.questoes = "10- Quais são as fases da Lua?";
        questoes10.A = "A) Nova, cheia e superlua";
        questoes10.B = "B) Penumbral, lunar parcial, lunar total e cheia";
        questoes10.C = "C) Nova, cheia, minguante e lua de sangue";
        questoes10.D = "D) Nova, crescente, cheia e minguante";
        questoes10.E = "E) Nova, crescente, cheia, minguante e lua de sangue";
        questoes10.escrevaquestao();
        questoes10.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes10.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes11 = new questoes();
        questoes11.questoes = "11- Qual o maior planeta do sistema solar?";
        questoes11.A = "A) Marte";
        questoes11.B = "B) Lua";
        questoes11.C = "C) Saturno";
        questoes11.D = "D) Terra";
        questoes11.E = "E) Júpiter";
        questoes11.escrevaquestao();
        questoes11.correta = "E";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes11.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes12 = new questoes();
        questoes12.questoes = "12- Um anel tem 3 pedras preciosas. Quantas pedras preciosas têm 11 anéis?";
        questoes12.A = "A) 33";
        questoes12.B = "B) 110";
        questoes12.C = "C) 333";
        questoes12.D = "D) 30";
        questoes12.E = "E) 14";
        questoes12.escrevaquestao();
        questoes12.correta = "A";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes12.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes13 = new questoes();
        questoes13.questoes = "13- Qual o planeta mais próximo do Sol?";
        questoes13.A = "A) Netuno";
        questoes13.B = "B) Júpiter";
        questoes13.C = "C) Mercúrio";
        questoes13.D = "D) Terra";
        questoes13.E = "E) Marte";
        questoes13.escrevaquestao();
        questoes13.correta = "C";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes13.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes14 = new questoes();
        questoes14.questoes = "14- Qual a maior floresta tropical do mundo?";
        questoes14.A = "A) Caatinga";
        questoes14.B = "B) Mata Atlântica";
        questoes14.C = "C) Pantanal";
        questoes14.D = "D) Floresta Amazônica";
        questoes14.E = "E) Pampas";
        questoes14.escrevaquestao();
        questoes14.correta = "D";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes14.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

        System.out.println("====================================================================== ");
        questoes questoes15 = new questoes();
        questoes15.questoes = "15- Quais as duas línguas mais faladas no mundo?";
        questoes15.A = "A) Inglês e espanhol";
        questoes15.B = "B) Inglês e mandarim chinês";
        questoes15.C = "C) Mandarim chinês e francês";
        questoes15.D = "D) Inglês e português";
        questoes15.E = "E) Português e chinês";
        questoes15.escrevaquestao();
        questoes15.correta = "B";
        System.out.println("Digite a alternativa correta: ");
        resposta = (String) sc.nextLine();
        if (questoes15.iscorreta(resposta)){
            acertos = acertos+1;
        }

        System.out.println("ACERTOS: "+acertos);

    }
}
