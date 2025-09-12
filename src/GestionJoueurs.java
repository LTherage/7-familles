import java.util.ArrayList;
import java.util.List;

public class GestionJoueurs {
    // Classe gestion des joueurs.
    private List<Joueur> joueurs;
    private final int MAX_JOUEURS;

    public GestionJoueurs(int maxJoueurs) {
        this.joueurs = new ArrayList<>();
        this.MAX_JOUEURS = maxJoueurs;
    }

    /**
     * Ajouter joueur boolean.
     *
     * @param joueur the joueur
     * @return the boolean
     */
    public boolean ajouterJoueur(Joueur joueur) {
        if (joueurs.size() >= MAX_JOUEURS) {
            System.out.println("Nombre maximum de joueurs atteint.");
            return false;
        }

        for (Joueur j : joueurs) {
            if (j.getPrenom().equalsIgnoreCase(joueur.getPrenom())
                    && j.getNomFamille().equalsIgnoreCase(joueur.getNomFamille())) {
                System.out.println("Un joueur avec ce prénom et ce nom de famille existe déjà.");
                return false;
            }
        }

        joueurs.add(joueur);
        System.out.println("Joueur ajouté : " + joueur.getPrenom() + " " + joueur.getNomFamille());
        return true;
    }

    /**
     * Supprimer joueur boolean.
     *
     * @param joueur the joueur
     * @return the boolean
     */
    public boolean supprimerJoueur(Joueur joueur) {
        // Supprimer un joueur par prénom et nom de famille.
        if (joueurs.isEmpty()) {
            System.out.println("Aucun joueur à supprimer.");
            return false;
        }

        boolean supprime = joueurs.removeIf(j -> j.getPrenom().equalsIgnoreCase(joueur.getPrenom())
                && j.getNomFamille().equalsIgnoreCase(joueur.getNomFamille()));

        if (supprime) {
            System.out.println("Joueur supprimé : " + joueur.getPrenom() + " " + joueur.getNomFamille());
            return true;
        } else {
            System.out.println("Le joueur à supprimer n'existe pas.");
            return false;
        }
    }

    /**
     * Gets joueurs.
     *
     * @return the joueurs
     */
    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void afficherJoueurs() {
        if (joueurs.isEmpty()) {
            System.out.println("Aucun joueur enregistré.");
        } else {
            System.out.println("Liste des joueurs :");
            for (Joueur joueur : joueurs) {
                System.out.println("- " + joueur.getPrenom() + " " + joueur.getNomFamille());
            }
        }
    }
}
