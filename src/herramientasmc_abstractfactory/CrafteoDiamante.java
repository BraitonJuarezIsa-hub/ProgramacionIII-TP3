package herramientasmc_abstractfactory;

public class FabricaDiamante implements FabricaHerramientas {

    @Override
    public Espada crearEspada() {
        return new EspadaDiamante();
    }

    @Override
    public Pico crearPico() {
        return new PicoDiamante();
    }
}
