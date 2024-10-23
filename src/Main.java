import java.util.Scanner;

public class Main {
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

        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        int classificação = (int) (media / 2);
        System.out.println(classificação);

        // Objeto tipo scanner, função INPUT > Entrada de dados
        Scanner sc = new Scanner(System.in);

        // Entrada de dados do tipo STRING
        String x = sc.next();
        System.out.println("voce digitou: " + x);

        // Entrada de dados do tipo Int
        int y;
        y = sc.nextInt();
        System.out.println("voce digitou: " + y);

        // Entrada de dados do tipo Double
        double u;
        u = sc.nextDouble();
        System.out.println("Você digitou: " + u);

        // Entrada de dados do tipo Char
        char z;
        z = sc.next().charAt(0);
        System.out.println("Voce digitou: " + z);

        System.out.println("teste");
        String a;
        int b;
        double c;
        a = sc.next();
        b = sc.nextInt();
        c = sc.nextDouble();
        System.out.println("Dados digitados:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // Entrada de dados do tipo NextLine (Quebra de linha)
        System.out.println("Próximo teste");
        int d;
        String s1, s2, s3;

        d = sc.nextInt(); // Após digitar esta entrada de dados, o próximo comando Next Line ira consumir um valor vazio
        // pelo fato de que a tecla "enter" irá absorver o valor vazio. O recomendado é inserir um comando isolado de
        // sc.nextLine();
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Dados Digitados:");
        System.out.println(d);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
