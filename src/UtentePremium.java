public class UtentePremium extends UtenteStandard{

    public UtentePremium(String nomeU, avatar avatar, censura censura, int pin) {
        super(nomeU, avatar, censura, pin);
    }
    public void GeneriA(Prodotto[] prodottos){
        int count = 0;
        for (int i = 0; i < prodottos.length; i++) {
            if (prodottos[i].getGenere()== genere.AZIONE){


                System.out.println(prodottos[count].getTitolo());
                count++;

            }
        }

    }


}
