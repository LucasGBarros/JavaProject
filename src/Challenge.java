import javax.sound.midi.Soundbank;

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

        System.out.println("Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade)." +
                " Calcule o valor total multiplicando o preço do produto pela \nquantidade e apresente o resultado " +
                "em uma mensagem.\n");

        double precoProduto = 2.50;
        int quantidade = 5;
        double valorTotal = precoProduto * quantidade;

        String texto04 = "O valor da compra é de R$ " + valorTotal;
        System.out.println(texto04);

        System.out.println("""
                              ---------------------------------------------------------------------------------
                              -----------------------------------  DESAFIO 05 ---------------------------------
                              ---------------------------------------------------------------------------------""");


    }
}

