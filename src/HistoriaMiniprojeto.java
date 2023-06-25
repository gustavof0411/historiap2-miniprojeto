import java.util.Scanner;

public class HistoriaMiniprojeto {
    static Scanner continuar;

    public static void main(String[] args) {
        continuar = new Scanner(System.in);
        // Personagens
        Personagem protagonista = new Personagem("Caleb", "Guerreiro", 150);
        Personagem rei = new Personagem("Salaham", "Rei", 100);
        Personagem mago = new Personagem("Mago do Mal", "Mago", 300);

        // Capítulo 1

        String pedidoSim = "s";
        String pedidoNao = "n";
        String lutarContra = "lutar";
        String servir = "servir";
        String caminhoEsquerda = "esquerda";
        String caminhoDireita = "direita";
        String atacarInimigos = "atacar";
        String aguardarInimigos = "aguardar";

        System.out.println("Você é " + protagonista.nome() + ", comandante do clã Fortaleza.");
        continuar.nextLine();
        System.out.println("Em um certo dia, você recebe um pedido do Rei, através de um informante.");
        continuar.nextLine();
        System.out.println("Informante: O Rei Salaham solicita a sua ajuda para obter o Anel do Poder, roubado pelo"
                + " inimigo mais poderoso de vossa majestade. É preciso ir o mais rápido possível, para que ele"
                + " não tome posse de todo o poder contido dentro do anel. Você deverá ir sozinho para a missão.");
        continuar.nextLine();
        System.out.println("Você pensa sobre qual decisão tomar.");
        continuar.nextLine();
        System.out.println("[ESCOLHA] - O QUE VOCÊ IRÁ RESPONDER?");

        System.out.println("AJUDAR O REI - DIGITE \"S\"");
        System.out.println("NÃO AJUDAR O REI - DIGITE \"N\"");
        System.out.print("Digite aqui:");
        String ajudar = continuar.nextLine();

        while (!ajudar.equalsIgnoreCase(pedidoSim) && !ajudar.equalsIgnoreCase(pedidoNao)) {
            System.out.println("Certifique-se se digitou corretamente.");
            System.out.print("Digite novamente aqui:");
            ajudar = continuar.nextLine();
        }
        if (ajudar.equalsIgnoreCase(pedidoNao)) {
            System.out.println("Você decide negar o pedido do Rei.");
            continuar.nextLine();
            System.out.println("Abalado, o informante volta para informar o Rei da sua decisão.");
            continuar.nextLine();
            System.out.println(
                    "Algum tempo depois, o Mago do Mal, impedido, destrói o reino inteiro.");
            continuar.nextLine();
            rei.atacado(rei.nome(), rei.vida(), rei.vida());
            continuar.nextLine();
            System.out.println("Logo após destruir o reino, o Mago do Mal vem até você para ameaçá-lo.");
            continuar.nextLine();
            System.out
                    .println("Ele o oferta uma proposta: render-se à ele e servi-lo para conquistar mais territórios.");
            continuar.nextLine();
            System.out.println("Se não o servir, você terá que lutará contra ele. Se vencer, se livrará dele.");
            continuar.nextLine();
            System.out.println(protagonista.nome() + ": Não tenho escolha. Devo tomar uma decisão imediatamente.");
            continuar.nextLine();
            System.out.println("[ESCOLHAS]");
            System.out.println("LUTAR CONTRA - DIGITE \"LUTAR\"");
            System.out.println("SERVIR AO MAGO DO MAL - DIGITE \"SERVIR\"");
            System.out.println();
            System.out.print("Digite aqui:");
            String lutarOuServir = continuar.nextLine();

            while (!lutarOuServir.equalsIgnoreCase(lutarContra) && !lutarOuServir.equalsIgnoreCase(servir)) {
                System.out.println("Certifique-se se digitou corretamente.");
                System.out.print("Digite novamente aqui:");
                lutarOuServir = continuar.nextLine();
            }

            if (lutarOuServir.equalsIgnoreCase(lutarContra)) {
                System.out.println("Destemido, você decide lutar contra o Mago do Mal.");
                continuar.nextLine();
                System.out.println("Com toda sua força e coragem, você tenta ");
                continuar.nextLine();
                System.out.println("Infelizmente, seu adversário estava forte demais para lutar contra.");
                continuar.nextLine();
                System.out.println("Sem nem tocá-lo uma única vez, o Mago conjura uma magia que o lança"
                        + " contra uma rocha.");
                continuar.nextLine();
                protagonista.atacado(protagonista.nome(), protagonista.vida(), 130);
                continuar.nextLine();
                System.out.println("Antes de atacá-lo novamente, o Mago o diz uma últime frase:");
                continuar.nextLine();
                System.out.println(mago.nome() + ": É uma pena. Nós poderíamos ser uma grande aliança.");
                continuar.nextLine();
                protagonista.atacado(protagonista.nome(), protagonista.vida(), 20);
                continuar.nextLine();
                System.out.println("[FINAL 2 - PROTAGONISTA É DERROTADO]");
            } else if (lutarOuServir.equalsIgnoreCase(servir)) {
                System.out.println("Você decide servir ao Mago do Mal.");
                continuar.nextLine();
                System.out.println("Com suas forças aliadas, vocês conseguem conquistar muitos mais territórios.");
                continuar.nextLine();
                System.out.println("Com o passar do tempo, você desenvolve uma fome de conquista."
                        + " Cada vez mais, você deseja destruir vidas apenas pela diversão...");
                continuar.nextLine();
                System.out.println("[FINAL 3 - FOME DE MATANÇA]");
                continuar.nextLine();
            }

        } else if (ajudar.equalsIgnoreCase(pedidoSim)) {
            System.out.println("Você decide aceitar a proposta do rei.");
            continuar.nextLine();
            // Capítulo 2
            System.out.println("[CAPÍTULO 2]");
            continuar.nextLine();
            System.out.println("O rei então lhe envia você para resgatar o Anel do Poder.");
            continuar.nextLine();
            System.out.println("Há dois caminhos para chegar à torre do Mago do Mal.");
            continuar.nextLine();
            System.out.println("O caminho da esquerda, que passa pelos Bosques Calmos, é o caminho mais longo,"
                    + " porém sem muitos inimigos.");
            continuar.nextLine();
            System.out.println("E o caminho da direita, que é o mais curto, mas possui mais inimigos.");
            continuar.nextLine();
            System.out.println("Qual caminho você deseja seguir?");
            System.out.println("[ESCOLHAS]");
            System.out.println("IR PELO CAMINHO DA ESQUERDA - DIGITE \"ESQUERDA\"");
            System.out.println("IR PELO CAMINHO DA DIREITA - DIGITE \"DIREITA\"");
            System.out.println();
            System.out.print("Digite aqui:");
            String seguirCaminho = continuar.nextLine();

            while (!seguirCaminho.equalsIgnoreCase(caminhoEsquerda)
                    && !seguirCaminho.equalsIgnoreCase(caminhoDireita)) {
                System.out.println("Certifique-se se digitou corretamente.");
                System.out.print("Digite novamente aqui:");
                seguirCaminho = continuar.nextLine();
            }

            if (seguirCaminho.equalsIgnoreCase(caminhoEsquerda)) {
                System.out.println("Você decide seguir pelo caminho da esquerda.");
                continuar.nextLine();
                System.out.println("A viagem é longa, precisando atravessar rios e matas, porém sem interrupções.");
                continuar.nextLine();

                System.out.println("CAPÍTULO 3");
                System.out.println(
                        "Ao invadir a torre, você se depara com vários espíritos negros protegendo o castelo.");
                continuar.nextLine();
                System.out.println(
                        "É preciso atacá-los para chegar até o topo da torre, onde está localizado o Mago do Mal.");
                continuar.nextLine();
                protagonista.atacado(protagonista.nome(), protagonista.vida(), 50);
                continuar.nextLine();
                System.out.println("Ao derrotar todos os inimigos, você chega até o topo da torre.");
                continuar.nextLine();
                System.out.println("Por ter seguido pelo caminho mais longo, você chegou tarde demais."
                        + " O Mago do Mal já havia posse de todo o poder do Anel.");
                continuar.nextLine();
                System.out.println("Ele então, com todo o poder adquirido, o ataca.");
                continuar.nextLine();
                protagonista.atacado(protagonista.nome(), protagonista.vida(), protagonista.vida());
                continuar.nextLine();
                System.out.println("[FINAL 1 - PROTAGONISTA É DERROTADO]");

            } else if (seguirCaminho.equalsIgnoreCase(caminhoDireita)) {
                System.out.println("Você decide seguir pelo caminho da direita.");
                continuar.nextLine();
                System.out.println("Como esperado, o caminho não é nada seguro.");
                continuar.nextLine();
                System.out.println("Há vários espíritos negros no caminho, conjurados pelo Mago.");
                continuar.nextLine();
                System.out.println(
                        "Em certo momento, você se depara com um exército de espíritos negros no meio do caminho.");
                continuar.nextLine();
                System.out.println("Você pode aguardá-los saírem do local ou atacá-los instantaneamente.");
                continuar.nextLine();
                System.out.println("[ESCOLHAS]");
                System.out.println("ATACÁ-LOS - DIGITE \"ATACAR\"");
                System.out.println("AGUARDAR SAÍREM DO LOCAL - DIGITE \"AGUARDAR\"");
                System.out.println();
                System.out.print("Digite aqui:");
                String atacarOuAguardar = continuar.nextLine();

                while (!atacarOuAguardar.equalsIgnoreCase(atacarInimigos)
                        && !atacarOuAguardar.equalsIgnoreCase(aguardarInimigos)) {
                    System.out.println("Certifique-se se digitou corretamente.");
                    System.out.print("Digite novamente aqui:");
                    atacarOuAguardar = continuar.nextLine();
                }

                if (atacarOuAguardar.equalsIgnoreCase(atacarInimigos)) {
                    System.out.println("Você decide atacar os inimigos.");
                    continuar.nextLine();
                    System.out.println("Felizmente, eles não são muito fortes, mas estão em grandes quantidades.");
                    continuar.nextLine();
                    System.out.println("Alguns até conseguem acertá-lo com suas magias.");
                    continuar.nextLine();
                    protagonista.atacado(protagonista.nome(), protagonista.vida(), 50);
                    continuar.nextLine();
                    System.out.println("Após a luta, você consegue chegar até a torre do Mago do Mal.");
                    continuar.nextLine();
                } else if (atacarOuAguardar.equalsIgnoreCase(aguardarInimigos)) {
                    System.out.println("Você decide aguardar os inimigos saírem do local, afinal, é melhor guardar"
                            + " sua energia para o combate com o Mago do Mal.");
                    continuar.nextLine();
                    System.out.println("Passado algum tempo, você consegue passar pelo caminho, agora seguro.");
                    continuar.nextLine();
                    System.out.println("Você então consegue chegar até a torre do Mago do Mal.");
                    continuar.nextLine();
                }

                // Capítulo 3
                System.out.println(
                        "Ao invadir a torre, você se depara com vários espíritos negros protegendo o castelo.");
                continuar.nextLine();
                System.out.println(
                        "É preciso atacá-los para chegar até o topo da torre, onde está localizado o Mago do Mal.");
                continuar.nextLine();
                protagonista.atacado(protagonista.nome(), protagonista.vida(), 50);
                System.out.println("Ao derrotar todos os inimigos, você chega até o topo da torre.");
                continuar.nextLine();

                if (atacarOuAguardar.equalsIgnoreCase(atacarInimigos)) {
                    System.out.println("Você chega momentos antes de o Mago ter adquirido todo o poder do Anel.");
                    continuar.nextLine();
                    System.out.println("Mago do Mal: Como OUSA interromper-me? Você será destruído!");
                    continuar.nextLine();
                    System.out.println(
                            "Infelizmente, toda a sua luta com os espíritos negros na floresta deixaram-o fraco..."
                                    + " fraco o suficiente para não conseguir combater o Mago do Mal.");
                    continuar.nextLine();
                    protagonista.atacado(protagonista.nome(), protagonista.vida(), protagonista.vida());
                    System.out.println("[FINAL 4 - TENTATIVA MAL SUCEDIDA]");
                    System.out.println(
                            "VOCÊ TENTOU IMPEDIR O MAGO. INFELIZMENTE, ESTAVA FRACO PARA DERROTÁ-LO, O QUE LEVOU A SUA MORTE.");
                } else if (atacarOuAguardar.equalsIgnoreCase(aguardarInimigos)) {
                    System.out.println("Você chega momentos antes de o Mago ter adquirido todo o poder do Anel.");
                    continuar.nextLine();
                    System.out.println("Mago do Mal: Como OUSA interromper-me? Você será destruído!");
                    continuar.nextLine();
                    System.out.println("Felizmente, você guardou energia o suficiente quando decidiu aguardar os"
                            + " espíritos negros do caminho.");
                    continuar.nextLine();
                    System.out.println("Com toda sua coragem, você ataca o Mago.");
                    continuar.nextLine();
                    mago.atacado(mago.nome(), mago.vida(), 150);
                    System.out.println();
                    System.out.println("O Mago também o ataca de volta.");
                    continuar.nextLine();
                    protagonista.atacado(protagonista.nome(), protagonista.vida(), (protagonista.vida() - 20));
                    continuar.nextLine();
                    System.out.println("Com toda a sua bravura, você consegue derrotar o Mago.");
                    continuar.nextLine();
                    mago.atacado(mago.nome(), mago.vida(), mago.vida());
                    continuar.nextLine();
                    System.out.println(
                            "Após derrotá-lo você consegue recuperar o Anel do Poder e devolvê-lo seguramente para o rei.");
                    continuar.nextLine();
                    System.out.println("[FINAL 1 - O ANEL É RECUPERADO]");
                }
            }
        }
    }
}
