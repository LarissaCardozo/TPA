package revisaoJava;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anoAtual;
        int anoNascimento;
        int idade;

        System.out.print("Digite o ano atual: ");
        anoAtual = scanner.nextInt();

        System.out.print("Digite o ano de nascimento do usu�rio: ");
            anoNascimento = scanner.nextInt();
            
        idade = anoAtual - anoNascimento;
        System.out.println("A idade do usu�rio �: " + idade + " anos");

            if (idade<=18) {
                System.out.println("O usu�rio � menor de idade");
            }
            else {
            	System.out.println("O usu�rio � maior de idade");
            }
            System.out.println("Deseja calcular a idade de mais alguma pessoa?");

            scanner.close();
            }
        }
    
