public class Homework06 {
    public static void main(String[] args){
        System.out.println("""
                              ---------------------------------------------------------------------------------
                              -----------------------------------  DESAFIO 06 ---------------------------------
                              ---------------------------------------------------------------------------------""");

        System.out.println("""
                Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, 
                representando o preço original de um produto. Em seguida, declare uma variável do tipo double 
                percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%). 
                Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
                """);

        double precoOriginal = 275.54;
        double percentualDeDesconto = 15;
        double valorDesconto = precoOriginal * (percentualDeDesconto / 100);
        double valorTotalDesconto = precoOriginal - valorDesconto;

        System.out.printf("O valor do produto é de R$ %.2f e foi aplicado o desconto de %.0f%%. " +
                        "O valor de desconto foi de R$ %.2f, totalizando R$ %.2f.\n",
                precoOriginal, percentualDeDesconto, valorDesconto, valorTotalDesconto);
    }
}
