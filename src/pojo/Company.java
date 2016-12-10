package pojo;

import java.io.Serializable;

/**
 * Created by ninoslav.jaric on 10-Dec-16.
 */
public class Company implements Serializable {
        private int PrivrednoDrustvoId;
        private int PredmetId;
        private String StatusPoslovniSubjekatOpis;
        private String PoslovnoIme;
        private String Sjediste;
        private String PreteznaDjelatnost;
        private String OdgovornoLice;
        private String Osnivaci;
        private String SkracenoPoslovnoIme;
        private String MBS;
        private String MB;
        private String JIB;
        private String PIB;
        private String Email;
        private String Telefon;
        private String PoslovneJedinice;
        private String Fax;

    public int getPrivrednoDrustvoId() {
        return PrivrednoDrustvoId;
    }

    public void setPrivrednoDrustvoId(int privrednoDrustvoId) {
        PrivrednoDrustvoId = privrednoDrustvoId;
    }

    public int getPredmetId() {
        return PredmetId;
    }

    public void setPredmetId(int predmetId) {
        PredmetId = predmetId;
    }

    public String getStatusPoslovniSubjekatOpis() {
        return StatusPoslovniSubjekatOpis;
    }

    public void setStatusPoslovniSubjekatOpis(String statusPoslovniSubjekatOpis) {
        StatusPoslovniSubjekatOpis = statusPoslovniSubjekatOpis;
    }

    public String getPoslovnoIme() {
        return PoslovnoIme;
    }

    public void setPoslovnoIme(String poslovnoIme) {
        PoslovnoIme = poslovnoIme;
    }

    public String getSjediste() {
        return Sjediste;
    }

    public void setSjediste(String sjediste) {
        Sjediste = sjediste;
    }

    public String getPreteznaDjelatnost() {
        return PreteznaDjelatnost;
    }

    public void setPreteznaDjelatnost(String preteznaDjelatnost) {
        PreteznaDjelatnost = preteznaDjelatnost;
    }

    public String getOdgovornoLice() {
        return OdgovornoLice;
    }

    public void setOdgovornoLice(String odgovornoLice) {
        OdgovornoLice = odgovornoLice;
    }

    public String getOsnivaci() {
        return Osnivaci;
    }

    public void setOsnivaci(String osnivaci) {
        Osnivaci = osnivaci;
    }

    public String getSkracenoPoslovnoIme() {
        return SkracenoPoslovnoIme;
    }

    public void setSkracenoPoslovnoIme(String skracenoPoslovnoIme) {
        SkracenoPoslovnoIme = skracenoPoslovnoIme;
    }

    public String getMBS() {
        return MBS;
    }

    public void setMBS(String MBS) {
        this.MBS = MBS;
    }

    public String getMB() {
        return MB;
    }

    public void setMB(String MB) {
        this.MB = MB;
    }

    public String getJIB() {
        return JIB;
    }

    public void setJIB(String JIB) {
        this.JIB = JIB;
    }

    public String getPIB() {
        return PIB;
    }

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefon() {
        return Telefon;
    }

    public void setTelefon(String telefon) {
        Telefon = telefon;
    }

    public String getPoslovneJedinice() {
        return PoslovneJedinice;
    }

    public void setPoslovneJedinice(String poslovneJedinice) {
        PoslovneJedinice = poslovneJedinice;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }
}
