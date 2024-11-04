public class Homework02 {
    public static void main(String[] args){
        System.out.println("""
                              ---------------------------------------------------------------------------------
                              -----------------------------------  DESAFIO 02 ---------------------------------
                              ---------------------------------------------------------------------------------""");

        System.out.println("Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da " +
                "variável double para int e imprima o resultado.\n");

        double a = 7.4;
        int b = (int) a;
        System.out.printf("O valor de double é %.1f e o valor inteiro é com casting retorna: %d\n\n", a ,b);
    }
}
