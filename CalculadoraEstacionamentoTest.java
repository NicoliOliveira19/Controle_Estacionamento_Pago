import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculadoraEstacionamentoTest {

    InfosEstacionamento infos = new InfosEstacionamento();
    CalculadoraEstacionamento calc = new CalculadoraEstacionamento(infos);

    @ParameterizedTest
    @CsvSource({
        // entrada, saida, vip, esperado
        "2025-04-18T08:00,2025-04-18T08:10,false,0.00",     // cortesia
        "2025-04-18T08:00,2025-04-18T08:21,false,9.00",     // tarifa fixa
        "2025-04-18T08:00,2025-04-18T09:01,false,14.55",    // com incremento
        "2025-04-18T08:00,2025-04-18T08:21,true,4.50",      // VIP com tarifa fixa
        "2025-04-18T08:00,2025-04-19T08:01,false,50.00",    // pernoite
        "2025-04-18T08:00,2025-04-19T08:01,true,25.00"      // pernoite VIP
    })
    public void testarCalculo(String entradaStr, String saidaStr, boolean vip, double esperado) {
        LocalDateTime entrada = LocalDateTime.parse(entradaStr);
        LocalDateTime saida = LocalDateTime.parse(saidaStr);
        double resultado = calc.calcularTarifa(entrada, saida, vip);
        assertEquals(esperado, resultado, 0.01);
    }
}
