import java.util.Scanner;

public class Game {
    private Joueur joueur;
    private Carte carte;
    private Scanner scanner;

    public Game() {
        scanner = new Scanner(System.in);
    }

    public void démarrerJeu() {
        demanderNomJoueur();
        this.carte = new Carte(5,5);
        while (conditionFinJeu()) {
            afficherEtatJeu();
            System.out.println("1-deplacer unité");
            System.out.println("2-Recuperer uen ressource");
            Scanner scanner = new Scanner(System.in);
            String reponse = "";
            while(!reponse.equals("1") && !reponse.equals("2")){
                System.out.println("Entrez la réponse (1 ou 2)");
                System.out.flush();
                reponse = scanner.nextLine();
            }
            switch(reponse) {
                case "1":
                    int i=1;
                    System.out.println("choisir une unite");
                    for(Unite untie : joueur.unites){
                        System.out.println(i+"-"+untie.nom);
                        i++;
                    }
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Entrez la réponse");
                    System.out.flush();
                    String reponse2 = scanner.nextLine();
                    System.out.println("choisir le deplacement");
                    System.out.println("1-Haut");
                    System.out.println("2-Bas");
                    System.out.println("3-droite");
                    System.out.println("4-gauche");
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.flush();
                    String reponse3 = scanner.nextLine();
                    int x = joueur.unites.get(Integer.parseInt(reponse2)).positionX;
                    int y = joueur.unites.get(Integer.parseInt(reponse2)).positionY;
                    switch (reponse3){
                        case("1"):
                            joueur.unites.get(Integer.parseInt(reponse2)).seDeplacerHaut(this.carte);
                            break;
                        case("2"):
                            joueur.unites.get(Integer.parseInt(reponse2)).seDeplacerBas(this.carte);
                            break;
                        case("3"):
                            joueur.unites.get(Integer.parseInt(reponse2)).seDeplacerDroite(this.carte);
                            break;
                        case("4"):
                            joueur.unites.get(Integer.parseInt(reponse2)).seDeplacerGauche(this.carte);
                            break;
                    }
                    break;
                case "2":
                    break;
            }
        }
        afficherMessageFinJeu();
        scanner.close();
    }

    private void demanderNomJoueur() {
        System.out.print("Entrez le nom du joueur : ");
        String nomJoueur = scanner.nextLine();
        this.joueur = new Joueur(nomJoueur);
        this.joueur.unites.add(new MineurFactory().createUnite());
        this.joueur.unites.add(new BucheronFactory().createUnite());
        this.joueur.unites.add(new MineurFactory().createUnite());
        this.joueur.unites.add(new PaysanFactory().createUnite());
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

