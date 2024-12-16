class Socio {
    private String nome;
    private String cognome;
    private String codiceSocio;

    public Socio(String nome, String cognome, String codiceSocio) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceSocio = codiceSocio;
    }

    public String getCodiceSocio() {
        return codiceSocio;
    }
    

    public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setCodiceSocio(String codiceSocio) {
		this.codiceSocio = codiceSocio;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	@Override
    public String toString() {
        return nome + " " + cognome + " (Codice: " + codiceSocio + ")";
    }
}
