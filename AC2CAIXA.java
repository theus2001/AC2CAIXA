
package ac2caixa;

import java.util.Scanner;
public class AC2CAIXA {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    double cpf1=540351358, senha=22445; 
    int saldo=100000, deposito, saque, serviço;
    
    for(int i = 0; i < 100;i++){ 
    System.out.println("              SEJA BEM VINDO AO BANCO CHUCU"); 
    System.out.print("                    Digite seu CPF: ");
    cpf1 = ler.nextDouble();
    
    System.out.print("                    Digite sua senha: ");
    senha = ler.nextDouble();
    
   
    if(senha == 22445 && cpf1==540351358) {
   System.out.println("       - - -   BEM-VINDO DE VOLTA, AO SEU CAIXA FAVORITO  - - - \n" +
"                   \n" +
"                   - - - MARCELO - - -"); 
   
   System.out.println("                Seu saldo altual: R$1.000,00 ");
   
   //saque e deposito
   
   System.out.println("                DIGITE: 1 se desejar fazer um deposito\n" +
"                DIGITE: 2 se desejar fazer um saque");
   
   
   System.out.print("                Digite para qual serviço deseja: ");
   serviço = ler.nextInt();
   
   if(serviço==1){
   
   System.out.print("                Digite o quanto deseja depositar: ");
   deposito = ler.nextInt();
   
   System.out.println("                Você depositou: "+"R$"+deposito+",00");
   saldo=deposito+saldo;
   System.out.println("                O seu saldo atual agora é: "+"R$"+saldo+",00");
   
   System.out.println("              AGRADEÇEMOS PELA PREFÊNCIA");
   
   }if(serviço==2){
   
   System.out.print("                Digite o quanto deseja sacar:  ");
   saque = ler.nextInt();
   
   System.out.println("                Você sacou: "+"R$"+saque+",00"); 
   saldo= saldo-saque;
   System.out.println("                O seu saldo atual agora é: "+"R$"+saldo+",00");
   
   System.out.println("              AGRADEÇEMOS PELA PREFÊNCIA");
   }
       
    }else{
    System.out.println("                SENHA OU CPF INCORRETOS\n" +
"                    tente novamente");
    }  
    
        
     }    
    }
    
}
