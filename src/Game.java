import java.util.Scanner;

public class Game {
    private Joueur joueur;
    private Scanner scanner;

    public Game() {
        scanner = new Scanner(System.in);
    }

    public void démarrerJeu() {
        demanderNomJoueur();

        while (true) {
            afficherEtatJeu();
            if (conditionFinJeu()) {
                afficherMessageFinJeu();
                break;
            }

        }

        scanner.close();
    }

    private void demanderNomJoueur() {
        System.out.print("Entrez le nom du joueur : ");
        String nomJoueur = scanner.nextLine();
        this.joueur = new Joueur(nomJoueur);
    }

    private void afficherEtatJeu() {
        // Afficher l'état actuel du jeu
        System.out.println("État du jeu :");
        // Afficher des informations sur le joueur
        System.out.println("Joueur : " + joueur.getNom());
        System.out.println("Ressources disponibles : " + joueur.getCoffre());

    }

    private boolean conditionFinJeu() {
        // Vérifier si le joueur n'a pas pu nourrir aucune unité
        for (Unite unite : joueur.getUnites()) {
            if (!unite.estNourrie(joueur)) {
                return true; // Il y a au moins une unité non nourrie, le jeu se termine
            }
        }

        return false; // Toutes les unités sont nourries, le jeu continue
    }

    private void afficherMessageFinJeu() {
        // Afficher le message de fin de jeu
        System.out.println("Le jeu est terminé !");
    }
}

