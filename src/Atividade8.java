import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temperatura = 0;

        System.out.println("digite a temperatura: ");
        temperatura = sc.nextDouble();

        if (temperatura > 30) {
            System.out.println("Está bem quente hoje!");
        } else if (temperatura >= 15 && temperatura <= 30){
            System.out.println("Dia agrádavel pra sair de casa.");
        } else if (temperatura < 15){
            System.out.println("Dia frio, melhor ficar em casa mesmo.");
        }
    }
}