public class Homework05 {
    public static void main(String[] args){
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
    }
}
