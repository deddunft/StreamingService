public class Profilo {
    private String email;
    private String password;
    private Offerte offerte;
    private Utente utente;
    private Utente utente2;


    public Profilo(String email, String password, Offerte offerte,Utente utente) {
        this.email = email;
        this.password = password;
        this.offerte = offerte;
        this.utente= utente;

    }
    public Profilo(String email, String password, Offerte offerte,Utente utente,Utente utente2) {
        this.email = email;
        this.password = password;
        this.offerte = offerte;
        this.utente= utente;
        this.utente2=utente2;

    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Offerte getOfferte() {
        return offerte;
    }

    private void setOfferte(Offerte offerte) {
        this.offerte = offerte;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }





}
