import java.util.Arrays;

public class Utente {

    private String nomeU;
    private avatar avatar;
    private censura censura;
    private int pin;

    private int[] stellePref;

    public Utente (String nomeU, avatar avatar, censura censura, int pin) {
        this.nomeU = nomeU;
        this.avatar = avatar;
        this.censura = censura;
        this.pin = pin;
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


    @Override
    public String toString() {
        return "Utente{" +
                "nomeU='" + nomeU + '\'' +
                ", avatar=" + avatar +
                ", censura=" + censura +
                ", pin=" + pin +
                ", stellePref=" + Arrays.toString(stellePref) +
                '}';
    }
}
