import java.util.Arrays;

public class Catalogo {
    private Prodotto[] prodottos;
    private Prodotto[] consigli = new Prodotto[5];


    public Catalogo(Prodotto[] prodottos) {
        this.prodottos = prodottos;
    }

    public Prodotto[] getProdottos() {
        return prodottos;
    }
    public Prodotto[] listaConsigio(UtenteStandard utente){
        int count = 0;
        for (int i = 0; i <utente.getListaPref().length ; i++) {
            if (utente.getListaPref()[i].getGenere()==prodottos[i].getGenere()  && prodottos[i] instanceof Film ) {
                consigli[count]= prodottos[i];

                count++;
            }
        }

        return consigli;

    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "prodottos=" + Arrays.toString(prodottos) +
                ", consigli=" + Arrays.toString(consigli) +
                '}';
    }
}
