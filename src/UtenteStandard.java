import java.util.Arrays;
import java.util.Scanner;

public class UtenteStandard extends Utente {
    public int[] stelle= new int[2];
    private int countp;
    private int counts;
    private Prodotto[] listaPref;
    private Utente utente;
    private int s;

    public UtenteStandard(String nomeU, avatar avatar, censura censura, int pin) {
        super(nomeU, avatar, censura, pin);
    }
    public void sStelle(int num){
        System.out.println("Quante stelle dai a: "+listaPref[num].getTitolo()+"? (max 5 stelle)");
        Scanner inn = new Scanner(System.in);
        s = inn.nextInt();
        stelle[num]=s;
        counts++;
    }

    public int getStelle() {
        return stelle[0];
    }

    public void setListaPref(Film[] listaPref) {
        this.listaPref = listaPref;
    }

    public void LaMiaLista(Prodotto prodotto, Prodotto prodotto2){


            Prodotto[] films = {prodotto, prodotto2};
            this.listaPref = films;
    }
    public String Valutazioni(){
        return listaPref[0].getTitolo()+" "+stelle[0]+" stelle" +
                "\n"+listaPref[1].getTitolo()+" "+stelle[1]+" stelle";
    }

    public Prodotto[] getListaPref() {
        return listaPref;
    }

    @Override
    public String toString() {
        return "UtenteStandard{" +
                "stelle=" + Arrays.toString(stelle) +
                ", countp=" + countp +
                ", counts=" + counts +
                ", listaPref=" + Arrays.toString(listaPref) +
                ", utente=" + utente +
                ", s=" + s +
                '}';
    }
}
