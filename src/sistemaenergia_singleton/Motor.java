package sistemaenergia_singleton;

public class Motor {

    private SistemaEnergia sistemaEnergia;
    private static int CONSUMOARRANQUE = 40;

    public Motor() {
        this.sistemaEnergia = SistemaEnergia.getInstance();
    }

    public void arrancar() {
        boolean exito = sistemaEnergia.consumirEnergia(CONSUMOARRANQUE);
        if (exito) {
            System.out.println("Motor: arrancado.");
            System.out.println("Gasto de energia: " + CONSUMOARRANQUE + " unidades.");
        } else {
            System.out.println("Motor: energia insuficiente para arrancar.");
        }
    }

    public void consultarEnergiaRestante() {
        System.out.println("Motor consulta energia restante: " + sistemaEnergia.getEnergiaActual()
                + "/" + sistemaEnergia.getEnergiaMaxima());
    }
}
