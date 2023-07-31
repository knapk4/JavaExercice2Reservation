// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        GestionnaireReservations gestionnaire = new GestionnaireReservations();

        Spectacle theatre = new Theatre("Le Roi Lion", "25 juin 2023", "Salle1");
        gestionnaire.ajouterSpectacle(theatre);

        Spectacle concert = new Concert("Concert de Coldplay", "15 juillet 2023", "Salle 2");
        gestionnaire.ajouterSpectacle(concert);

        gestionnaire.reserverPlaces(theatre, "Alice", 2);
        gestionnaire.reserverPlaces(concert, "Bob", 4);

        gestionnaire.afficherDetailsReservations();
    }
}