package herramientasmc_abstractfactory;

public class FabricaMadera implements FabricaHerramientas {

    @Override
    public Espada crearEspada() {
        return new EspadaMadera();
    }

    @Override
    public Pico crearPico() {
        return new PicoMadera();
    }
}

