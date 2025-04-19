import java.time.LocalDateTime;

public class InfosEstacionamento {
    private double TARIFA_PADRAO = 9.00;
    private double TARIFA_INCREMENTO = 5.55;
    private double PERNOITE = 50.00;
    private int CORTESIA_MINUTOS = 20;

    //Horário
    private LocalDateTime ABERTURA = LocalDateTime.of(2025, 4, 18, 8, 0);
    private LocalDateTime FECHAMENTO = LocalDateTime.of(2025, 4, 19, 2, 0);
    private LocalDateTime ENTRADA_LIMITE = LocalDateTime.of(2025, 4, 18, 23, 59);
    private LocalDateTime SAIDA_LIMITE = LocalDateTime.of(2025, 4, 19, 7, 59);

    public InfosEstacionamento(){

    }
    public InfosEstacionamento(double TARIFA_PADRAO, double TARIFA_INCREMENTO, double PERNOITE, int CORTESIA_MINUTOS,LocalDateTime ABERTURA, LocalDateTime FECHAMENTO, LocalDateTime ENTRADA_LIMITE, LocalDateTime SAIDA_LIMITE ) {
        this.TARIFA_PADRAO = TARIFA_PADRAO;
        this.TARIFA_INCREMENTO = TARIFA_INCREMENTO;
        this.PERNOITE = PERNOITE;
        this.CORTESIA_MINUTOS = CORTESIA_MINUTOS;
        this.ABERTURA = ABERTURA;
        this.FECHAMENTO = FECHAMENTO;
        this.ENTRADA_LIMITE = ENTRADA_LIMITE;
        this.SAIDA_LIMITE = SAIDA_LIMITE;
    }

    public double getTARIFA_PADRAO() {
        return TARIFA_PADRAO;
    }

    public void setTARIFA_PADRAO(double TARIFA_PADRAO) {
        this.TARIFA_PADRAO = TARIFA_PADRAO;
    }

    public double getTARIFA_INCREMENTO() {
        return TARIFA_INCREMENTO;
    }

    public void setTARIFA_INCREMENTO(double TARIFA_INCREMENTO) {
        this.TARIFA_INCREMENTO = TARIFA_INCREMENTO;
    }

    public double getPERNOITE() {
        return PERNOITE;
    }

    public void setPERNOITE(double PERNOITE) {
        this.PERNOITE = PERNOITE;
    }

    public int getCORTESIA_MINUTOS() {
        return CORTESIA_MINUTOS;
    }

    public void setCORTESIA_MINUTOS(int CORTESIA_MINUTOS) {
        this.CORTESIA_MINUTOS = CORTESIA_MINUTOS;
    }

    public LocalDateTime getABERTURA() {
        return ABERTURA;
    }

    public void setABERTURA(LocalDateTime ABERTURA) {
        this.ABERTURA = ABERTURA;
    }

    public LocalDateTime getFECHAMENTO() {
        return FECHAMENTO;
    }

    public void setFECHAMENTO(LocalDateTime FECHAMENTO) {
        this.FECHAMENTO = FECHAMENTO;
    }

    public LocalDateTime getENTRADA_LIMITE() {
        return ENTRADA_LIMITE;
    }

    public void setENTRADA_LIMITE(LocalDateTime ENTRADA_LIMITE) {
        this.ENTRADA_LIMITE = ENTRADA_LIMITE;
    }

    public LocalDateTime getSAIDA_LIMITE() {
        return SAIDA_LIMITE;
    }

    public void setSAIDA_LIMITE(LocalDateTime SAIDA_LIMITE) {
        this.SAIDA_LIMITE = SAIDA_LIMITE;
    }
}
