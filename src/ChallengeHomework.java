public class ChallengeHomework {
    public static void main(String[] args) {
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
        System.out.println();


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
