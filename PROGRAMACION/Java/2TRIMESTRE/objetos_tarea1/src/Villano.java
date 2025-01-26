public class Villano extends Humano {
    String colorBigote, colorSombrero, aspecto;
    int ebriedad, damiselasSecuestradas;

    public Villano() {
        aspecto = "malo";
        ebriedad = 0;
        damiselasSecuestradas = 0;
    }



    public void secuestrarDama() {
        damiselasSecuestradas++;
    }

    public void beberWiskey() {
        ebriedad++;
    }

    public String getColorBigote() {
        return colorBigote;
    }

    public String getColorSombrero() {
        return colorSombrero;
    }

    public void setColorSombrero(String colorSombrero) {
        this.colorSombrero = colorSombrero;
    }

    public String getAspecto() {
        return aspecto;
    }

    public void setAspecto(String aspecto) {
        this.aspecto = aspecto;
    }

    public int getEbriedad() {
        return ebriedad;
    }

    public void setEbriedad(int ebriedad) {
        this.ebriedad = ebriedad;
    }

    public int getDamiselasSecuestradas() {
        return damiselasSecuestradas;
    }

    public void setDamiselasSecuestradas(int damiselasSecuestradas) {
        this.damiselasSecuestradas = damiselasSecuestradas;
    }
}