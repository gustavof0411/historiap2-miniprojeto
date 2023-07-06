import java.util.Scanner;

public class Capitulo {
    String nome;
    String texto;
    Personagem personagem;
    String nomePersonagem;
    int vida;
    
    public Capitulo(String nome, String texto, Personagem personagem, String nomePersonagem, int vida) { 
        this.nome = nome;
        this.texto = texto;
        this.personagem = personagem;
        this.nomePersonagem = nomePersonagem;
        this.vida = vida;
    }

    public void mostrar(Scanner continuar) {
        System.out.println(this.nome);
        continuar.nextLine();
        System.out.println(this.texto);
        continuar.nextLine();
        System.out.println("Você está guiando o personagem " + this.nomePersonagem + " que atualmente se encontra com "
        + this.vida + " de vida.");
        continuar.nextLine();
        
    }

    public int escolher(Scanner continuar, String digitado, String escolha1, String escolha2) {
        int retorno = 0;
        while (!digitado.equalsIgnoreCase(escolha1) && !digitado.equalsIgnoreCase(escolha2)) {
            System.out.println("Certifique-se se digitou corretamente.");
            System.out.print("Digite novamente aqui:");
            digitado = continuar.nextLine();
        }

            if (digitado.equalsIgnoreCase(escolha1)) {
                retorno = 1;
            }
            else if (digitado.equalsIgnoreCase(escolha2)) {
                retorno = 2;
            }
        return retorno;
    }
}
