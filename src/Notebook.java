import java.util.Scanner;

public class Notebook {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento:" + anoDeLancamento);

        boolean incluidoNoPlano = true;

        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8) / 3;

        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito Bom!
                Ano de Lançamento
                """ + anoDeLancamento;

        System.out.println(sinopse);

        int classificação = (int) (media / 2);
        System.out.println(classificação);

        System.out.println("------------------------------------------------------------");
        System.out.println("Entendendo conceito input");
        System.out.println("------------------------------------------------------------");

        // Objeto tipo scanner, função INPUT > Entrada de dados
        Scanner sc = new Scanner(System.in);
        System.out.println("Scanner sc = new Scanner(System.in);");
        System.out.println();

        System.out.println("------------------------------------------------------------");
        System.out.println("Entendendo Entrada de dados");
        System.out.println("------------------------------------------------------------");

        // Entrada de dados do tipo STRING
        System.out.println("Digite algo: ");
        String x = sc.next();
        System.out.println("voce digitou: " + x);

        // Entrada de dados do tipo Int
        int y;
        System.out.println("Digite algum valor inteiro: ");
        y = sc.nextInt();
        System.out.println("voce digitou: " + y);

        // Entrada de dados do tipo Double
        double u;
        System.out.println("Digite algum valor flutuante: ");
        u = sc.nextDouble();
        System.out.println("Você digitou: " + u);

        // Entrada de dados do tipo Char
        char z;
        System.out.println("digite alguma letra?: ");
        z = sc.next().charAt(0);
        System.out.println("Voce digitou: " + z);

        System.out.println("teste");
        String a;
        int b;
        double c;

        System.out.println("Digite algo: ");
        a = sc.next();
        System.out.println("Digite algum valor inteiro: ");
        b = sc.nextInt();
        System.out.println("Digite algum valor flutuante: ");
        c = sc.nextDouble();
        System.out.println("Dados digitados:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Entrada de dados do tipo NextLine (Quebra de linha)
        System.out.println("Próximo teste");
        int d;
        String s1, s2, s3;

        System.out.println("Digite algum valor inteiro: ");
        d = sc.nextInt(); // Após digitar esta entrada de dados, o próximo comando Next Line ira consumir um valor vazio
        // pelo fato de que a tecla "enter" irá absorver o valor vazio. O recomendado é inserir um comando isolado de
        // sc.nextLine();

        sc.nextLine();
        System.out.println("Digite algo: ");
        s1 = sc.nextLine();
        System.out.println("Digite algo: ");
        s2 = sc.nextLine();
        System.out.println("Digite algo: ");
        s3 = sc.nextLine();

        System.out.println("Dados Digitados:");
        System.out.println(d);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();

        System.out.println("------------------------------------------------------------");
        System.out.println("Entendendo Como funciona condição");
        System.out.println("------------------------------------------------------------");

        int valor = 5;

        if (x > 0) {
            System.out.println("Bom dia");
        }

        if () {
            System.out.println("Boa tarde");
        }

        if () {
            System.out.println("Boa noite");
        }


        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }
        sc.close();
    }
}
