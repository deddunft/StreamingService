public abstract class Prodotto {

    private String titolo;
    private int anno;
    private genere genere;
    private int pg;
    private Profilo profilo;
    private Utente utente;

    public Prodotto(String titolo, int anno, genere genere, int pg) {

        this.titolo = titolo;
        this.anno = anno;
        this.genere = genere;
        this.pg = pg;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public genere getGenere() {
        return genere;
    }

    public void setGenere(genere genere) {
        this.genere = genere;
    }

    public int getPg() {
        return pg;
    }

    public void setPg(int pg) {
        this.pg = pg;
    }











}
