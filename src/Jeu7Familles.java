import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

/**
 * The type Jeu 7 familles.
 */
public class Jeu7Familles extends JFrame {
    // Classe du jeu des 7 familles avec Swing.
    private final String[] familles = {"Animaux", "Couleurs", "Fruits", "Pays", "Sports", "Métiers", "Musique"};
    private final String[][] cartes = {
            {"Lion", "Tigre", "Éléphant", "Girafe"},
            {"Rouge", "Bleu", "Vert", "Jaune"},
            {"Pomme", "Banane", "Orange", "Fraise"},
            {"France", "Espagne", "Italie", "Brésil"},
            {"Football", "Basketball", "Tennis", "Natation"},
            {"Médecin", "Ingénieur", "Professeur", "Pompier"},
            {"Guitare", "Piano", "Batterie", "Violoncelle"}
    };
    private final Color[] couleursFamilles = {
            new Color(255, 200, 200), // Animaux : rose clair
            new Color(200, 255, 200), // Couleurs : vert clair
            new Color(255, 255, 200), // Fruits : jaune clair
            new Color(200, 200, 255), // Pays : bleu clair
            new Color(255, 220, 180), // Sports : orange clair
            new Color(220, 200, 255), // Métiers : violet clair
            new Color(180, 255, 255)  // Musique : cyan clair
    };

    private final List<String> deck = new ArrayList<>();
    private final List<String> playerHand = new ArrayList<>();
    private final List<String> computerHand = new ArrayList<>();
    private final Set<String> playerCompletedFamilies = new HashSet<>();
    private final Set<String> computerCompletedFamilies = new HashSet<>();

    private JTextArea gameLog;
    private JPanel playerHandPanel;
    private JButton askButton;

    /**
     * Instantiates a new Jeu 7 familles.
     */
    public Jeu7Familles() {
        setTitle("Jeu des 7 Familles");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        for (int i = 0; i < familles.length; i++) {
            for (String carte : cartes[i]) {
                deck.add(familles[i] + ": " + carte);
            }
        }
        Collections.shuffle(deck);

        for (int i = 0; i < 8; i++) {
            playerHand.add(deck.remove(0));
            computerHand.add(deck.remove(0));
        }

        gameLog = new JTextArea();
        gameLog.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(gameLog);
        add(scrollPane, BorderLayout.CENTER);

        playerHandPanel = new JPanel();
        playerHandPanel.setLayout(new FlowLayout());
        add(playerHandPanel, BorderLayout.NORTH);

        askButton = new JButton("Choisir une carte à demander");
        askButton.addActionListener(e -> afficherOptionsCartes());
        add(askButton, BorderLayout.SOUTH);

        afficherMain();
        afficherMessage("Bienvenue dans le jeu des 7 familles !");
    }

    private void afficherOptionsCartes() {
        if (playerHand.isEmpty()) return;

        String[] options = playerHand.toArray(new String[0]);
        String carteDemandee = (String) JOptionPane.showInputDialog(this, "Choisissez une carte à demander :", "Demande de carte", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (carteDemandee != null) {
            demanderCarte(carteDemandee);
        }
    }

    private void demanderCarte(String carteDemandee) {
        boolean trouvee = false;
        for (Iterator<String> it = computerHand.iterator(); it.hasNext(); ) {
            String carte = it.next();
            if (carte.equalsIgnoreCase(carteDemandee)) {
                playerHand.add(carte);
                it.remove();
                afficherMessage("Vous avez récupéré : " + carte);
                trouvee = true;
                break;
            }
        }

        if (!trouvee) {
            afficherMessage("La carte n'est pas dans la main de l'ordinateur. Vous piochez.");
            piocherCarte(playerHand);
        }

        verifierFamilleComplete(playerHand, playerCompletedFamilies, "Vous");
        afficherMain();
        verifierFinDuJeu();

        if (askButton.isEnabled()) {
            tourOrdinateur();
        }
    }

    private void piocherCarte(List<String> main) {
        if (!deck.isEmpty()) {
            String carte = deck.remove(0);
            main.add(carte);
            afficherMessage("Carte piochée : " + carte);
        } else {
            afficherMessage("Il n'y a plus de cartes à piocher.");
        }
    }

    private void tourOrdinateur() {
        if (computerHand.isEmpty()) return;

        String carteDemandee = computerHand.get(new Random().nextInt(computerHand.size()));

        afficherMessage("L'ordinateur vous demande : " + carteDemandee);

        boolean trouvee = false;
        for (Iterator<String> it = playerHand.iterator(); it.hasNext(); ) {
            String carte = it.next();
            if (carte.equalsIgnoreCase(carteDemandee)) {
                computerHand.add(carte);
                it.remove();
                afficherMessage("Vous donnez la carte : " + carte);
                trouvee = true;
                break;
            }
        }

        if (!trouvee) {
            afficherMessage("Vous n'avez pas cette carte. L'ordinateur pioche.");
            piocherCarte(computerHand);
        }

        verifierFamilleComplete(computerHand, computerCompletedFamilies, "Ordinateur");
        afficherMain();
        verifierFinDuJeu();
    }

    private void verifierFamilleComplete(List<String> main, Set<String> famillesCompletes, String joueur) {
        Map<String, Integer> compteur = new HashMap<>();

        for (String carte : main) {
            String famille = carte.split(": ")[0];
            compteur.put(famille, compteur.getOrDefault(famille, 0) + 1);
        }

        for (String famille : compteur.keySet()) {
            if (compteur.get(famille) == 4 && !famillesCompletes.contains(famille)) {
                famillesCompletes.add(famille);
                afficherMessage(joueur + " a complété la famille : " + famille);

                // Retirer les cartes de la main
                main.removeIf(carte -> carte.startsWith(famille + ": "));
            }
        }
    }

    private void verifierFinDuJeu() {
        if (deck.isEmpty() || (playerHand.isEmpty() && computerHand.isEmpty())) {
            afficherMessage("Fin de la partie !");
            afficherMessage("Familles complétées par vous : " + playerCompletedFamilies);
            afficherMessage("Familles complétées par l'ordinateur : " + computerCompletedFamilies);

            if (playerCompletedFamilies.size() > computerCompletedFamilies.size()) {
                afficherMessage("Vous avez gagné !");
            } else if (playerCompletedFamilies.size() < computerCompletedFamilies.size()) {
                afficherMessage("L'ordinateur a gagné !");
            } else {
                afficherMessage("Match nul !");
            }

            askButton.setEnabled(false);
        }
    }

    private void afficherMain() {
        playerHandPanel.removeAll();
        for (String carte : playerHand) {
            String famille = carte.split(": ")[0];
            int indexFamille = Arrays.asList(familles).indexOf(famille);

            JButton boutonCarte = new JButton(carte);
            boutonCarte.setBackground(couleursFamilles[indexFamille]);
            boutonCarte.setOpaque(true);
            boutonCarte.setBorderPainted(true);
            boutonCarte.addActionListener(e -> demanderCarte(carte));

            playerHandPanel.add(boutonCarte);
        }
        playerHandPanel.revalidate();
        playerHandPanel.repaint();

    }

    private void afficherMessage(String message) {
        gameLog.append(message + "\n");
    }
    // affichage du message dans le jeu
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Jeu7Familles jeu = new Jeu7Familles();
            jeu.setVisible(true);
        });
    }
}
