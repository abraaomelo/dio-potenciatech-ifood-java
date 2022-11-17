import java.util.*;
public class Usuario {
    public static void main(String[] args) throws Exception {
       int A,B;
       Scanner leitor = new Scanner(System.in);

       
       System.out.println("Digite o primeiro valor");
       A = leitor.nextInt();

       System.out.println("Digite o segundo valor");
       B = leitor.nextInt();
       
       if (A==B){
        System.out.println("Sao iguais!");
       }else{
        System.out.println("Nao sao iguais!");
       }
    
        
       

       
}
}
