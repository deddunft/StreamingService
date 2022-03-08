import java.util.Arrays;

public class Serie extends Prodotto {
    private int epsn;
    private int stagn;




    public Serie(String titolo, int anno, genere genere, int pg,int stag,int eps) {
        super(titolo, anno, genere, pg);
        this.stagn = stag;
        this.epsn= eps;


    }

    public int getEpsn() {
        return epsn;
    }

    public void setEpsn(int epsn) {
        this.epsn = epsn;
    }

    public int getStagn() {
        return stagn;
    }

    public void setStagn(int stagn) {
        this.stagn = stagn;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "epsn=" + epsn +
                ", stagn=" + stagn +
                '}';
    }
}
