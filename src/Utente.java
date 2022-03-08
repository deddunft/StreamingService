import java.util.Arrays;

public class Utente {

    private String nomeU;
    private avatar avatar;
    private censura censura;
    private int pin;
    private Film[] listaPref;

    public Utente (String nomeU, avatar avatar, censura censura, int pin) {
        this.nomeU = nomeU;
        this.avatar = avatar;
        this.censura = censura;
        this.pin = pin;
        this.listaPref= new Film[5];
    }

    public String getNomeU() {
        return nomeU;
    }

    public void setNomeU(String nomeU) {
        this.nomeU = nomeU;
    }

    public avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(avatar avatar) {
        this.avatar = avatar;
    }

    public censura getCensura() {
        return censura;
    }

    public void setCensura(censura censura) {
        this.censura = censura;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public Film[] getListaPref() {
        return listaPref;
    }

    public void setListaPref(Film[] listaPref) {
        this.listaPref = listaPref;
    }

    public void LaMiaLista(Film film, Film film2){
        Film[] films = {film,film2};
        this.listaPref = films;



    }


    @Override
    public String toString() {
        return "Utente{" +
                "nomeU='" + nomeU + '\'' +
                ", avatar=" + avatar +
                ", censura=" + censura +
                ", pin=" + pin +
                ", listaPref=" + Arrays.toString(listaPref) +
                '}';
    }
}
