
package javaaula;

import java.util.Scanner;

/**
 *
 * @author 60000092
 */
public class Aula {
    public static void main(String[] args){
        System.out.print("Ola mundo ");
        
        System.out.print("\n\nOla Mundo ");
        System.out.println("Ola Mundo ");
        System.out.print("apos o println. ");
        System.out.println("println = joga o cursor para a linha de baixo. ");
        
        
        String nome = "Fernando Botelho";
        int idade;
        
        boolean gostoso = true ;
        
        double troco = 1.00;
        
        char letra = 'A';
                
        System.out.println("Ola " + nome);
        
        nome = "Julia Monteiro";
        idade = 27;
        
        Scanner s = new Scanner(System.in); //criar um objeto Scanner e instancia-lo
        
        System.out.println("infome um nome: ");
        nome =s.next();
        
        System.out.println("Ola " + nome + "idade " + idade + gostoso + troco + letra);
        
        
        
       System.out.print("informe um nome: ");
       nome = s.nextLine();
       System.out.print("informe a idade: ");
       idade = s.nextInt();
       System.out.print("Informe a tuma (A, B ou C): ");
       char turma = s.next().charAt(0);
       System.out.print("Informe o status da pessoa: ");
     boolean status = s.nextBoolean();
       System.out.print("Informa a Renda da pessoa ");
      double renda = s.nextDouble();
      
      System.out.println("ola " + nome + "\nIdade: " + idade);
       
    }       
}
