import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        InfosEstacionamento infos = new InfosEstacionamento();
        CalculadoraEstacionamento calc = new CalculadoraEstacionamento(infos);

        //Teste manual
        LocalDateTime entrada = LocalDateTime.of(2025, 4, 18, 8, 0);
        LocalDateTime saida = LocalDateTime.of(2025, 4, 18, 8, 21);
        boolean vip = false; 

        double valor = calc.calcularTarifa(entrada, saida, vip);
        System.out.println("Valor calculado: R$" + valor);
    }
}
