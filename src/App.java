import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Este número tem que conter 4 dígitos: A entrada deve estar entre 350 e 8750");
        Integer valor= scanner.nextInt();
        Integer impar= 0;
        Integer par= 0;

        
      
        String number = String.valueOf(valor);

        String[] digits = number.split("(?<=.)");

        while (true) {
            if (valor < 100){
                System.out.println("Informe um valor acima de 3 dígitos."); 
                valor= scanner.nextInt();
            }    
                
            
            if(valor < 350 || valor > 8750 )
            {
                System.out.println("A entrada deve estar entre 350 e 8750");
                valor= scanner.nextInt();
            } else{
            break;
            }
        }

        for(int i = 0; i < digits.length; i++) {
            Integer value = Integer.parseInt(digits[i]);
            if(value % 2 != 0){
                impar++;
            }else
                par++;
        }  
          
        System.out.println("Valores impares: "+impar);
        System.out.println("Valores pares: "+par);
        scanner.close();
    }
}
