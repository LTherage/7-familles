import java.util.*;

/**
 * The type Joueur.
 */
public class Joueur {
    private String prenom, nomFamille, nationalite;
    private int age;
    private List<String> main;
    private Set<String> famillesCompletes;

    /**
     * Instantiates a new Joueur.
     *
     * @param prenom      the prenom
     * @param nomFamille  the nom famille
     * @param age         the age
     * @param nationalite the nationalite
     */
    public Joueur(String prenom, String nomFamille, int age, String nationalite) {
        // Ma classe Joueur.
        this.prenom = prenom;
        this.nomFamille = nomFamille;
        this.age = age;
        this.nationalite = nationalite;
        this.main = new ArrayList<>();
        this.famillesCompletes = new HashSet<>();
    }

    /**
     * Gets prenom.
     *
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Gets nom famille.
     *
     * @return the nom famille
     */
    public String getNomFamille() {
        return nomFamille;
    }

    /**
     * Gets age joueur.
     *
     * @return the age joueur
     */
    public int getAgeJoueur() {
        return age;
    }

    /**
     * Gets nationalite.
     *
     * @return the nationalite
     */
    public String getNationalite() {
        return nationalite;
    }

    /**
     * Gets main.
     *
     * @return the main
     */
    public List<String> getMain() {
        return main;
    }

    /**
     * Gets familles completes.
     *
     * @return the familles completes
     */
    public Set<String> getFamillesCompletes() {
        return famillesCompletes;
    }

    /**
     * Ajouter carte.
     *
     * @param carte the carte
     */
    public void ajouterCarte(String carte) {
        main.add(carte);
    }

    /**
     * Retirer carte.
     *
     * @param carte the carte
     */
    public void retirerCarte(String carte) {
        main.remove(carte);
    }

    /**
     * Choisir carte aleatoire string.
     *
     * @return the string
     */
    public String choisirCarteAleatoire() {
        // Choisir une carte aléatoire dans la main du joueur.
        Random rand = new Random();
        return main.get(rand.nextInt(main.size()));
    }

    /**
     * Ajouter famille complete.
     *
     * @param famille the famille
     */
    public void ajouterFamilleComplete(String famille) {
        famillesCompletes.add(famille);
    }

    /**
     * Sets age.
     *
     * @param a the a
     */
    public void setAge(int a) {
        if (a < 0) {
            System.out.println("Impossible : Un âge ne peut être négatif");
        } else if (a > 0 && a < 5) {
            System.out.println("Le joueur aura sûrement du mal à jouer : Aidez-le !");
            this.age = a;
        } else {
            this.age = a;
            System.out.println("L'âge du joueur a été changé");
        }
    }
}

