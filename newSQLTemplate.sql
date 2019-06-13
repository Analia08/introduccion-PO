
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Ingresa un numero");
      int n= sc.nextInt();
      if(n==0){
      System.out.println("El numero "+n+" es nulo");
      } else{
          if(n>0){
              System.out.println("El numero "+n+" es positivo");
          }else{
          System.out.println("El numero "+n+" es negativo");
          }
      }     
      }
}