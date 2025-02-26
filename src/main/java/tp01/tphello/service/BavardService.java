package tp01.tphello.service;

import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class BavardService {
    
    private String nom = "Je suis un bavard";
    
    public String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void parler() {
        String message = nom + " - Classe: " + this.getClass().getSimpleName();
        System.out.println(message);
    }
    
    public String parlerString() {
        return nom + " - Classe: " + this.getClass().getSimpleName();
    }
    
    @PostConstruct
    private void postConstruct() {
        System.out.println("Le BavardService a été initialisé avec succès!");
    }
}
