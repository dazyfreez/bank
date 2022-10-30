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
}
