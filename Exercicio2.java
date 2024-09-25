public class Metodos {

    
    public static String positivoOuNegativo(int numero) {
        if (numero >= 0) {
            return "Positivo";
        } else {
            return "Negativo";
        }
    }

    
    public static double calcularMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }

    
    public static double maiorNumero(double num1, double num2, double num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    
    public static double potencia(double a, double b) {
        return Math.pow(a, b);
    }

    
    public static String converterMinutosParaHorasEMinutos(int minutos) {
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;
        return horas + " hora(s) e " + minutosRestantes + " minuto(s)";
    }

    
    public static long fatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        long fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    
    public static void main(String[] args) {

                System.out.println("Número 5 é: " + positivoOuNegativo(5)); 

                System.out.println("Número -3 é: " + positivoOuNegativo(-3)); 

                System.out.println("Média dos números 10, 5, 7 é: " + calcularMedia(10, 5, 7));

                System.out.println("Maior entre 10, 15, 7 é: " + maiorNumero(10, 15, 7));

                System.out.println("2 elevado a 3 é: " + potencia(2, 3));

                System.out.println("90 minutos é equivalente a: " + converterMinutosParaHorasEMinutos(90));

                System.out.println("Fatorial de 5 é: " + fatorial(5)); 

    }
}