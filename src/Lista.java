import java.util.Arrays;
import java.util.Scanner;

public class Lista {
    public int[] stelle= new int[2];
    private int countp;
    private int counts;
    private Prodotto[] listaPref;
    private Utente utente;
    private int s;

    public Lista(Utente utente) {
        this.utente=utente;
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
        if (utente.getCensura()== censura.FAMILY) {

            Prodotto[] films = {prodotto, prodotto2};
            this.listaPref = films;
        }

    }
    public String Valutazioni(){
        return listaPref[0].getTitolo()+" "+stelle[0]+" stelle" +
                "\n"+listaPref[1].getTitolo()+" "+stelle[1]+" stelle";
    }






}
