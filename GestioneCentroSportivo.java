import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class GestioneCentroSportivo {

	private HashMap<String, Socio> s;
	private HashMap<String, Istruttore> i;
	
	public GestioneCentroSportivo() {
		this.s= new HashMap();
		this.i= new HashMap();
	}
	
	public boolean aggiungiSocio(String nome, String cognome, String codiceSocio) {
		if(s.containsKey(codiceSocio)) {
			return false;
		}else {
			Socio socio= new Socio(nome, cognome, codiceSocio);
			s.put(codiceSocio, socio);
			return true;
		}
	}
	
	public boolean aggiungiIstruttore(String nome, String cognome, String codiceIstruttore) {
		if(i.containsKey(codiceIstruttore)) {
			return false;
		}else {
			Istruttore is= new Istruttore(nome, cognome, codiceIstruttore);
			i.put(codiceIstruttore, is);
			return true;
		}
	}
	
	public Socio getSocio(String codiceSocio) {
		if(s.containsKey(codiceSocio)) {
			return s.get(codiceSocio);
		}else {
			return null;
		}
	}
	
	public Istruttore getIstruttore(String codiceIstruttore) {
		if(i.containsKey(codiceIstruttore)) {
			return i.get(codiceIstruttore);
		}else {
			return null;
		}
	}
	
	public boolean rimuoviSocio(String codiceSocio) {
		if(s.containsKey(codiceSocio)) {
			s.remove(codiceSocio);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean rimuoviIstruttore(String codiceIstruttore) {
		if(i.containsKey(codiceIstruttore)) {
			i.remove(codiceIstruttore);
			return true;
		}else {
			return false;
		}
	}
	
	
	/*public boolean AssegnaIstruttore(String codiceSocio, String codiceIstruttore) {
		if(!s.containsKey(codiceSocio) ||!i.containsKey(codiceIstruttore ) ) {
			return false;
		}else {
			Socio so= s.get(codiceSocio);
			Istruttore ist= i.get(codiceIstruttore);
			so.setCodiceIstruttore(codiceIstruttore);
			ist.
		}
	}*/
	
	// rimuovi assegnazione
	
	
	
	public void caricaDati(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                switch(parts[0]) {
                
                case "socio" :
                	 aggiungiSocio(parts[1], parts[2], parts[3]);
                	break;
                	
                case "istruttore":
                	 aggiungiIstruttore(parts[1], parts[2], parts[3]);
                	break;
                }
                
            }
        }
	}
	
	public void salvaDati(String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
        	for(int j=0; j<s.size(); j++) {
        		writer.write(" socio " + s.toString());
        }
        	for(int j=0; j<i.size(); j++) {
        		writer.write(" istruttore " + i.toString());
        }
	}
        }
	
}
