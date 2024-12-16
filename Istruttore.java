class Istruttore {
    private String nome;
    private String cognome;
    private String codiceIstruttore;

    public Istruttore(String nome, String cognome, String codiceIstruttore) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceIstruttore = codiceIstruttore;
    }

    public String getCodiceIstruttore() {
        return codiceIstruttore;
    }

    
    public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}
	

	public void setCodiceIstruttore(String codiceIstruttore) {
		this.codiceIstruttore = codiceIstruttore;
	}

	@Override
    public String toString() {
        return nome + " " + cognome + " (Codice: " + codiceIstruttore + ")";
    }
}
