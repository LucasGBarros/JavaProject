public class Challenge {
    public static void main(String[] args) {
        System.out.println("Concluí a aula 01 e agora estou mergulhando em Java!");
        System.out.println("Olá, Lucas Barros");
        System.out.println("\n");

        System.out.println("""
                              ----------------------------------------------------------------------------------
                              -----------------------------------  DESAFIO AULA --------------------------------
                              ----------------------------------------------------------------------------------""");

        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit",
                temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);
        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira + "\n");



        System.out.println("""
                              ---------------------------------------------------------------------------------
                              -----------------------------------  DESAFIO 01 ---------------------------------
                              ---------------------------------------------------------------------------------""");

        System.out.println("Crie um programa que realize a média de duas notas decimais e exiba o resultado.\n");

        int x = 8;
        int y = 5;
        double media = (double) (x + y) /2;
        System.out.printf("A primeira nota é de %d e a segunda nota é de %d. A média é de: %.1f\n\n",
                x, y, media);

        System.out.println("""
                              ---------------------------------------------------------------------------------
                              -----------------------------------  DESAFIO 02 ---------------------------------
                              ---------------------------------------------------------------------------------""");

        System.out.println("Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da " +
                "variável double para int e imprima o resultado.\n");

        double a = 7.4;
        int b = (int) a;
        System.out.printf("O valor de double é %.1f e o valor inteiro é com casting retorna: %d\n\n", a ,b);

        System.out.println("""
                              ---------------------------------------------------------------------------------
                              -----------------------------------  DESAFIO 03 ---------------------------------
                              ---------------------------------------------------------------------------------""");

        System.out.println("Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). " +
                "Atribua valores a essas variáveis e concatene-as em uma mensagem.\n");

        char letra = 'O';
        String palavra = "brigado";
        String texto03 = "A letra é: " + letra + " e a palavra é: " + palavra + "\n\n";
        System.out.println(texto03);

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

        System.out.println("""
                              ---------------------------------------------------------------------------------
                              -----------------------------------  DESAFIO 05 ---------------------------------
                              ---------------------------------------------------------------------------------""");

        System.out.println("""
                Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. 
                Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares 
                para reais e imprima o resultado formatado.\n""");

        double valorEmReal = 4.94;
        double dollar = 5;
        double converse = dollar * valorEmReal;

        String texto05 = "1 dólar hoje está R$ " + valorEmReal + " e eu tenho U$D " + dollar + " para converter no " +
                "valor de: R$ " + String.format("%.2f\n", converse);

        System.out.println(texto05);

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

        System.out.println("""
                              -----------------------------------------------------------------------------------
                              -----------------------------------  DESAFIO AULA ---------------------------------
                              -----------------------------------------------------------------------------------""");

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.00;
        double measure = 53.264567;

        System.out.printf("""
                Products:
                %s, which price is $ %.2f.
                %s, which price is $ %.2f.
                
                Record: %d years old, code %d and gender: %c.
                
                Measure with eight decimal places: %f.
                Rounded (three decimal places): %.3f.
                US decimal point: %.3f""", product1, price1, product2, price2, age, code, gender,
                measure, measure, measure);
    }
}

