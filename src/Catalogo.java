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

    public Prodotto[] Prefe(UtentePremium utente,UtentePremium utente2){
        Prodotto[] prefe = new Prodotto[3];
        for (int i = 0; i < utente.getListaPref().length; i++)
            for (int j = 0; j < utente2.getListaPref().length; j++)
                if (utente.getListaPref()[i].getTitolo() == utente2.getListaPref()[i].getTitolo()||utente.getStelle()>3&&utente2.getStelle()>3){
                    Lista preflist1 =new Lista(utente);

                    prefe[i] = utente.getListaPref()[i];
                }
        return prefe;


    }


    @Override
    public String toString() {
        return "Catalogo{" +
                "prodottos=" + Arrays.toString(prodottos) +
                ", consigli=" + Arrays.toString(consigli) +
                '}';
    }
}
