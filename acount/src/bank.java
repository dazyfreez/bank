public class bank {
    private String bankname;
    private String bankleitzahl;
    private String bankadresse;
    private String banktelefon;
    private String bankemail;
    private String bankkontonummer;

    public bank(String bankname, String bankleitzahl, String bankadresse, String banktelefon, String bankemail, String bankkontonummer) {
        this.bankname = bankname;
        this.bankleitzahl = bankleitzahl;
        this.bankadresse = bankadresse;
        this.banktelefon = banktelefon;
        this.bankemail = bankemail;
        this.bankkontonummer = bankkontonummer;
    }
    public static void main(String[] args) {
        bank bank = new bank("Bankname", "Bankleitzahl", "Bankadresse", "Banktelefon", "Bankemail", "Bankkontonummer");
        System.out.println(bank.getBankname());
        System.out.println(bank.getBankleitzahl());
        System.out.println(bank.getBankadresse());
        System.out.println(bank.getBanktelefon());
        System.out.println(bank.getBankemail());
        System.out.println(bank.getBankkontonummer());
    }
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }
    public String getBankleitzahl() {
        return bankleitzahl;
    }
    public void setBankleitzahl(String bankleitzahl) {
        this.bankleitzahl = bankleitzahl;
    }
    public String getBankadresse() {
        return bankadresse;
    }
    public void setBankadresse(String bankadresse) {
        this.bankadresse = bankadresse;
    }
    public String getBanktelefon() {
        return banktelefon;
    }
    public void setBanktelefon(String banktelefon) {
        this.banktelefon = banktelefon;
    }
    public String getBankemail() {
        return bankemail;
    }
    public void setBankemail(String bankemail) {
        this.bankemail = bankemail;
    }
    public String getBankkontonummer() {
        return bankkontonummer;
    }
    public void setBankkontonummer(String bankkontonummer) {
        this.bankkontonummer = bankkontonummer;
    }
    public String getBankname() {
        return bankname;
    }
    public void überweisung(String empfänger, String betrag) {
        System.out.println("Überweisung an " + empfänger + " in Höhe von " + betrag + "€");
    }
    public String toString() {
        return "Bankname: " + bankname + "
}
