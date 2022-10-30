public class acount {
    private String name;
    private String owner;
    private String iban;
    private String bic;
    private String kontonummer;
    private String bankleitzahl;
    private String bankname;
    private String bankadresse;

    public acount(String name, String owner, String iban, String bic, String kontonummer, String bankleitzahl, String bankname, String bankadresse) {
        this.name = name;
        this.owner = owner;
        this.iban = iban;
        this.bic = bic;
        this.kontonummer = kontonummer;
        this.bankleitzahl = bankleitzahl;
        this.bankname = bankname;
        this.bankadresse = bankadresse;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }
    public String getBic() {
        return bic;
    }
    public void setBic(String bic) {
        this.bic = bic;
    }
    public String getKontonummer() {
        return kontonummer;
    }
    public void setKontonummer(String kontonummer) {
        this.kontonummer = kontonummer;
    }
    public String getBankleitzahl() {
        return bankleitzahl;
    }
    public void setBankleitzahl(String bankleitzahl) {
        this.bankleitzahl = bankleitzahl;
    }
    public String getBankname() {
        return bankname;
    }

}
