import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        System.out.println("""
                              ---------------------------------------------------------------------------------
                              -----------------------------------  DESAFIO 01 ---------------------------------
                              ---------------------------------------------------------------------------------""");
        System.out.println("""
                Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma\s
                mensagem explicativa, conforme exemplos.""");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite primeiro número: ");
        int number1 = sc.nextInt();

        System.out.println("Digite segundo número: ");
        int number2 = sc.nextInt();

        int soma = number1 + number2;

        System.out.println("A soma dos números é de: " + soma);
        System.out.println();

        System.out.println("""
                              ---------------------------------------------------------------------------------
                              -----------------------------------  DESAFIO 02 ---------------------------------
                              ---------------------------------------------------------------------------------""");

        System.out.println("""
                Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro\s
                casas decimais conforme exemplos.""");
        System.out.println();

        System.out.println("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        double calc = Math.PI * Math.pow(raio, 2);

        System.out.printf("O valor da área é: %.4f%n", calc);
        System.out.println();

        System.out.println("""
                              ---------------------------------------------------------------------------------
                              -----------------------------------  DESAFIO 03 ---------------------------------
                              ---------------------------------------------------------------------------------""");

        System.out.println("""
                Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto\s
                de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).""");
        System.out.println();

        int valor1, valor2, valor3, valor4;
        System.out.println("Digite o primeiro valor: ");
        valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        valor2 = sc.nextInt();

        System.out.println("Digite o terceiro valor: ");
        valor3 = sc.nextInt();

        System.out.println("Digite o quarto valor: ");
        valor4 = sc.nextInt();

        int diferenca = (valor1 * valor2) - (valor3 * valor4);

        System.out.println("A diferença entre os valores é de: " + diferenca);
        System.out.println();

        System.out.println("""
                              ---------------------------------------------------------------------------------
                              -----------------------------------  DESAFIO 04 ---------------------------------
                              ---------------------------------------------------------------------------------""");

        System.out.println("""
                Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por\s
                hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas\s
                decimais.""");
        System.out.println();

        System.out.println("Digite seu ID: ");
        int id = sc.nextInt();
        System.out.println("Digite suas horas trabalhadas: ");
        double hours = sc.nextDouble();
        System.out.println("Quanto você recebe por hora? ");
        double salary = sc.nextDouble();

        double calculo = hours * salary;


        System.out.printf("""
                Seu id é: %d
                Suas horas trabalhadas foram: %.2f Horas
                Seu salário será de: R$ %.2f""", id, hours, calculo);
        System.out.println();


        System.out.println("""
                              ---------------------------------------------------------------------------------
                              -----------------------------------  DESAFIO 05 ---------------------------------
                              ---------------------------------------------------------------------------------""");
        System.out.println("""
                Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o\s
                código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.""");
        System.out.println();

        double valueProduct1 = 5.40;
        double valueProduct2 = 29.99;

        System.out.println("Valor da peça é de R$ 5,40. Quantas peças 12 você deseja? ");
        int pec1 = sc.nextInt();
        System.out.println("Valor da peça é de R$ 29,99. Quantas peças 132 você deseja? ");
        int pec2 = sc.nextInt();

        double pecas = pec1 * valueProduct1;
        double pecas2 = pec2 * valueProduct2;
        double total = pecas + pecas2;

        System.out.println("Valor a pagar: " + total);
        System.out.println();


        System.out.println("""
                              ---------------------------------------------------------------------------------
                              -----------------------------------  DESAFIO 06 ---------------------------------
                              ---------------------------------------------------------------------------------""");
        System.out.println("""
                Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e\s
                mostre:\s
                a) a área do triângulo retângulo que tem A por base e C por altura.\s
                b) a área do círculo de raio C. (pi = 3.14159)\s
                c) a área do trapézio que tem A e B por bases e C por altura.\s
                d) a área do quadrado que tem lado B.\s
                e) a área do retângulo que tem lados A e B""");
        System.out.println();


        sc.close();
    }
}
