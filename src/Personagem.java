public class Personagem {
    String nome;
    String classe;
    int vida;

    public Personagem(String nome, String classe, int vida) {
        this.nome = nome;
        this.classe = classe;
        this.vida = vida;
    }

    public String nome() {
        return nome;
    }

    public int vida() {
        return vida;
    }

    public void atacado(String nome, int vidaDoAtacado, int moduloDoAtaque) {
        vidaDoAtacado = (vidaDoAtacado - moduloDoAtaque);
        System.out.println(nome + " perde " + moduloDoAtaque + " pontos de vida!");
        System.out.print(nome + " agora possui " + (vidaDoAtacado) + " pontos de vida.");
        if (vidaDoAtacado == 0) {
            System.out.println();
            System.out.println(nome + " é derrotado.");
        }
        this.vida = vidaDoAtacado;
    }

}
