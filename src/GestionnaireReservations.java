import java.util.List;
import java.util.ArrayList;

class GestionnaireReservations {
    private List<Spectacle>spectacles;
    private List<Reservation> reservations;


    public GestionnaireReservations() {
        spectacles = new ArrayList<>();
        reservations = new ArrayList<>();
    }
    public void ajouterSpectacle(Spectacle spectacle) {
        spectacles.add(spectacle);
    }

    public void reserverPlaces(Spectacle spectacle, String nomSpectateur, int nombrePlaces) {
        Reservation reservation = new Reservation(nomSpectateur, nombrePlaces);
        reservation.setSpectacle(spectacle);
        reservations.add(reservation);
    }

    public void afficherDetailsReservations() {
        for (Reservation reservation : reservations) {
            String nomSpectateur = reservation.getNomSpectateur();
            int nombrePlaces = reservation.getNombrePlaces();
            Spectacle spectacle = reservation.getSpectacle();
            String nomSpectacle = spectacle.getNomSpectacle();

            System.out.println("Réservation effectuée : " + nomSpectateur + " a réservé " + nombrePlaces + " place(s) pour le spectacle " + nomSpectacle);
        }

        System.out.println();

        for (Reservation reservation : reservations) {
            String nomSpectateur = reservation.getNomSpectateur();
            int nombrePlaces = reservation.getNombrePlaces();

            System.out.println("Spectateur : " + nomSpectateur);
            System.out.println("Nombre de places : " + nombrePlaces);
            System.out.println();
        }
    }
}