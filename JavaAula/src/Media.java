/*


/**
 *
 * @author 60000092
 */
import java.util.Scanner;

public class Media {
     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        numeros();
        informcoes();
        calcularMedia();
      
    }
    public static void numeros(){
        int numero_1, numero_2;
        System.out.println("Informe um numero: ");
        numero_1 = scanner.nextInt();
        System.out.println("informe o segundo numero: ");
        numero_2 = scanner.nextInt();
        
        System.out.println("a soma dos 2 numeros e " + (numero_1 + numero_2) ) ;
        System.out.println("a divisao dos 2 numeros e " + (numero_1 / numero_2) );       
        System.out.println("a subtrcao dos 2 numeros e " + (numero_1 - numero_2) );       
        System.out.println("a multiplicacao dos 2 numeros e " + (numero_1 * numero_2)); 
                
    }
    
    public static void informcoes(){
        String nome;
        System.out.println("infome um nome: ");
        nome =scanner.next();
        int idade;
        System.out.println("informe sua idade: ");
        idade =scanner.nextInt();
        String genero;
        System.out.println("qual seu genero? ");
        genero =scanner.next();
        String cor;
        System.out.println("qual sua cor favorita? ");
        cor =scanner.next();
        String esporte;
        System.out.println("pratica esporte? ");
        esporte =scanner.next();
        
        System.out.println(nome + " "+ idade + " " + "anos" + " " + genero + " " + cor + " usuario pratica esporte: " + esporte );
        
    }

    public static void calcularMedia() {
        int nota_1, nota_2, nota_3;

       
        System.out.println("informe sua nota : ");

        nota_1 = scanner.nextInt();

        System.out.println("informe sua segunda nota: ");

        nota_2 = scanner.nextInt();

        System.out.println("informe sua terceira nota: ");

        nota_3 = scanner.nextInt();

        int resultado = (nota_1 + nota_2 + nota_3) / 3;

        System.out.println("sua media sera de: " + resultado);

        if (resultado >= 60) {
            System.out.println("Parabens voce foi aprovado");
        } else {
            System.out.println("Reprovo se fudeo burro");
        }
    }

}
