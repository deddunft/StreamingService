import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Utente nino= new Utente ("nino",avatar.GALLINA,censura.FAMILY,1234);
        Utente gino =new Utente("Gino", avatar.GATTO, censura.FAMILY,0202);
        Utente pino = new Utente("Pino", avatar.GALLINA, censura.HARDCORE,0123);

        Profilo deddu = new Profilo("deddu@deddu.it","ASD",Offerte.BASIC,nino);
        Profilo nevio = new Profilo("kikku@mail.it","zampa",Offerte.SUPERSTAR,gino,pino);

        Film ReLeone = new Film("Re Leone",1998,genere.ANIMAZIONE,5);
        Film Matrix = new Film("Matrix",2002,genere.AZIONE,16);

        Serie BreakingBad = new Serie("Breaking bad",2015,genere.AZIONE,18,3,10);

        nino.LaMiaLista(ReLeone, Matrix);

        System.out.println(Arrays.toString(nino.getListaPref()));






    }
}
