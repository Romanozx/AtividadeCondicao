import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario = "alunoUnipar";
        String senha = "1234";

        System.out.println("Digite o nome de usuario");
        usuario = sc.nextLine();

        System.out.println("Digite o senha do usuario");
        senha = sc.nextLine();

        if (usuario == "alunoUnipar" && senha == "1234") {
            System.out.println("Login realizado com sucesso!");
        }
        else {
            System.out.println("usuário ou senha incorreto");
        }
    }
}