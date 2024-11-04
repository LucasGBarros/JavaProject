public class Homework04 {
    public static void main(String[] args){
        System.out.println("""
                              ---------------------------------------------------------------------------------
                              -----------------------------------  DESAFIO 04 ---------------------------------
                              ---------------------------------------------------------------------------------""");

        System.out.println("""
                Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
                Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado 
                em uma mensagem.\n""");

        double precoProduto = 2.50;
        int quantidade = 5;
        double valorTotal = precoProduto * quantidade;

        String texto04 = "O valor da compra é de R$ " + valorTotal + "\n";
        System.out.println(texto04);
    }
}
