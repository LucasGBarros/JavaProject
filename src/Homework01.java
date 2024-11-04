public class Homework01 {
    public static void main(String[] args){
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
    }
}
