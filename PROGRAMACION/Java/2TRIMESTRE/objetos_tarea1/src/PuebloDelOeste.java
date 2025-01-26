import java.util.ArrayList;

public class PuebloDelOeste {
    int establos, cantinas, comisarios, alborotadores, tiempo;
    String localizacion;

    public PuebloDelOeste() {
        establos = 3;
        tiempo = 1850;
        localizacion = "Oeste de los Estados Unidos";
    }

    public void empadronarHumano(Humano humano) {
        ArrayList<Humano> habitantes = new ArrayList<Humano>();
        habitantes.add(humano);
    }
}
