import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Utente nino= new Utente ("nino",avatar.GALLINA,censura.KID,1234);
        Utente gino =new Utente("Gino", avatar.GATTO, censura.FAMILY,0202);
        Utente pino = new Utente("Pino", avatar.GALLINA, censura.HARDCORE,0123);

        Profilo deddu = new Profilo("deddu@deddu.it","ASD",Offerte.BASIC,nino);
        Profilo fulvo = new Profilo("kikku@mail.it","zampa",Offerte.SUPERSTAR,gino,pino);

        Film ReLeone = new Film("Re Leone",1998,genere.ANIMAZIONE,5);
        Film Matrix = new Film("Matrix",2002,genere.AZIONE,16);
        Film EvaVsSelen = new Film("Eva vs Selen",2003,genere.HARD,18);
        Film Shrek = new Film("Shrek",2005,genere.ANIMAZIONE,05);
        Film Porta = new Film("Non Aprite Quella Porta",2012,genere.HORROR,18);
        Film sqaurto = new Film("Squarato",2020,genere.HORROR,18);

        Serie BreakingBad = new Serie("Breaking bad",2015,genere.AZIONE,18,3,10);
        UtenteStandard fulvio = new UtenteStandard("fulvio",avatar.ORSETTO,censura.HARDCORE,1423);
        fulvio.LaMiaLista(Matrix,BreakingBad);
        fulvio.sStelle(0);
        fulvio.sStelle(1);
        System.out.println(fulvio.Valutazioni());
        UtentePremium lino = new UtentePremium("Loffio",avatar.ORSETTO,censura.HARDCORE,1234);
        UtentePremium roger = new UtentePremium("Roger",avatar.CANE,censura.FAMILY,4586);

        Prodotto[] catalogolino = {ReLeone};
        Prodotto[] catt = {Shrek,Matrix,Porta,EvaVsSelen};
        lino.LaMiaLista(ReLeone,Porta);
        roger.LaMiaLista(EvaVsSelen,sqaurto);
        Catalogo cat1 = new Catalogo(lino.getListaPref());
        System.out.println(Arrays.toString(cat1.listaConsigio(lino)));
        Catalogo cat2 = new Catalogo(roger.getListaPref());
        System.out.println(Arrays.toString(cat2.Prefe(roger,lino)));













    }
}
