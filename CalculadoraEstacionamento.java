import java.time.Duration;
import java.time.LocalDateTime;

public class CalculadoraEstacionamento {

    private final InfosEstacionamento infos;

    public CalculadoraEstacionamento(InfosEstacionamento infos) {
        this.infos = infos;
    }

    public double calcularTarifa(LocalDateTime entrada, LocalDateTime saida, boolean isVip) {
        if (!entradaValida(entrada) || !saidaValida(saida)) {
            throw new IllegalArgumentException("Horário de entrada ou saída inválido.");
        }

        Duration duracao = Duration.between(entrada, saida);
        long minutos = duracao.toMinutes();

        // Cortesia 
        if (minutos <= infos.getCORTESIA_MINUTOS()) {
            return 0.0;
        }

        // Pernoite
        boolean pernoite = saida.toLocalDate().isAfter(entrada.toLocalDate()) &&
                           saida.toLocalTime().isAfter(infos.getABERTURA().toLocalTime());
        if (pernoite) {
            return isVip ? infos.getPERNOITE() / 2 : infos.getPERNOITE();
        }

        // Até 1h
        if (minutos <= 60) {
            return isVip ? infos.getTARIFA_PADRAO() / 2 : infos.getTARIFA_PADRAO();
        }

        // Acima de 1h
        long horasCompletas = (minutos + 59) / 60; // arredonda para cima
        double valor = infos.getTARIFA_PADRAO() + (horasCompletas - 1) * infos.getTARIFA_INCREMENTO();

        return isVip ? valor / 2 : valor;
    }

    private boolean entradaValida(LocalDateTime entrada) {
        return !entrada.isBefore(infos.getABERTURA()) && !entrada.isAfter(infos.getENTRADA_LIMITE());
    }

    private boolean saidaValida(LocalDateTime saida) {
        return !saida.isBefore(infos.getABERTURA()) && !saida.isAfter(infos.getSAIDA_LIMITE());
    }
}
