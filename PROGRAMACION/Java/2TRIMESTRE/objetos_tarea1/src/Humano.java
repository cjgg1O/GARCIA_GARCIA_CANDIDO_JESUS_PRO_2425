public class Humano {
    int brazos, piernas, ojos, narizes, bocas;
    String nombre, sexo, caballo, preferenciaWiskey;

    public Humano() {
        piernas = 2;
        brazos = 2;
        bocas = 1;
        narizes = 1;
        ojos = 2;
    }

    public Humano(String nombre) {
        this.nombre = nombre;
    }

    public void setPiernas(int piernas) {
        this.piernas = piernas;
    }

    public void setBrazos(int brazos) {
        this.brazos = brazos;
    }

    public void setBocas(int bocas) {
        this.bocas = bocas;
    }

    public void setNarizes(int narizes) {
        this.narizes = narizes;
    }

    public void setOjos(int ojos) {
        this.ojos = ojos;
    }

    public int getPiernas() {
        return piernas;
    }

    public int getBrazos() {
        return brazos;
    }

    public int getBocas() {
        return bocas;
    }

    public int getNarizes() {
        return narizes;
    }

    public int getOjos() {
        return ojos;
    }
}
