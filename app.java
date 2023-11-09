import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        int quanti;
        int soma = 0;
        
        funcionario funcionario = new funcionario();
        vendedor vendedor = new vendedor();
        gerentes gerentes = new gerentes();
        Scanner scanner = new Scanner(System.in);
        
        int escolha;
        System.out.println("digite seu nome");
        funcionario.setNome(scanner.nextLine());
        System.out.println("digite seu rg");
        funcionario.setRg(scanner.nextInt());
        System.out.println("você é:");
        System.out.println("1- vendedor");
        System.out.println("2- gerente");
        escolha = scanner.nextInt();

        switch (escolha) {
        case 1:
                System.out.println("digite a quantidade de vendas:");
                quanti = scanner.nextInt();
                int vetor [] = new int[quanti];







             for(int i = 1; i<=quanti; i++){
                System.out.println("digite o valor da "+i+"venda:");
                vetor[i-1] = scanner.nextInt();
                
                
           
            }
            for (int i = 0; i<vetor.length; i++ ){
                soma += vetor[i];
                
            }
            vendedor.setValor_venda(soma);
                System.out.println("seu total em vendas foi:"+vendedor.getValor_venda());
                System.out.println("");
                System.out.println("digite seu salario base para que seja acrescido 5% do total de vendas:");
                vendedor.setSalario_base(scanner.nextFloat());
                System.out.println("seu salario total é:");
                System.out.println(vendedor.salariot(vendedor.getValor_venda()));
                
        break;

            case 2:System.out.println("digite a quantidade de horas extras:");
                    gerentes.setHoras(scanner.nextInt());
                    System.out.println("digite seu salario base para que seja acrescido as horas extras:");
                    gerentes.setSalario_base(scanner.nextDouble());
                    System.out.println("");
                    System.out.println("seu salario total é:");
                    System.out.println(gerentes.salariott());
            
           
                break;
        }







       
    }
}
