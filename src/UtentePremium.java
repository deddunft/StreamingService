public class UtentePremium extends Utente{
    public UtentePremium(String nomeU, avatar avatar, censura censura, int pin) {
        super(nomeU, avatar, censura, pin);
    }
    public void GeneriA(Prodotto[] prodottos){
        for (int i = 0; i < prodottos.length; i++) {
            if (prodottos[i].getGenere()== genere.AZIONE){

                System.out.println(prodottos[i].getTitolo());

            }
        }

    }
}
