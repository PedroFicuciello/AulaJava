package aulajava;
    
    public class AulaJava {

    public static void main(String[] args) {
        
        //11 - Crie uma variável inteira com um valor qualquer e verifique
        // se o valor desta variável é menor que 15 ou maior que 100.
        int a = 12;
        
        if (a >= 15) {
        System.out.println ("Esse número é maior ou igual que 15.");
            
        } else if (a < 100){
            System.out.println ("Esse número é menor que 100.");
        }
        
        //12 - Crie uma variável com valor de ponto flutuante com um valor
        //qualquer e verifique se o valor desta variável está entre 1.99 e
        //5.99, inclusive.
        double b = 1.50;
        
        if (b > 1.99 && b < 5.99) {
        System.out.println ("Esse valor está entre 1.99 e 5.99.");
            
        } else {
        System.out.println ("Esse valor não está entre 1.99 e 5.99.");
        }

        //13 - Agora compare se o valor das duas variáveis acima são iguais.
        if (a == b) {
            System.out.println ("O valor de A é igual ao valor de B.");
        }
        
        else if (a != b) {
            System.out.println ("O valor de A é diferente ao valor de B.");
        }

        //14 - Calcule o valor da multiplicação de um int por um double,
        //atribuindo o valor a um int.
        int x = 2;
        double y = 5.5;
        y = x * y;
        
        int atrib = (int) y;
        System.out.println (atrib);
    }
}
